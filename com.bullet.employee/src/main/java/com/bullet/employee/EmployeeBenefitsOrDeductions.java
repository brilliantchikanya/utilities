package com.bullet.employee;

import com.bullet.employee.strategy.Qualify;

import java.time.LocalDate;

public class EmployeeBenefitsOrDeductions {
    protected final long employeeID;    //employeeId, benefitId are the composite keys
    protected LocalDate payrollDate;
    protected double amount;  //fixed amount benefit/deduction
    protected float percent; //%age, if benefit/deduction is calculated as %age of base amount
    protected double baseAmount;  //base on which benefit amount is calculated
    protected Qualify isQualify;  //whether employee qualifies for benefit/deduction or not

    protected EmployeeBenefitsOrDeductions(long employeeID) {
        this.employeeID = employeeID;
    }
    protected EmployeeBenefitsOrDeductions(Employee employee) {
        this.employeeID = employee.getEmployeeID();
    }


    protected long getEmployeeID() {
        return employeeID;
    }

    protected LocalDate getPayrollDate() {
        return payrollDate;
    }

    protected void setPayrollDate(LocalDate payrollDate) {
        this.payrollDate = payrollDate;
    }

    protected double getAmount() {
        return amount;
    }

    protected void setAmount(double amount) {
        this.amount = amount;
    }

    protected float getPercent() {
        return percent;
    }

    protected void setPercent(float percent) {
        this.percent = percent;
    }

    protected double getBaseAmount() {
        return baseAmount;
    }

    protected void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    protected Qualify getIsQualify() {
        return isQualify;
    }

    protected void setIsQualify(Qualify isQualify) {
        this.isQualify = isQualify;
    }

}
