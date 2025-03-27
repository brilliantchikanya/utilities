package com.bullet.employee.strategy;

public enum PreOrPost {
    //whether a deduction is before tax or after tax
    PRETAX(true), POSTTAX(false);

    private boolean isPreTax;

    private PreOrPost(boolean isPreTax) {
        this.isPreTax = isPreTax;
    }

    public boolean isPreTax() {
        return isPreTax;
    }
}
