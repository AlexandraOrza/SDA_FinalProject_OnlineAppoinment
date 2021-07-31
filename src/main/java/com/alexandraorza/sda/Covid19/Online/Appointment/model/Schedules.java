package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "schedules")
public class Schedules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    @JoinColumn(name = "test_center_Id")
    private TestCenter testCenter;

    @Column(name = "desired_date")
    private Date desiredDate;

    @Column(name = "availability")
    private String availability;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public TestCenter getTestCenter() {
        return testCenter;
    }

    public void setTestCenter(TestCenter testCenter) {
        this.testCenter = testCenter;
    }

    public Date getDesiredDate() {
        return desiredDate;
    }

    public void setDesiredDate(Date desiredDate) {
        this.desiredDate = desiredDate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Schedules{" +
                "Id=" + Id +
                ", testCenter=" + testCenter +
                ", desiredDate=" + desiredDate +
                ", availability='" + availability + '\'' +
                '}';
    }
}
