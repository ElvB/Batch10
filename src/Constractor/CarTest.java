package Constractor;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Lexus");
        Car car2 = new Car("Lexus");
        Car car3 = new Car("Lexus");
        Car car4 = new Car("BMW");

        Car car5 = new Car("BMW");
        Car car6 = new Car("BMW");
        Car car7 = new Car("Lexus");

        car1 = null;
        String str = "Test";
        String str2 = "Test";
        String str3 = new String("Test");
        String str4 = new String("Test");
        System.out.println(car4);
        //System.gc();
        // equals() vs ==

        System.out.println(car2.equals(car3));// false, bc it is two different objects
        System.out.println(car2 == car3); // false, bc it is two different objects

        System.out.println(str.equals(str2));// true, bc it is String
        System.out.println(str == str2);// true, bc it is String
        System.out.println(str.equals(str3)); // true
        System.out.println(str.equals(str4)); // true
        System.out.println(car3.equals(car7)); // false
        System.out.println(car5.equals(car7)); // false
        System.out.println(car5 == car7); // false
        Car car8 = car3;
        System.out.println(car3.equals(car8));// true
    }


}
