package com.bullet.employee;

public class EmployeePersonalDetails {
    Employee employee;
    private final PersonalDetails personalDetails;

    public EmployeePersonalDetails() {
        this.personalDetails = new PersonalDetails();
    }

    public EmployeePersonalDetails(Employee employee) {
        this();
        this.employee = employee;
        this.personalDetails.setPerson(employee.getPerson());
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEmployeeEmail(String email) {
        this.personalDetails.setEmail(email);
    }

    public String getEmployeeEmail() {
        return this.personalDetails.getEmail();
    }

    public void setEmployeePhoneNumber(String phoneNumber) {
        this.personalDetails.setPhoneNumber(phoneNumber);
    }

    public String getEmployeePhoneNumber() {
        return this.personalDetails.getPhoneNumber();
    }

    @Override
    public String toString() {
        return this.employee.getEmployeeFirstName() +
                ", " + this.employee.getEmployeeLastName() +
                ", " + this.personalDetails.getEmail();
    }

    public static void main(String[] args) {
        Employee emp = new Employee("paul", "chikanya");
        EmployeePersonalDetails epd = new EmployeePersonalDetails(emp);

        System.out.println(epd);
        System.out.println(epd.personalDetails.getPerson());
    }
}
