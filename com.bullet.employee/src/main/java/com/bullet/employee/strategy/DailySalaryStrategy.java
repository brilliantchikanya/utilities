package com.bullet.employee.strategy;

// DailySalaryStrategy.java
public class DailySalaryStrategy implements PaymentTypeStrategy {
    private double dailyRate;
    private int daysWorked; //TODO actual days worked, including overtime days worked


    public DailySalaryStrategy() {
        this.dailyRate = 0;
        this.daysWorked = 0;    //default values
    }

    public DailySalaryStrategy(double dailyRate, int daysWorked) {
        this.dailyRate = dailyRate;
        this.daysWorked = daysWorked;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    @Override
    public double calculateBasicSalary() {
        return dailyRate * daysWorked;
    }//TODO cater for overtime days

    @Override
    public String getPaymentDetails() {
        return String.format("Daily Rate: $%.2f, Days Worked: %d", dailyRate, daysWorked);
    }
}
