package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_Id")
    private int appointmentID;
    @Column(name = "test_Center_Id")
    private int testCenterId; // foreign key  Appointments -> Test Center
    @Column(name = "cnp_Of_User")
    private int cnpOfUser;
    @Column(name = "time")
    private String time;
    @Column(name = "date")
    private String date;

    public Appointment(){
    }

    public Appointment(int appointmentID, int testCenterId, int cnpOfUser, String time, String date) {
        this.appointmentID = appointmentID;
        this.testCenterId = testCenterId;
        this.cnpOfUser = cnpOfUser;
        this.time = time;
        this.date = date;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getTestCenterId() {
        return testCenterId;
    }

    public void setTestCenterId(int testCenterId) {
        this.testCenterId = testCenterId;
    }

    public int getCnpOfUser() {
        return cnpOfUser;
    }

    public void setCnpOfUser(int cnpOfUser) {
        this.cnpOfUser = cnpOfUser;
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

    @Override
    public String toString() {
        return "Appointment{" +
                "time=" + time +
                ", date=" + date +
                //    ", location=" + location +
                '}';
    }

}
