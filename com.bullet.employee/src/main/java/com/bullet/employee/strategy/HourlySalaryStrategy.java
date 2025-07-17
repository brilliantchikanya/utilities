package com.bullet.employee.strategy;

// HourlySalaryStrategy.java
public class HourlySalaryStrategy implements PaymentTypeStrategy {
    private double hourlyRate;
    private double standardHoursWorked; //TODO this can be greater than standard
                    // hours, which needs to be looked into (overtime)
    private double totalHoursWorked;

    public HourlySalaryStrategy(double hourlyRate, double standardHoursWorked, double totalHoursWorked) {
        this.hourlyRate = hourlyRate;    //default values in the default constructor
        this.standardHoursWorked = standardHoursWorked;
        this.totalHoursWorked = totalHoursWorked;
    }

//    public HourlySalaryStrategy(double hourlyRate, double hoursWorked) {
//        this.hourlyRate = hourlyRate;
//        this.hoursWorked = hoursWorked;
//    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getStandardHoursWorked() {
        return standardHoursWorked;
    }

    public void setStandardHoursWorked(double standardHoursWorked) {
        this.standardHoursWorked = standardHoursWorked;
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    @Override
    public double calculateBasicSalary() {
        return hourlyRate * standardHoursWorked;
    }

    @Override
    public String getPaymentDetails() {
        if(totalHoursWorked == standardHoursWorked) {
            return String.format("Hourly Rate: $%.2f, Hours Worked: %.2f", hourlyRate, totalHoursWorked);
        } else {
            return String.format("Hourly Rate: $%.2f, Total Hours Worked: %.2f, " +
                    "Standard Hours Worked: %.2f", hourlyRate, totalHoursWorked, standardHoursWorked);
        }
    }
}
