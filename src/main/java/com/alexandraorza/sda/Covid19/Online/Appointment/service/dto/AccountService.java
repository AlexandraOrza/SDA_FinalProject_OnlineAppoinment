package com.alexandraorza.sda.Covid19.Online.Appointment.service.dto;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.Account;
import com.alexandraorza.sda.Covid19.Online.Appointment.model.Role;
import com.alexandraorza.sda.Covid19.Online.Appointment.repository.AccountRepository;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.AccountDTO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AccountService implements UserDetailsService {
    public static User delete;
    private AccountRepository accountRepository;
    private final BCryptPasswordEncoder passwordEncode;

    public AccountService(AccountRepository accountRepository, BCryptPasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncode = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Account account = accountRepository.findByEmail(email);
        if(account == null){
            throw new UsernameNotFoundException("Invalid email or password");
        }
        return new User(account.getEmail(),account.getPassword(), new ArrayList<>());
    }

    public  void createAccount(AccountDTO accountDTO){
        Account account = new Account();
        account.setEmail(accountDTO.getEmail());
        account.setPassword(passwordEncode.encode(accountDTO.getPassword()));
        account.setRole(Role.USER);

        accountRepository.save(account);
    }

    public Boolean accountExist(String email) {
        Account accountExisting = accountRepository.findByEmail(email);
        return accountExisting != null;
    }

}
