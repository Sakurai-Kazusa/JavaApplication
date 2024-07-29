package org.sample;

import java.util.List;

public class EmployeeList {
    public static List<Employee> Employees = List.of(
            new Employee(1,"山田太郎"),
            new Employee(2, "佐藤花子"),
            new Employee(3, "鈴木一郎")
    );

    public static Employee getById(int EmployeeId) {
        for (Employee employee : Employees) {
            if (employee.EmployeeId == EmployeeId) {
                return employee;
            }
        }
        throw new IllegalArgumentException("従業員が存在しません。\n");
    }
}