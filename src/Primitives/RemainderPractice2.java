package Primitives;

public class RemainderPractice2 {

    public static void main(String[] args) {
        // find the product (multiplication total) of digits from a four digit given number
        // print the result as following:
        // "The product is ..."

        int number = 1432;
        int firstDigit = number % 10; // this is first digit --> 2
        number = number / 10; //this is my new number --> 143
        int secondDigit = number % 10; //this is second number --> 3
        number = number / 10;//this is my new number --> 14
        int thirdDigit = number % 10; // this is third digit --> 4
        number = number / 10; //this is my new number --> 1
        int forthDigit = number % 10;// this is forth digit --> 1
        System.out.println("The product is " + (firstDigit * secondDigit * thirdDigit * forthDigit));


    }
}
