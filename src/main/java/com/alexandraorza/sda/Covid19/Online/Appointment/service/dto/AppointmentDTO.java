package com.alexandraorza.sda.Covid19.Online.Appointment.service.dto;

import com.alexandraorza.sda.Covid19.Online.Appointment.model.TestCenter;


public class AppointmentDTO {
    private Long id;

    private TestCenter testCenter;

    private int cnpOfUser;

    private String addressOfUser;

    private String time;

    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TestCenter getTestCenter() {
        return testCenter;
    }

    public void setTestCenter(TestCenter testCenter) {
        this.testCenter = testCenter;
    }

    public int getCnpOfUser() {
        return cnpOfUser;
    }

    public void setCnpOfUser(int cnpOfUser) {
        this.cnpOfUser = cnpOfUser;
    }

    public String getAddressOfUser() {
        return addressOfUser;
    }

    public void setAddressOfUser(String addressOfUser) {
        this.addressOfUser = addressOfUser;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
