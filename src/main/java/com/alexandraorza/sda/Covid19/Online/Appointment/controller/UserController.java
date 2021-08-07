package com.alexandraorza.sda.Covid19.Online.Appointment.controller;

import com.alexandraorza.sda.Covid19.Online.Appointment.service.UserService;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user-list")
    public String showUserListPage(Model model){
        model.addAttribute("users", userService.getAll());
        return "user";
    }
    @GetMapping("/add-user")
    public String showPageAddUser(Model model){
        model.addAttribute("user", new UserDTO());
        return "add-user";
    }
    @PostMapping("/add-user")
    public String saveUser(@ModelAttribute("user")@Valid UserDTO userDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add-user";
        }
        userService.save(userDTO);
        return "redirect:/user-list";
    }
}
