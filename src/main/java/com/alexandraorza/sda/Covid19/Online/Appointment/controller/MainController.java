package com.alexandraorza.sda.Covid19.Online.Appointment.controller;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.TestCenter;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.TestCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    TestCenterService testCenterService;

    @GetMapping("/")
    public String root(Model model) {

        List<TestCenter> testCenterList = testCenterService.getAll();
        model.addAttribute("myTestCenters", testCenterList );

        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/userhome")
    public String userHome() {
        return "user-home";
    }

    @GetMapping("/adminhome")
    public String adminHome() {
        return "admin-home";
    }
}
