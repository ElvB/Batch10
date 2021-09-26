package Methods;

public class Math {
    // create a method that will add two integer numbers and show the sum

    public void sum(int a, int b) {
        int sum = a + b;

        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
    public int sum1(int a, int b, int c) {

        int sum1 = a + b + c;

        System.out.println("The sum of " + a + " and " + b + " is " + sum1);
        return sum1;
    }
        // create a method that will take String parameter for name of the operation
        // and another two other parameters as integer data type
        // this method will print the result according to the provided operation

    public void operation(String operation, int a, int b) {

        switch (operation) {
            case "add":
                System.out.println("The sum is: " + (a + b));
                break;
            case "subtract":
                System.out.println("The difference is: " + (a - b));
                break;
            case "multiply":
                System.out.println("The product is: " + (a * b));
                break;
            case "divide":
                System.out.println("The division is: " + (a / b));
                break;
            case "remainder":
                System.out.println("The remainder is: " + (a % b));
                break;
            default:
                System.out.println("The operation name should be: add, subtract, multiply, divide, remainder");
        }
    }
}
