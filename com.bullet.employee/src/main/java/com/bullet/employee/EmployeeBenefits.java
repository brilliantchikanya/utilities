package com.bullet.employee;

import com.bullet.employee.strategy.Qualify;
import com.bullet.person.MyDate;

public class EmployeeBenefits implements PayrollInterface{
    //POJO for the benefits table where employee payroll benefits are populated
    private long id;
    Employee employee;
    private long employeeId;
    private long benefitId; //employeeId, benefitId are the composite keys
    private MyDate payrollDate;
    private double amount;  //fixed amount benefit
    private float percent; //%age, if benefit is calculated on base amount
    private double baseAmount;  //base on which benefit amount is calculated
    private Qualify isQualify;  //whether employee qualifies for benefit or not


    public EmployeeBenefits() {
        employee = new Employee();
    }

    public EmployeeBenefits(Employee employee) {
        this.employee = employee;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getEmployeeId() {
        return this.employee.getEmployeeID();
    }

    public void setEmployeeId(long employeeId) {
        this.employee.setEmployeeID(employeeId);
    }

    public long getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(long benefitId) {
        this.benefitId = benefitId;
    }

    public MyDate getPayrollDate() {
        return payrollDate;
    }

    public void setPayrollDate(MyDate payrollDate) {
        this.payrollDate = payrollDate;
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

    @Override
    public double calculate(String employeeId, String benOrDeductionId, MyDate payrollDate) {
        /* this method calculates a particular benefit for an employee for
           a particular payroll day*/
        return 0;
    }
}
