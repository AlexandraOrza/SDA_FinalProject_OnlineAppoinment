package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_Id")
    private int addressId;
    @Column(name = "street_Name")
    private String streetName;
    @Column(name = "street_Number")
    private int streetNumber;
    @Column(name = "post_code")
    private int postCode;
    @Column(name = "city")
    private String city;

    public Address() {
    }

    public Address(int addressId, String streetName, int streetNumber, int postCode, String city) {
        this.addressId = addressId;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return streetName + ", " + streetNumber + ", " + postCode + ", " + city;
    }



    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

