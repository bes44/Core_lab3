package comparator;

/**
 * Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
 * представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 */

import java.time.LocalDate;

public class Employee {
    private String name;
    private int id;
    private LocalDate hireDate;

    public Employee(String name, int id, LocalDate hireDate) {
        this.name = name;
        this.id = id;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public static int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);

        return date1.compareTo(date2);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hireDate=" + hireDate +
                '}';
    }

    public static void main(String[] args) {
        int year1 = 2022, month1 = 5, day1 = 15;
        int year2 = 2023, month2 = 4, day2 = 12;

        int result = compareDates(year1, month1, day1, year2, month2, day2);
        System.out.println("Результат сравнения дат: " + result);
        if (result < 0) {
            System.out.println("Первая дата раньше второй.");
        } else if (result > 0) {
            System.out.println("Первая дата позже второй.");
        } else {
            System.out.println("Обе даты одинаковы.");
        }
    }
}
