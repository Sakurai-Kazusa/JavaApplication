package org.sample;

public class Employee {
    public int EmployeeId;
    public String EmployeeName;
    public static int NumberOfEmployees;

    public Employee(int EmployeeId, String EmployeeName) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        NumberOfEmployees++;
    }

    public int getEmployeeId() {
        return this.EmployeeId;
    }

    public String getEmployeeName() {
        return this.EmployeeName;
    }

    public static int getNumberOfEmployees() {
        return NumberOfEmployees;
    }
}
