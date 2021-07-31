package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_Id")
    private int AdminId;

    @Column(name = "admin_Name")
    private String AdminName;

    @OneToOne
    @JoinColumn(name = "account_Id")
    private Account accountId;


    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

}