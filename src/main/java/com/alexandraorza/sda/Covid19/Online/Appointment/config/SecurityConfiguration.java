package com.alexandraorza.sda.Covid19.Online.Appointment.config;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.Role;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
    @Autowired
    private AccountService accountService;
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
                .antMatchers(
                        "/registration**",
                        "/js/**",
                        "/css/**",
                        "/images/**",
                        "/webjars/**").permitAll()
                .antMatchers("/").permitAll()       // pagini publice
                .antMatchers("/add-testcenter").hasAuthority(Role.ADMIN.name())  //pag admin
                .antMatchers("/appointments").hasAuthority(Role.USER.name()) // pag user
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").successHandler(myAuthenticationSuccessHandler()).permitAll()
                .and()
                .logout().invalidateHttpSession(true).clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login?logout").permitAll();
    }
    @Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler()
    {
        Map<String, String> roleTargetUrlMap = new HashMap<>();
        roleTargetUrlMap.put(Role.USER.name(), "/");
        roleTargetUrlMap.put(Role.ADMIN.name(), "/adminhome");
        return new RoleRedirectAuthenticationSuccessHandler(roleTargetUrlMap);
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public DaoAuthenticationProvider authenticationProvider()
    {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(accountService);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.authenticationProvider(authenticationProvider());
    }
}