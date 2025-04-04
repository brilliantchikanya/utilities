package com.bullet.employee.strategy;

public enum Qualify {
    // for determining whether an employee qualifies for a deduction or not
    YES(true), NO(false);

    private final boolean isQualified;

    private Qualify(boolean isQualified) {
        this.isQualified = isQualified;
    }

    public boolean isQualified() {
        return isQualified;
    }
}
