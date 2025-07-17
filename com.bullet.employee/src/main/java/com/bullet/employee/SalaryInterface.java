package com.bullet.employee;

import java.time.LocalDate;

public interface SalaryInterface {

    double basicEarnings(LocalDate payment_date, long employee_id);
    double benefits(LocalDate payment_date, long employee_id);
    double grossEarnings(LocalDate payment_date, long employee_id);
    double pretaxDeductions(LocalDate payment_date, long employee_id);
    double tax(LocalDate payment_date, long employee_id);
    double postTaxEarnings(LocalDate payment_date, long employee_id);
    double postTaxDeductions(LocalDate payment_date, long employee_id);
    double netEarnings(LocalDate payment_date, long employee_id);
    double totalDeductions(LocalDate payment_date, long employee_id);
    double companyLiabilities(LocalDate payment_date, long employee_id);

    /*

    gross pay;net pay;tax;total deductions;total benefits;pretax earnings;
pretax deductions;posttax deductions;posttax earnings;total liabilities;



    * */

}
