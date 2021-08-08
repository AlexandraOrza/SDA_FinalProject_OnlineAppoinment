package com.alexandraorza.sda.Covid19.Online.Appointment.controller;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.Schedule;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.ScheduleService;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.ScheduleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
public class ScheduleController {
    private final ScheduleService scheduleService;

    private static final List<String> HOURS = Arrays.asList("7:00", "17:00");  //de pus

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedule-list")  // de adaugat data ca si parametru si test center ca parametru
    public String showScheduleListPage(Model model){
        model.addAttribute("schedule", scheduleService.getAll());
        return "schedule";
       // Schedule dailySchedule; // =repository.findbyDateAndTestCenter
       // dailySchedule.getAvailability().split("|") //din hours sa elimin tot ce apare in split
        // availability -> 11:15| 10:15
    }
    @GetMapping("/add-schedule")
    public String addSchedule(Model model){
        model.addAttribute("schedule", new ScheduleDTO());
        return "add-schedule";
    }
    @PostMapping("/addschedule")
    public String saveSchedule(@ModelAttribute("schedule")@Valid ScheduleDTO scheduleDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add-schedule";
        }
        scheduleService.save(scheduleDTO);
        return "redirect:/schedule-list";
    }
}
