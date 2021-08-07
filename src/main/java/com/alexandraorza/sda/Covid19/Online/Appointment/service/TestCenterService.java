package com.alexandraorza.sda.Covid19.Online.Appointment.service;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.TestCenter;
import com.alexandraorza.sda.Covid19.Online.Appointment.repository.TestCenterRepository;
import com.alexandraorza.sda.Covid19.Online.Appointment.service.dto.TestCenterDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class TestCenterService {

    private final TestCenterRepository testCenterRepository;

    public TestCenterService(TestCenterRepository testCenterRepository) {
        this.testCenterRepository = testCenterRepository;
    }

    public List<TestCenter> getAll(){
        return new ArrayList<TestCenter>((Collection<? extends TestCenter>) testCenterRepository.findAll());
    }
    public void save(TestCenterDTO testCenterDTO){ //salvarea in baza de date
        TestCenter testCenter = new TestCenter();
        testCenter.setId(testCenterDTO.getId());
        testCenter.setAddress(testCenterDTO.getAddress());
        testCenter.setName(testCenterDTO.getName());
        testCenter.setEmail(testCenterDTO.getEmail());
        testCenterRepository.save(testCenter);
    }
}
