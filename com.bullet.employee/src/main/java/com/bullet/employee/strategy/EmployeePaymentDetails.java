package com.bullet.employee.strategy;

import com.bullet.employee.Employee;
import com.bullet.person.MyDate;

import java.time.LocalDate;


public class EmployeePaymentDetails implements PaymentDetailsInterface{
    /*
        This class handles all the contractual terms and agreement
        between the employer and the employee, as it relates to
        how the employee earnings are determined.
    *
    * */
    private long payrollID;
    private Employee employee;
    private String employeeNumber;
    private String department;
    private String jobTitle;    //position
    private LocalDate dateJoined;
    private String branch;
    private EmployeeGrade grade;
    private Currency currency;
    private PaymentType paymentType;
    private PaymentTypeStrategy paymentTypeStrategy;

    private float hourlyRate;
    private float hoursWorked;
    private float standardHours;    //for determining overtime hours
    private float dailyRate;
    private int daysWorked;
    private int standardDays;   //for determining overtime days
    private double basicSalary;

    public EmployeePaymentDetails() {
        this.employee = new Employee();
    }
    public EmployeePaymentDetails(Employee employee) {
        this.employee = employee;
    }

    /**************     BEGIN GETTER AND SETTER METHODS     ******/

    public long getPayrollID() {
        return payrollID;
    }

    public void setPayrollID(long payrollID) {
        this.payrollID = payrollID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getEmployeeID() {
        return this.employee.getEmployeeID();
    }

    public void setEmployeeID(long employeeID) {
        //TODO deal with the employeeID
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;

    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public EmployeeGrade getGrade() {
        return grade;
    }

    public void setGrade(EmployeeGrade grade) {
        this.grade = grade;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getStandardHours() {
        return standardHours;
    }

    public void setStandardHours(float standardHours) {
        this.standardHours = standardHours;
    }

    public float getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(float dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public int getStandardDays() {
        return standardDays;
    }

    public void setStandardDays(int standardDays) {
        this.standardDays = standardDays;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public PaymentTypeStrategy getPaymentTypeStrategy() {
        return paymentTypeStrategy;
    }

    public void setPaymentTypeStrategy(PaymentTypeStrategy paymentTypeStrategy) {
        this.paymentTypeStrategy = paymentTypeStrategy;
    }

    public void setPaymentTypeStrategy(PaymentType paymentType) {
        switch (paymentType) {
            case MONTHLY -> this.paymentTypeStrategy = new MonthlySalaryStrategy();
            case DAILY -> this.paymentTypeStrategy = new DailySalaryStrategy();
            case HOURLY -> this.paymentTypeStrategy = new HourlySalaryStrategy();
        }
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }



    /**************     END GETTER AND SETTER METHODS     ******/

    /**************     IMPLEMENT INTERFACE METHODS     ******/

    @Override
    public double basicEarnings() {
        return 0;
    }

}


/**************     END IMPLEMENT INTERFACE METHODS     ******/

    //TODO HERE
    //usd_account  ---name, branch, contacts, account number
    //zig_account


    //TODO ENDS HERE





