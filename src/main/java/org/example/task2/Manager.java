package org.example.task2;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public static void increaseSalaryForAllEmployees(Employee[] employees, double increaseAmount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                double newSalary = employee.getSalary() + increaseAmount;
                employee.setSalary(newSalary);
            }
        }
    }
}
