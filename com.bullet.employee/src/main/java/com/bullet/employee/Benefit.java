package com.bullet.employee;

import com.bullet.employee.strategy.FixedOrPercent;

public class Benefit {
    private long benefitId;
    private String benefitName;
    private String description;
    private FixedOrPercent fixedOrPercent;

    public Benefit() {
    }

    public long getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(long benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public FixedOrPercent getFixedOrPercent() {
        return fixedOrPercent;
    }

    public void setFixedOrPercent(FixedOrPercent fixedOrPercent) {
        this.fixedOrPercent = fixedOrPercent;
    }
}
