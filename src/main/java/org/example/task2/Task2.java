package org.example.task2;

/**
 * Опишите класс руководителя, наследник от сотрудника.
 * Перенесите статический метод повышения зарплаты в класс руководителя,
 * модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
 * кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */

public class Task2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Виктор Серов", 3000);
        Employee employee2 = new Employee("Артём Баредов", 2500);
        Manager manager = new Manager("Дмитрий Иванов", 5000);
        Manager manager2 = new Manager("Андрей Иванов", 7000);

        Employee[] employees = {employee1, employee2, manager, manager2};

        System.out.println("До повышения зарплаты:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Manager.increaseSalaryForAllEmployees(employees, 500);
        System.out.println();
        System.out.println("После повышения зарплаты:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
