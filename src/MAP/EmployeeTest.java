package MAP;

import java.util.HashMap;
import java.util.TreeMap;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Elvira", "Chicago", 30);
        Employee emp2 = new Employee("Bota", "Paris", 25);
        Employee emp3 = new Employee("Yulia", "New York", 25);
        Employee emp4 = new Employee("Olga", "Milan", 25);

        HashMap<Long, Employee> employees = new HashMap<>();

        employees.put(emp1.id, emp1);
        employees.put(emp2.id, emp2);
        employees.put(emp3.id, emp3);
        employees.put(emp4.id, emp4);

        printNames(employees);
        printId(employees);

    }

    public static void printNames(HashMap<Long, Employee> map1) {
        for (Employee e : map1.values()) {
            System.out.println(e.name);
        }
    }

    public static void printId(HashMap<Long, Employee> map1) {
        System.out.println(map1.keySet());
    }

}
