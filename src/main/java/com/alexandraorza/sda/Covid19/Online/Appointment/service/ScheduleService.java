package com.alexandraorza.sda.Covid19.Online.Appointment.service;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.Schedule;
import com.alexandraorza.sda.Covid19.Online.Appointment.repository.ScheduleRepository;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.ScheduleDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<Schedule> getAll(){
        return new ArrayList<Schedule>((Collection<? extends Schedule>) scheduleRepository.findAll());
    }
    public void save(ScheduleDTO scheduleDTO) {
        Schedule schedule = new Schedule();
        schedule.setTestCenter(schedule.getTestCenter());
        schedule.setDate(schedule.getDate());
        schedule.setAvailability(schedule.getAvailability());
        schedule.setId(schedule.getId());
        scheduleRepository.save(schedule);
    }
}
