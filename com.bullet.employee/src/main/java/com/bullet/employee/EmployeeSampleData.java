package com.bullet.employee;

import static com.bullet.person.Gender.MALE;
import static com.bullet.employee.strategy.FixedOrPercent.FIXED;
import static com.bullet.employee.strategy.FixedOrPercent.PERCENTAGE;
import static com.bullet.employee.strategy.PreOrPost.POSTTAX;
import static com.bullet.employee.strategy.PreOrPost.PRETAX;
import static com.bullet.employee.strategy.Qualify.YES;
import static com.bullet.employee.strategy.Qualify.NO;


import com.bullet.employee.strategy.*;
import com.bullet.person.Gender;
import com.bullet.person.MyDate;

public class EmployeeSampleData {
    public static void main(String[] args) {

        // CREATE EMPLOYEE OBJECT
        Employee employee = new Employee("Admin","Support");
        System.out.println("Name:   " + employee);

        /************        EMPLOYEE DETAILS  **************/

        EmployeePaymentDetails employee_details = new EmployeePaymentDetails(employee);


        Gender gender = MALE;
        employee.setEmployeeGender(gender);
        //System.out.println(employee.getEmployeeGender());
        System.out.println("Gender: " + employee.getEmployeeGender());

        // create two date objects
        MyDate date = new MyDate(1968, 10, 13);
        MyDate date1 = new MyDate(1988, 03, 04);

        // date joined
        employee_details.setDateJoined(date1);
        String date_joined = employee_details.getDateJoined().toString();
        System.out.println("Date Joined: " + date_joined);

        // departmant
        employee_details.setDepartment("Admin");
        String employee_department = employee_details.getDepartment();
        System.out.println("Department: " + employee_details.getDepartment());

        // email
        //employee_details.setEmail("admin@support.com");
        //String employee_email = employee_details.getEmail();
        //System.out.println("Email: " + employee_email);

        // date of birth
        employee.getPerson().setDateOfBirth(date);
        MyDate dob = employee.getPerson().getDateOfBirth();
        System.out.println("Date of birth: " + dob);


        /***********  END EMPLOYEE DETAILS  **********/



        /************    DEDUCTION OBJECTS   **********   */

        // create a deduction object
        Deduction paye = new Deduction("PAYE-(INCOME TAX)");
        paye.setDescription("INCOME TAX");
        paye.setFixedOrPercent(PERCENTAGE);
        paye.setPreOrPostTax(POSTTAX);
        paye.setDeductionId(1);

        // PSMAS
        Deduction psmas = new Deduction("PSMAS-(MEDICAL AID)");
        psmas.setDescription("MEDICAL AID");
        psmas.setFixedOrPercent(FIXED);
        psmas.setPreOrPostTax(PRETAX);
        psmas.setDeductionId(2);

        // NYARADZO
        Deduction nyaradzo = new Deduction("NYARADZO-(FUNERAL ASSURANCE)");
        nyaradzo.setDescription("FUNERAL ASSURANCE");
        nyaradzo.setFixedOrPercent(FIXED);
        nyaradzo.setPreOrPostTax(PRETAX);
        nyaradzo.setDeductionId(3);

        // ZIMNAT LIFE
        Deduction zimnat = new Deduction("ZIMNAT-(LIFE ASSURANCE)");
        zimnat.setDescription("LIFE ASSURANCE");
        zimnat.setFixedOrPercent(FIXED);
        zimnat.setPreOrPostTax(PRETAX);
        zimnat.setDeductionId(4);

        // AIDS_LEVY
        Deduction aids_levy = new Deduction("AIDS_LEVY");
        aids_levy.setDescription("AIDS_LEVY");
        aids_levy.setFixedOrPercent(FixedOrPercent.PERCENTAGE);
        aids_levy.setPreOrPostTax(POSTTAX);
        aids_levy.setDeductionId(5);


        // NEC
        Deduction nec = new Deduction("NEC");
        nec.setDescription("NEC");
        nec.setFixedOrPercent(PERCENTAGE);
        nec.setPreOrPostTax(POSTTAX);
        nec.setDeductionId(6);

        // CHILD SUPPORT
        Deduction childSupport = new Deduction("CHILD SUPPORT");
        childSupport.setDescription("CHILD SUPPORT");
        childSupport.setFixedOrPercent(FIXED);
        childSupport.setPreOrPostTax(POSTTAX);
        childSupport.setDeductionId(7);



        // UNION FEES
        Deduction unionFees = new Deduction("UNION FEES");
        unionFees.setDescription("UNION FEES");
        unionFees.setFixedOrPercent(PERCENTAGE);
        unionFees.setPreOrPostTax(POSTTAX);
        unionFees.setDeductionId(8);

/***********    END  OF DEDUCTION OBJETCS   ********************/

/*************** PAYROLL ADMINISTRATION     ********************/

        /**********  EMPLOYEE DEDUCTIONS  *****/


        // get first deduction - PAYEE
        EmployeeDeductions payee_deduction = new EmployeeDeductions(employee);
        payee_deduction.setId(1);
        payee_deduction.setEmployeeId(employee.getEmployeeID());
        payee_deduction.setDeductionId(1);
        payee_deduction.setPayrollDate(new MyDate(1988, 03, 31));/**/payee_deduction.getBaseAmount();      //need to be calculated- pretax earnings
        payee_deduction.getBaseAmount();/* TODO*/
        payee_deduction.setAmount(0);
        payee_deduction.setPercent(45);
        payee_deduction.setBaseAmount(1000); /* TODO */
        payee_deduction.setIsQualify(YES);

        // second deduction
        EmployeeDeductions psmasDeduction = new EmployeeDeductions(employee);
        psmasDeduction.setId(2);
        psmasDeduction.setEmployeeId(employee.getEmployeeID());
        psmasDeduction.setDeductionId(2);
        psmasDeduction.setPayrollDate(new MyDate(1988, 03, 31));
        psmasDeduction.getBaseAmount();      //need to be calculated- pretax earnings
        psmasDeduction.setAmount(15);
        psmasDeduction.setPercent(0);
        payee_deduction.setBaseAmount(0); /* TODO */
        psmasDeduction.setIsQualify(YES);


        // get third deduction - NYARADZO
        EmployeeDeductions nyaradzoDeduction = new EmployeeDeductions(employee);
        nyaradzoDeduction.setId(3);
        nyaradzoDeduction.setEmployeeId(employee.getEmployeeID());
        nyaradzoDeduction.setDeductionId(3);
        nyaradzoDeduction.setPayrollDate(new MyDate(1988, 03, 31));/**/payee_deduction.getBaseAmount();      //need to be calculated- pretax earnings
        nyaradzoDeduction.getBaseAmount();/* TODO*/
        nyaradzoDeduction.setAmount(12);
        nyaradzoDeduction.setPercent(0);
        payee_deduction.setBaseAmount(0); /* TODO */
        nyaradzoDeduction.setIsQualify(YES);


        // get fourth deduction - ZIMNAT
        EmployeeDeductions zimnatDeduction = new EmployeeDeductions(employee);
        zimnatDeduction.setId(4);
        zimnatDeduction.setEmployeeId(employee.getEmployeeID());
        zimnatDeduction.setDeductionId(4);
        zimnatDeduction.setPayrollDate(new MyDate(1988, 03, 31));/**/payee_deduction.getBaseAmount();      //need to be calculated- pretax earnings
        zimnatDeduction.getBaseAmount();/* TODO*/
        zimnatDeduction.setAmount(15);
        zimnatDeduction.setPercent(0);
        payee_deduction.setBaseAmount(0); /* TODO */
        zimnatDeduction.setIsQualify(YES);


        // get fifth deduction - AIDS LEVY
        EmployeeDeductions aidsLevy = new EmployeeDeductions(employee);
        aidsLevy.setId(5);
        aidsLevy.setEmployeeId(employee.getEmployeeID());
        aidsLevy.setDeductionId(5);
        aidsLevy.setPayrollDate(new MyDate(1988, 03, 31));/**/payee_deduction.getBaseAmount();      //need to be calculated- pretax earnings
        aidsLevy.getBaseAmount();/* TODO*/
        aidsLevy.setAmount(0);
        aidsLevy.setPercent(0.5f);
        aidsLevy.setBaseAmount(1000); /* TODO */
        aidsLevy.setIsQualify(YES);


        // get sixth deduction - NEC
        EmployeeDeductions necDeduction = new EmployeeDeductions(employee);
        necDeduction.setId(6);
        necDeduction.setEmployeeId(employee.getEmployeeID());
        necDeduction.setDeductionId(6);
        necDeduction.setPayrollDate(new MyDate(1988, 03, 31));/**/payee_deduction.getBaseAmount();      //need to be calculated- pretax earnings
        necDeduction.getBaseAmount();/* TODO*/
        necDeduction.setAmount(0);
        necDeduction.setPercent(1);
        necDeduction.setBaseAmount(1000); /* TODO */
        necDeduction.setIsQualify(YES);


        // get seventh deduction - CHILD SUPPORT
        EmployeeDeductions childSupportDeduction = new EmployeeDeductions(employee);
        childSupportDeduction.setId(7);
        childSupportDeduction.setEmployeeId(employee.getEmployeeID());
        childSupportDeduction.setDeductionId(7);
        childSupportDeduction.setPayrollDate(new MyDate(1988, 03, 31));/**/payee_deduction.getBaseAmount();      //need to be calculated- pretax earnings
        childSupportDeduction.getBaseAmount();/* TODO*/
        childSupportDeduction.setAmount(200);
        childSupportDeduction.setPercent(0);
        childSupportDeduction.setBaseAmount(0); /* TODO */
        childSupportDeduction.setIsQualify(NO);


        // get eighth deduction - UNION FEES
        EmployeeDeductions unionFeesDeduction = new EmployeeDeductions(employee);
        unionFeesDeduction.setId(8);
        unionFeesDeduction.setEmployeeId(employee.getEmployeeID());
        unionFeesDeduction.setDeductionId(8);
        unionFeesDeduction.setPayrollDate(new MyDate(1988, 03, 31));/**/payee_deduction.getBaseAmount();      //need to be calculated- pretax earnings
        unionFeesDeduction.getBaseAmount();/* TODO*/
        unionFeesDeduction.setAmount(0);
        unionFeesDeduction.setPercent(1);
        unionFeesDeduction.setBaseAmount(1000); /* TODO */
        unionFeesDeduction.setIsQualify(YES);

/************* END DEDUCTIONS       ******************/


/**************     BENEFIT OBJECTS    ***********************/

        Benefit bonus = new Benefit();
        bonus.setBenefitId(1);
        bonus.setBenefitName("BONUS");
        bonus.setDescription("BONUS");
        bonus.setFixedOrPercent(PERCENTAGE);/** TODO */

/**************     END BENEFIT OBJECT     **********************/


/**************     BENEFIT CALCULATION     **********************/


        EmployeeBenefits bonusBenefit = new EmployeeBenefits(employee);
        bonusBenefit.setBenefitId(1);
        bonusBenefit.setEmployeeId(employee.getEmployeeID());
        bonusBenefit.setBaseAmount(125);
        bonusBenefit.setPercent(200);
        bonusBenefit.setIsQualify(YES);
        bonusBenefit.setPayrollDate(new MyDate(1988, 03, 31));

/**************     END BENEFIT CALCULATION    ******************/

/**************     PAYROLL DATA        ***********************/

//        PaymentDetails payrollData = new PaymentDetails(employee);
//        payrollData.setPayrollID(1);
//        payrollData.setPayrollDate(payee_deduction.getPayrollDate());
//        payrollData.setDaily_rate(25);
//        float dailyRate = payrollData.getDaily_rate();
//        payrollData.setDays_worked(25);
//        int daysWorked = payrollData.getDays_worked();
//        payrollData.setHourly_rate(0);
//        payrollData.setHours_worked(0);
//        payrollData.setStandardDays(20);
//        float bonusDays = payrollData.getStandardHours();
//
//        System.out.println("Normal Days worked: " + payrollData.getNormalDays());
//












        ;
        //System.out.println("Date of birth: " + employee.);

        /*
        *
        * private MyDate dateOfBirth;
    private Address placeOfBirth;   //still work in progress
    String idNumber;
    MaritalStatus maritalStatus;

        *
        *
        * */

    }
}
