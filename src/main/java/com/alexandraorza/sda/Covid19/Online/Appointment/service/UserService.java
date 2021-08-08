package com.alexandraorza.sda.Covid19.Online.Appointment.service;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.User;
import com.alexandraorza.sda.Covid19.Online.Appointment.repository.UserRepository;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.UserDTO;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.mail.MailService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final MailService mailService;

    public UserService(UserRepository userRepository, MailService mailService) {
        this.userRepository = userRepository;
        this.mailService = mailService;
    }

    public List<User> getAll(){
        return new ArrayList<User>((Collection<? extends User>) userRepository.findAll());
    }

    public void save(UserDTO userDTO){ //salvarea in baza de date

        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setSurname(userDTO.getSurname());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        user.setCnp(userDTO.getCnp());
        user.setAddress(userDTO.getAddress());
        userRepository.save(user);

      //  mailService.sendMail("office@covid.com");
    }
}
