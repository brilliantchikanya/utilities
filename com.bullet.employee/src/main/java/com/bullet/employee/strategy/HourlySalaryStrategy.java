package com.bullet.employee.strategy;

// HourlySalaryStrategy.java
public class HourlySalaryStrategy implements PaymentTypeStrategy {
    private double hourlyRate;
    private double hoursWorked; //TODO this can be greater than standard
                    // hours, which needs to be looked into (overtime)

    public HourlySalaryStrategy() {
        this.hourlyRate = 0;    //default values in the default constructor
        this.hoursWorked = 0;
    }

    public HourlySalaryStrategy(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateBasicSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getPaymentDetails() {
        return String.format("Hourly Rate: $%.2f, Hours Worked: %.2f", hourlyRate, hourlyRate);
    }
}
