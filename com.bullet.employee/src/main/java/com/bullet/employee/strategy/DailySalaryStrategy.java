package com.bullet.employee.strategy;

// DailySalaryStrategy.java
public class DailySalaryStrategy implements PaymentTypeStrategy {
    private double dailyRate;
    // standard days is the stipulated number of days an employee is allowed
    // to work before bonus days can be calculated
    private int standardDaysWorked; //TODO actual days worked, including overtime days worked
    private int totalDaysWorked;


//    public DailySalaryStrategy() {
//        this.dailyRate = 0;
//        this.daysWorked = 0;    //default values
//    }

    public DailySalaryStrategy(double dailyRate, int standardDaysWorked, int totalDaysWorked) {
        this.dailyRate = dailyRate;
        this.standardDaysWorked = standardDaysWorked;
        this.totalDaysWorked = totalDaysWorked;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getStandardDaysWorked() {
        return standardDaysWorked;
    }

    public void setStandardDaysWorked(int standardDaysWorked) {
        this.standardDaysWorked = standardDaysWorked;
    }

    public int getTotalDaysWorked() {
        return totalDaysWorked;
    }

    public void setTotalDaysWorked(int totalDaysWorked) {
        this.totalDaysWorked = totalDaysWorked;
    }

    @Override
    public double calculateBasicSalary() {
        return dailyRate * standardDaysWorked;
    }//TODO cater for overtime days

    // will need to combine this with bonus calculation

    @Override
    public String getPaymentDetails() {
        return String.format("Daily Rate: $%.2f, Total Days Worked: %d," +
                "Standard Days Worked: %d", dailyRate, totalDaysWorked, standardDaysWorked);
    }
}
