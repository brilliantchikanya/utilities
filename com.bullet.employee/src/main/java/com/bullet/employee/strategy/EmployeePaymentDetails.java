package com.bullet.employee.strategy;

import com.bullet.employee.Employee;


public class EmployeePaymentDetails implements PaymentDetailsInterface{
    /*
        This class handles all the contractual terms and agreement
        between the employer and the employee, as it relates to
        how the employee earnings are determined.
    *
    * */
    private long payrollID;
    private final long employeeID;
    private PaymentType paymentType;
    private PaymentTypeStrategy paymentTypeStrategy;

    private float hourlyRate;
    private float hoursWorked;
    private float standardHours;    //for determining overtime hours
    private float dailyRate;
    private int daysWorked;
    private int standardDays;   //for determining overtime days
    private double basicSalary;

    public EmployeePaymentDetails(long employeeID) {
        this.employeeID = employeeID;
    }
    public EmployeePaymentDetails(Employee employee) {
        this.employeeID = employee.getEmployeeID();
    }

    /**************     BEGIN GETTER AND SETTER METHODS     ******/

    public long getPayrollID() {
        return payrollID;
    }

    public void setPayrollID(long payrollID) {
        this.payrollID = payrollID;
    }


    public long getEmployeeID() {
        return this.employeeID;
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
            case MONTHLY -> this.paymentTypeStrategy = new MonthlySalaryStrategy(basicSalary);
            case DAILY -> this.paymentTypeStrategy = new DailySalaryStrategy(dailyRate, standardDays, daysWorked);
            case HOURLY -> this.paymentTypeStrategy = new HourlySalaryStrategy(hourlyRate, standardHours, hoursWorked);
        }
    }

    public void setBasicSalary(double basicSalary) {
        this.paymentTypeStrategy.calculateBasicSalary();
    }




    /**************     END GETTER AND SETTER METHODS     ******/

    /**************     IMPLEMENT INTERFACE METHODS     ******/

    @Override
    public double basicEarnings() {
        return paymentTypeStrategy.calculateBasicSalary();
    }

}


/**************     END IMPLEMENT INTERFACE METHODS     ******/





