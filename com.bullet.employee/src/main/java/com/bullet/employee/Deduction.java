package com.bullet.employee;

import com.bullet.employee.strategy.FixedOrPercent;
import com.bullet.employee.strategy.PreOrPost;

public class Deduction {
    // for the deductions table which keeps a list of all
    // deduction types and their criteria

    // the EmployeeDeduction class handles employee related
    // info for calculating the salary deductions. it powers the join table
    private long deductionId;
    private String deductionName;
    private String description;
    private PreOrPost preOrPostTax;
    private FixedOrPercent fixedOrPercent;

    private Deduction() {

    }
    public Deduction(String deductionName) {
        this.deductionName = deductionName;
    }

    public long getDeductionId() {
        return deductionId;
    }

    public void setDeductionId(long deductionId) {
        this.deductionId = deductionId;
    }

    public String getDeductionName() {
        return deductionName;
    }

    public void setDeductionName(String deductionName) {
        this.deductionName = deductionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PreOrPost getPreOrPostTax() {
        return preOrPostTax;
    }

    public void setPreOrPostTax(PreOrPost preOrPostTax) {
        this.preOrPostTax = preOrPostTax;
    }

    public FixedOrPercent getFixedOrPercent() {
        return fixedOrPercent;
    }

    public void setFixedOrPercent(FixedOrPercent fixedOrPercent) {
        this.fixedOrPercent = fixedOrPercent;
    }
}
