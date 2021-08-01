package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @Column(name = "test_center_id")
    private TestCenter testCenter;

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

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", testCenter=" + testCenter +
                ", cnpOfUser=" + cnpOfUser +
                ", addressOfUser='" + addressOfUser + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
