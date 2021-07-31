package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "acount_role")
    private Role role;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
