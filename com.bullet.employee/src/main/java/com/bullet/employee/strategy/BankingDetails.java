package com.bullet.employee.strategy;

import com.bullet.employee.Employee;

public class BankingDetails {
    private Employee employee;
    /*
    * name;account number;account type;branch name;branch number;contact details(person_type-ENUM)
    *
    * the bank account details of an employment for payment purposes
    * */
    private String bankName;
    private String accountNumber;
    private AccountType accountType;    //savings, deposit, clearing
    private String branchName;
    private String branchCode;
    private PersonType contactPerson;

}
