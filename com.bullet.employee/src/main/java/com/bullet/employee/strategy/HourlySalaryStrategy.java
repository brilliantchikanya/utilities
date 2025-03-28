package com.bullet.employee.strategy;

// HourlySalaryStrategy.java
public class HourlySalaryStrategy implements PaymentTypeStrategy {
    private double hourlyRate;
    private double standardHours; // this must be standard
                    // hours, in case there is overtime worked

    public HourlySalaryStrategy() {}

    public HourlySalaryStrategy(double hourlyRate, double standardHours) {
        this.hourlyRate = hourlyRate;
        this.standardHours = standardHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getStandardHours() {
        return standardHours;
    }

    public void setStandardHours(double standardHours) {
        this.standardHours = standardHours;
    }

    @Override
    public double calculateBasicSalary() {
        return hourlyRate * standardHours;
    }

    @Override
    public String getPaymentDetails() {
        return String.format("Hourly Rate: $%.2f, Hours Worked: %.2f", hourlyRate, standardHours);
    }
}
