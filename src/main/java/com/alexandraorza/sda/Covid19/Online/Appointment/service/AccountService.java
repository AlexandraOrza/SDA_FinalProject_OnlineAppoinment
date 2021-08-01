package com.alexandraorza.sda.Covid19.Online.Appointment.service;

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
    private final AccountRepository accountRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AccountService(AccountRepository accountRepository, BCryptPasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Account account = accountRepository.findByEmail(email);
        if (account == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return new User(account.getEmail(), account.getPassword(), new ArrayList<>());
    }
    public void createAccount(AccountDTO accountDTO) {
        Account account = new Account();
        account.setEmail(accountDTO.getEmail());
        account.setPassword(passwordEncoder.encode(accountDTO.getPassword()));
        accountRepository.save(account);
    }
    public boolean accountExist(String email) {
        Account accountExist = accountRepository.findByEmail(email);
        return accountExist != null;
    }
}
