package com.alexandraorza.sda.Covid19.Online.Appointment.repository;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
