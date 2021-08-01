package com.alexandraorza.sda.Covid19.Online.Appointment.repository;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByEmail(String email);
}
