package Loops;

public class Practice2 {
    public static void main(String[] args) {
        /*
        Print out "I am here today"
        for the ages from 23 to 26
        before 23 and after 26 print --> "I am not here"
         */

        int age = 23;

        System.out.println("I am not here");


        while (age <= 26) {

            System.out.println("I am here");
            age++;
        }

        System.out.println("I am not here");

        // Print out numbers between 10 to 20;

        int number = 10;

        while (number <= 20) {

            System.out.println(number);
            number++; // it does not have to be at the end all the time, we can put even before the code
        }

    }
}
