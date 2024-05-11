package org.example.task1;

/**
 * Написать прототип компаратора – метод внутри класса сотрудника,
 * сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
 * без использования условного оператора.
 */

public class Task1 {
    public static class Employee {
        int[] date1;
        int[] date2;
        public Employee(int[] date1, int[] date2) {
            this.date1 = date1;
            this.date2 = date2;
        }
        public int compareDates() {
            // Преобразуем даты в числа для сравнения
            int date1InDays = date1[0]*365 + date1[1]*30 + date1[2];
            int date2InDays = date2[0]*365 + date2[1]*30 + date2[2];
            // Используем трюк с разностью для определения знака сравнения
            return (date1InDays - date2InDays) / Math.max(1, Math.abs(date1InDays - date2InDays));
        }
        public static void main(String[] args) {
            int[] date1 = {2022, 7, 20}; // Дата в формате гггг-мм-дд
            int[] date2 = {2022, 6, 20};
            Employee employee = new Employee(date1, date2);
            int result = employee.compareDates();
            if(result < 0) {
                System.out.println("Дата 1 раньше даты 2");
            } else if(result > 0) {
                System.out.println("Дата 1 позже даты 2");
            } else {
                System.out.println("Даты равны");
            }
        }
    }

}