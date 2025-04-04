package com.bullet.employee;

import com.bullet.employee.strategy.Qualify;
import com.bullet.person.MyDate;

import java.time.LocalDate;

public class EmployeeDeductions implements PayrollInterface{
    //POJO for the deductions table where employee payroll deductions are populated
    private long id;
    Employee employee;
    private long employeeId;
    private long deductionId; //employeeId, deductionId, and payrolldate are the composite keys
    private LocalDate payrollDate;
    private double amount;  //fixed amount deduction, if fixed
    private float percent; //%age, if deduction is calculated on base amount
    private double baseAmount;  //base on which deduction amount is calculated
    private Qualify isQualify;  //whether employee qualifies for deduction or not



    public EmployeeDeductions() {
        employee = new Employee();
    }
    public EmployeeDeductions(Employee employee) {
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public Qualify getIsQualify() {
        return isQualify;
    }

    public void setIsQualify(Qualify isQualify) {
        this.isQualify = isQualify;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getDeductionId() {
        return deductionId;
    }

    public void setDeductionId(long deductionId) {
        this.deductionId = deductionId;
    }

    public LocalDate getPayrollDate() {
        return payrollDate;
    }

    public void setPayrollDate(LocalDate payrollDate) {
        this.payrollDate = payrollDate;
    }

    @Override
    public double calculate(String employeeId, String benOrDeductionId, MyDate payrollDate) {
        /* this method calculates a particular deduction for an employee for
           a particular payroll day*/
        return 0;

    }
}
