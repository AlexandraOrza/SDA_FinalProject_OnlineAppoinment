package com.alexandraorza.sda.Covid19.Online.Appointment.service;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.Appointment;
import com.alexandraorza.sda.Covid19.Online.Appointment.repository.AppointmentRepository;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.AppointmentDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> getAll(){
        return new ArrayList<Appointment>((Collection<? extends Appointment>) appointmentRepository.findAll());
    }
    public void save(AppointmentDTO appointmentDTO){ //salvarea in baza de date

        Appointment appointment = new Appointment();
        appointment.setTestCenter(appointment.getTestCenter());
        appointment.setCnpOfUser(appointment.getCnpOfUser());
        appointment.setAddressOfUser(appointment.getAddressOfUser());
        appointment.setDate(appointment.getDate());
        appointment.setTime(appointment.getTime());

        appointmentRepository.save(appointment);
    }
}
