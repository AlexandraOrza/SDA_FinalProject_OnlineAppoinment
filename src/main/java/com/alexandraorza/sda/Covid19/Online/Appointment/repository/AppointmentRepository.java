package com.alexandraorza.sda.Covid19.Online.Appointment.repository;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment,Long> {

}
