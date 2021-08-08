package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;

@Entity
@Table(name = "schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "test_center_Id")
    private TestCenter testCenter;

    @Column(name = "date")
    private String date;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
                ", date='" + date + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
