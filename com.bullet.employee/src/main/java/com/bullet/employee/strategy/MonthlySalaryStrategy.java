package com.bullet.employee.strategy;

// MonthlySalaryStrategy.java
public class MonthlySalaryStrategy implements PaymentTypeStrategy {
    private double monthlySalary;

    public MonthlySalaryStrategy() {
        this.monthlySalary = 0;
    }

    public MonthlySalaryStrategy(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateBasicSalary() {
        return monthlySalary;
    }

    @Override
    public String getPaymentDetails() {
        return String.format("Fixed Monthly Salary: $%.2f", monthlySalary);
    }
}
