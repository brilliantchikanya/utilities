package com.bullet.employee;


import com.bullet.person.MyDate;

import java.time.LocalDate;

public class SalaryLedger implements SalaryInterface{
    private long salary_id;
    private Employee employee;
    /* This class implements the concept of a payroll ledger, which serves
       as a repository for crucial information, including employee wages,
       salaries, overtime, bonuses, deductions, and tax withholdings.
       It acts as the backbone of the payroll system, by providing a
       framework for organizing and managing all payroll-related resources.
    * */

    private LocalDate payroll_date;            //employee_id and date as composite key

    private double basicEarnings;
    private double benefits;
    private double grossEarnings;
    private double pretaxEarnings;
    private double postTaxEarnings;
    private double pretaxDeductions;
    private double postTaxDeductions;
    private double tax;
    private double totalDeductions;
    private double netEarnings;

//    private long fixed_salary;
//    private float hourly_rate;
//    private int hours_worked;
//    private int days_worked;
//    private float daily_rate;
//    private float overtime_rate;
//    private long gross_salary;
//    private long net_salary;
//    private long deductions;
//    private long benefits;


    public SalaryLedger() {
        employee = new Employee();

    }
    public SalaryLedger(Employee employee, LocalDate payroll_date) {
        this.employee = employee;
        this.payroll_date = payroll_date;
    }


    @Override
    public double basicEarnings(LocalDate payment_date, long employee_id) {
        return 0;
    }

    @Override
    public double benefits(LocalDate payment_date, long employee_id) {
        return 0;
    }

    @Override
    public double grossEarnings(LocalDate payment_dateLocalDate, long employee_id) {
        return 0;
    }

    @Override
    public double pretaxDeductions(LocalDate payment_date, long employee_id) {
        return grossEarnings - pretaxDeductions;
    }

    @Override
    public double tax(LocalDate payment_date, long employee_id) {
        float tax_rate = 0;
        return pretaxEarnings * tax_rate;
    }

    @Override
    public double postTaxEarnings(LocalDate payment_date, long employee_id) {
        return pretaxEarnings - tax;
    }

    @Override
    public double postTaxDeductions(LocalDate payment_date, long employee_id) {
        return 0;
    }

    @Override
    public double netEarnings(LocalDate payment_date, long employee_id) {
        return postTaxEarnings - postTaxDeductions;
    }

    @Override
    public double totalDeductions(LocalDate payment_date, long employee_id) {
        return 0;
    }

    @Override
    public double companyLiabilities(LocalDate payment_date, long employee_id) {
        return 0;
    }
}
