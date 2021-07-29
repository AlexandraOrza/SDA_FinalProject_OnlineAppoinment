package com.alexandraorza.sda.Covid19.Online.Appointment.model;

import javax.persistence.*;


public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auth_role_id;
    private String role_name;


    public int getRoleId() {
        return auth_role_id;
    }

    public void setRoleId(int roleId) {
        this.auth_role_id = roleId;
    }

    public String getRoleName() {
        return role_name;
    }

    public void setRoleName(String roleName) {
        this.role_name = roleName;
    }

}