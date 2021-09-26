package Methods;

public class Numbers {
    // Let's write a method to find sum of two integer numbers

    public int findSum(int a, int b) {
        return a + b;

    }

    public static int findDivision(int a, int b) {
        return a / b;
    }
    // in the same class differences for static and non-static

    public static void main(String[] args) {
        // main method is a static method so i should only be able to call static methods or variables
        // findSum(4,5)
        // for to call findSum method we need to create an object inside the static method
        // this object below is a bridge for us to call non static find sum methos
        Numbers numbers = new Numbers();
        numbers.findSum(4, 5);
        // Can i call findDivision with numbers object?
        // If we are calling the static method in the same class
        // we can't call by using object, but we can call when we are outside the class
        // Since findDivision is a static method and I am in the same class I can call by using name

        findDivision(20, 3);
        Numbers.findDivision(30, 4);


    }
}
