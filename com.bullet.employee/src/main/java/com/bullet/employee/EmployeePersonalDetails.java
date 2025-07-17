package com.bullet.employee;

import java.time.LocalDate;

public class EmployeePersonalDetails {
    private long employeePersonalDetailsID;
    private final long employeeID;
    private final PersonalDetails personalDetails;
    private LocalDate dateJoined;

    public EmployeePersonalDetails(long employeePersonalDetailsID, long employeeID) {
        this.employeePersonalDetailsID = employeePersonalDetailsID;
        this.employeeID = employeeID;
        this.personalDetails = new PersonalDetails();
    }

    public EmployeePersonalDetails(long employeePersonalDetailsID, Employee employee) {
        this.employeePersonalDetailsID = employeePersonalDetailsID;
        this.employeeID = employee.getEmployeeID();
        this.personalDetails = new PersonalDetails();
        //this.personalDetails.setPerson(employee.getPerson());
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public long getEmployeePersonalDetailsID() {
        return employeePersonalDetailsID;
    }

    public void setEmployeePersonalDetailsID(long employeePersonalDetailsID) {
        this.employeePersonalDetailsID = employeePersonalDetailsID;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }


    @Override
    public String toString() {
        return "EmployeePersonalDetails{" +
                "employeePersonalDetailsID=" + employeePersonalDetailsID +
                ", employeeID=" + employeeID +
                ", dateJoined=" + dateJoined +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee("paul", "chikanya");
        System.out.println(emp.getEmployeeID());
    }
}
