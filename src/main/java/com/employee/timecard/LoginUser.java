package com.employee.timecard;

import java.util.Objects;

public class LoginUser {
    public LoginUser(){

    }
    private String employeeID;
    private int keyCode;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginUser loginUser = (LoginUser) o;
        return keyCode == loginUser.keyCode && Objects.equals(employeeID, loginUser.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, keyCode);
    }
}
