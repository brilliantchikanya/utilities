package com.bullet.employee;

public class EmployeeDeductions extends EmployeeBenefitsOrDeductions {
    private long employeeDeductionID;
    private long deductionId; //employeeId, deductionId, and payrolldate are the composite keys


    public EmployeeDeductions(long employeeID) {
        super(employeeID);
    }
    public EmployeeDeductions(Employee employee) {
        super(employee.getEmployeeID());
    }

    public long getEmployeeDeductionID() {
        return employeeDeductionID;
    }

    public void setEmployeeDeductionID(long employeeDeductionID) {
        this.employeeDeductionID = employeeDeductionID;
    }

    public long getDeductionId() {
        return deductionId;
    }

    public void setDeductionId(long deductionId) {
        this.deductionId = deductionId;
    }

//    public double calculate(long employeeId, String benOrDeductionId, MyDate payrollDate) {
//        /* this method calculates a particular deduction for an employee for
//           a particular payroll day*/
//        return 0;
//
//    }
}
