package com.bullet.employee;

import com.bullet.person.MyDate;

public interface PayrollInterface {
    /*
        this applies to employee benefits and employee deductions alike
    */
    double calculate(String employeeId, String benOrDeductionId, MyDate payrollDate);
}
