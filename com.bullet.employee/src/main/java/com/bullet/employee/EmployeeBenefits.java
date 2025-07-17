package com.bullet.employee;

import com.bullet.person.MyDate;

public class EmployeeBenefits extends EmployeeBenefitsOrDeductions{
    private long employeeBenefitID;
    private long benefitId; //employeeId, benefitId are the composite keys

    public EmployeeBenefits(long employeeID) {
        super(employeeID);
    }
    public EmployeeBenefits(Employee employee) {
        super(employee.getEmployeeID());
    }

    public long getEmployeeBenefitID() {
        return employeeBenefitID;
    }

    public void setEmployeeBenefitID(long id) {
        this.employeeBenefitID = id;
    }

    public long getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(long benefitId) {
        this.benefitId = benefitId;
    }

//    public double calculate(long employeeId, String benOrDeductionId, MyDate payrollDate) {
//        /* this method calculates a particular benefit for an employee for
//           a particular payroll day*/
//        return 0;
//    }
}
