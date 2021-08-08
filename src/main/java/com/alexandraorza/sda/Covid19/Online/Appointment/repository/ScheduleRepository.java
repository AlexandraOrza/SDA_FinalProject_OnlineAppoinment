package com.alexandraorza.sda.Covid19.Online.Appointment.repository;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule,Long> {
}
