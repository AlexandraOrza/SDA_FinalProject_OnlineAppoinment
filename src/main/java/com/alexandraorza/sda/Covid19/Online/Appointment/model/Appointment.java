package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "test_center_id")
    private Long testCenterId;
    @Column(name = "cnp_Of_User")
    private int cnpOfUser;
    @Column(name = "adress_of_user")
    private String addressOfUser;
    @Column(name = "time")
    private String time;
    @Column(name = "date")
    private String date;

    public Appointment(){
    }
    public Appointment(Long ID, int cnpOfUser, String time, String date) {
        this.id = ID;
        this.cnpOfUser = cnpOfUser;
        this.time = time;
        this.date = date;
    }

    public Long getAppointmentID() {
        return id;
    }

    public void setAppointmentID(Long id) {
        this.id = id;
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
