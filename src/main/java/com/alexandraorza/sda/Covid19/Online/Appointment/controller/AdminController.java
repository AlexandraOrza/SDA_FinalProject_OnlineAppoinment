package com.alexandraorza.sda.Covid19.Online.Appointment.controller;

import com.alexandraorza.sda.Covid19.Online.Appointment.service.AdminService;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
}
