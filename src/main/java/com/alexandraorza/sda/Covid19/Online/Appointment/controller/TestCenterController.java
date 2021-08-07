package com.alexandraorza.sda.Covid19.Online.Appointment.controller;

import com.alexandraorza.sda.Covid19.Online.Appointment.service.TestCenterService;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.TestCenterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TestCenterController {

    private final TestCenterService testCenterService;

    public TestCenterController(TestCenterService testCenterService) {
        this.testCenterService = testCenterService;
    }

    @GetMapping("/testcenter-list")
    public String showTestCenterListPage(Model model){
        model.addAttribute("testCenters", testCenterService.getAll());
        return "test-center";
    }
    @GetMapping("/add-testcenter")
    public String addTestCenter(Model model){
        model.addAttribute("testcenter", new TestCenterDTO());
        return "add-test-center";
    }
    @PostMapping("/addtestcenter")
    public String saveTestCenter(@ModelAttribute("testcenter")@Valid TestCenterDTO testCenterDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add-test-center";
        }
        testCenterService.save(testCenterDTO);
        return "redirect:/testcenter-list";
    }
}
