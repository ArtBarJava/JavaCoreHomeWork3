package org.example.task2;


import lombok.Data;

@Data
public class Employee {

    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "имя = " + name +
                ", зарплата = " + salary + '}';
    }
}
