package com.alexandraorza.sda.Covid19.Online.Appointment.service;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.User;
import com.alexandraorza.sda.Covid19.Online.Appointment.repository.UserRepository;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll(){
        return new ArrayList<User>((Collection<? extends User>) userRepository.findAll());
    }
    public void save(UserDTO userDTO){ //salvarea in baza de date
        User user = new User();
        user.setCnp(userDTO.getCnp());
        user.setFirstName(userDTO.getFirstName());
        user.setSurname(userDTO.getSurname());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        user.setStatus(userDTO.getStatus());
        user.setAddress(userDTO.getAddress());
        userRepository.save(user);
    }
}
