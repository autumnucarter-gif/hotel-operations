package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;

    }
    public double getRegularHours() {
        if (this.hoursWorked > 40.0) {
            return 40.0;
        }
        return this.hoursWorked;
    }
    public double getOvertimeHours() {
        if (this.hoursWorked > 40.0) {
            return this.hoursWorked - 40.0;
        }
        return 0.0;
    }
    public double getTotalPay() {
        double regularPay = getRegularHours() * this.payRate;
        double overtimePay = getOvertimeHours() * this.payRate;
        return regularPay + overtimePay;
    }
}