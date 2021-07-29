package com.alexandraorza.sda.Covid19.Online.Appointment.model;
import javax.persistence.*;

@Entity
@Table(name = "test_center")
public class TestCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_center_Id")
    private int testCenterId;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;


    public TestCenter() {
    }

    public int getTestCenterId() {
        return testCenterId;
    }

    public void setTestCenterId(int testCenterId) {
        this.testCenterId = testCenterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TestCenter{" +
                "testCenterId=" + testCenterId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

