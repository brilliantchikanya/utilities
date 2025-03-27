package com.bullet.employee.strategy;

public enum FixedOrPercent {
    //payment based on fixed amounts or percentage based
    FIXED(true), PERCENTAGE(false);

    private boolean isFixed;

    private FixedOrPercent(boolean isFixed) {
        this.isFixed = isFixed;
    }

    public boolean isFixed() {
        return isFixed;
    }
}

