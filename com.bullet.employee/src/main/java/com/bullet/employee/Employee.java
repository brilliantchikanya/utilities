package com.bullet.employee;

import com.bullet.names.Name;
import com.bullet.person.Gender;
import com.bullet.person.MyDate;

import java.util.Objects;

public class Employee {
    private int employeeID;
    private Name employeeName;
    private Gender employeeGender;
    private String employeeEmail;
    private String employeePhoneNumber;
    private String employeeDepartment;
    private String jobTitle;
    private int salary;
    private MyDate dateJoined;

    // beginning of constructors
    public Employee(Name employeeName, Gender employeeGender, String employeeDepartment, String jobTitle) {
        this.employeeName = employeeName;
        this.employeeGender = employeeGender;
        this.employeeDepartment = employeeDepartment;
        this.jobTitle = jobTitle;
    }

    public Employee() {

    }// end constructor

    // beginning of getter and setter methods
    public Name getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(Name employeeName) {
        this.employeeName = employeeName;
    }

    public Gender getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(Gender employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(MyDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name=" + employeeName +
                ", Department='" + employeeDepartment + '\'' +
                ", Job Title='" + jobTitle + '\'' +
                ", Salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return employeeID == employee.employeeID && getSalary() == employee.getSalary() && Objects.equals(getEmployeeName(), employee.getEmployeeName()) && getEmployeeGender() == employee.getEmployeeGender() && Objects.equals(getEmployeeDepartment(), employee.getEmployeeDepartment()) && Objects.equals(getJobTitle(), employee.getJobTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, getEmployeeName(), getEmployeeGender(), getEmployeeDepartment(), getJobTitle(), getSalary());
    }
}
