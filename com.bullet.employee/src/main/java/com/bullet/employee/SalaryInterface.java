package com.bullet.employee;

import com.bullet.person.MyDate;

public interface SalaryInterface {

    double basicEarnings(MyDate payment_date, long employee_id);
    double benefits(MyDate payment_date, long employee_id);
    double grossEarnings(MyDate payment_date, long employee_id);
    double pretaxDeductions(MyDate payment_date, long employee_id);
    double tax(MyDate payment_date, long employee_id);
    double postTaxEarnings(MyDate payment_date, long employee_id);
    double postTaxDeductions(MyDate payment_date, long employee_id);
    double netEarnings(MyDate payment_date, long employee_id);
    double totalDeductions(MyDate payment_date, long employee_id);
    double companyLiabilities(MyDate payment_date, long employee_id);

    /*

    gross pay;net pay;tax;total deductions;total benefits;pretax earnings;
pretax deductions;posttax deductions;posttax earnings;total liabilities;



    * */

}
