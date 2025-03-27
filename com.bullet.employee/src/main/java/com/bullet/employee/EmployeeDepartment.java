package com.bullet.employee;

public class EmployeeDepartment {
    private Employee employee;
    //String employeeId;
    String departmentId;
    String jobTitle;
    //EmployeeGrade grade;


    public EmployeeDepartment() {
        employee = new Employee();
        //employeeId = "";
        departmentId = "";
        jobTitle = "";
    }

    public EmployeeDepartment(Employee employee) {
        this.employee = employee;
        //employeeId = "";
        departmentId = "";
        jobTitle = "";
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getEmployeeId() {
        return employee.getEmployeeName();
    }

    public void setEmployeeId(String employeeId) {
        //this.employeeId = employee.getEmployeeName();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
