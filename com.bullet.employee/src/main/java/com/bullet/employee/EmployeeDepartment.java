package com.bullet.employee;

import com.bullet.employee.strategy.EmployeeGrade;

public class EmployeeDepartment {
    long employeeID;
    long departmentID;
    String jobTitle;
    EmployeeGrade grade;


    public EmployeeDepartment(long employeeId, long departmentId, String jobTitle) {
        this.employeeID = employeeId;
        this.departmentID = departmentId;
        jobTitle = jobTitle;
    }

    public EmployeeDepartment(Employee employee, long departmentID, String jobTitle) {
        this.employeeID = employee.getEmployeeID();
        this.departmentID = departmentID;
        jobTitle = jobTitle;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeID = employeeId;
    }

    public long getDepartmentId() {
        return departmentID;
    }

    public void setDepartmentId(long departmentID) {
        this.departmentID = departmentID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public EmployeeGrade getGrade() {
        return grade;
    }

    public void setGrade(EmployeeGrade grade) {
        this.grade = grade;
    }
}
