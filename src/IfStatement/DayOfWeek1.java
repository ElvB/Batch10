package IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class DayOfWeek1 {
    public static void main(String[] args) {
        /*
        Enter the first letter of the day
        print:
        M --> It is Monday
        T --> it is Tuesday or Thursday
        W ---> it is Wednesday
        etc.
         */

        Scanner object = new Scanner(System.in);
        System.out.println("Please enter the first letter of the day you wnat to see the full name of: ");

        String firstLetter = object.nextLine();
        if (firstLetter.equalsIgnoreCase("M")) {
            System.out.println("It is Monday");
        }
        if (firstLetter.equalsIgnoreCase("t")) {
            System.out.println("It is Tuesday or Thursday");
        }
        if (firstLetter.equalsIgnoreCase("W")) {
            System.out.println("It is Wednesday");
        }
        if (firstLetter.equalsIgnoreCase("F")) {
            System.out.println("It is Friday");
        }
        if (firstLetter.equalsIgnoreCase("S")) {
            System.out.println("It is either Saturday or Sunday");
        }
        else {
            System.out.println("Your entry is not not valid, there is no day starting with that char");
        }


    }
}
