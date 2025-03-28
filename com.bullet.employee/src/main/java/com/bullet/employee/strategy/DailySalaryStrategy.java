package com.bullet.employee.strategy;

// DailySalaryStrategy.java
public class DailySalaryStrategy implements PaymentTypeStrategy {
    private double dailyRate;
    private int standardDays; // standard days worked, excluding overtime days


    public DailySalaryStrategy() {}

    public DailySalaryStrategy(double dailyRate, int standardDays) {
        this.dailyRate = dailyRate;
        this.standardDays = standardDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDaysWorked() {
        return standardDays;
    }

    public void setDaysWorked(int standardDays) {
        this.standardDays = standardDays;
    }

    @Override
    public double calculateBasicSalary() {
        return dailyRate * standardDays;
    }

    @Override
    public String getPaymentDetails() {
        return String.format("Daily Rate: $%.2f, Days Worked: %d", dailyRate, standardDays);
    }
}
