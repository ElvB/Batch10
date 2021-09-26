package Constractor;

public class Car {
    /*
    create a car class with instance field of brand of the car
    create one move method to simply print out "car is moving"
    create a constructor to initialize instance variables
    create a test class to test this car class
    inside the test class create multiple objects
    sent some objects to garbage
    call garbage collector
    make sure gc() is working
     */

    String brand;

    public void move() {
        System.out.println("Car is moving ");
    }

    public Car() {

    }

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() { // it is method Overriding
        return "the brand of the car is: " + brand;
    }

    @Override
    protected void finalize() { // it is method Overriding
        System.out.println("car is going to garbage");
    }
}

