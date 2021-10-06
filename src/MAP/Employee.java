package MAP;

import java.util.Random;

public class Employee {
    String name;
    String city;
    int age;
    long id;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = generateId();
    }

    public long generateId() {
        Random random = new Random();
        // int x = (int)(Math.random()*1_000_000)
        long newId = 0;
        int digit;

        for (int i = 0; i < 5; i++) {

            digit = random.nextInt(10);
            newId += digit;
            newId *= 10;
        }
        return newId;
    }
}

