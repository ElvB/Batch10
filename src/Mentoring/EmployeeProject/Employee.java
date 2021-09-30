package Mentoring.EmployeeProject;

import java.time.LocalDate;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double taxCalculation() {
        if (salary > 1000) {
            return salary * 0.03;
        }
        return 0.0;

    }

    public double bonusCalculation() {
        int extraHours = workHours - 40;
        if (extraHours > 0) {
            return extraHours * 30;
        }
        return 0.0;
    }

    public double increaseSalary() {
        LocalDate date = LocalDate.now();
        int year = date.getYear() - hireYear;
        if (year < 10) {
            return salary * 0.05;
        } else if (9 < year && year < 20) {
            return salary * 0.1;

        } else {
            return salary * 0.15;
        }
    }

    public void information() {
        System.out.println("Name " + name + " ,Salary is " + salary + " ,work hours " + workHours + " , hire date " + hireYear +
                " ,tax " + taxCalculation() + "$" + " ,bonus " + bonusCalculation() + " ,raise of salary " + increaseSalary());
        double totalSalary = (salary - taxCalculation() + bonusCalculation());
        System.out.println("Total salary with tax and bonus " + totalSalary);
        System.out.println("Total salary with increased salary " + (salary + increaseSalary()));
    }
}

