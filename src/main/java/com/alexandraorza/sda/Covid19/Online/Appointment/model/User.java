package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cnp")
    private int cnp;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "password")
    private String password;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "status")
    private String status;

    @Column(name = "address_Id")
    private int addressId; // foreign key in table Users

    public User(int cnp, String firstName, String surname, String password, String dateOfBirth, int addressId) {
        this.cnp = cnp;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.addressId = addressId;
    }


    public User(){
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCNP() {
        return cnp;
    }
    public void setCNP(int CNP) {
        this.cnp = CNP;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    public int getAddressId() {
        return addressId;
    }
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }


    @Override
    public String toString() {
        return "User{" +
                "cnp=" + cnp +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", status='" + status + '\'' +
                ", addressId=" + addressId +
                '}';
    }
}
