package IfStatement;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {
        /*
        ASsk user to provide a number btwn 1 to 7
        if user enters:
        1--> print >> it is Monday
        2 --> print >> it is Tuesday
        etc.
        7--> print >> it is Sunday
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7");

        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("it is Monday");
        }
        if (number == 2) {
            System.out.println("it is Tuesday");
        }
        if (number == 3) {
            System.out.println("it is Wednesday");
        }
        if (number == 4) {
            System.out.println("it is Thursday");
        }
        if (number == 5) {
            System.out.println("it is Friday");
        }
        if (number == 6) {
            System.out.println("it is Saturday");
        }
        if (number == 7) {
            System.out.println("it is Sunday");
        }
    }
}