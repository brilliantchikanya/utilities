package com.bullet.employee.strategy;

/*
 *  the bank account details of an employment for payment purposes
 * */

public class BankingDetails {
    private long bankingDetailsID;
    private long employeeID;
    private String bankName;
    private String accountNumber;
    private AccountType accountType;    //savings, deposit, clearing
    private String branchName;
    private String branchCode;
    private PersonType contactPerson;

    public BankingDetails(long employeeID, String bankName, String accountNumber, String branchName) {
        this.employeeID = employeeID;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.branchName = branchName;
    }

    public long getBankingDetailsID() {
        return bankingDetailsID;
    }

    public void setBankingDetailsID(long bankingDetailsID) {
        this.bankingDetailsID = bankingDetailsID;
    }

    public PersonType getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(PersonType contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }
}
