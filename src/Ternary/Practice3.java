package Ternary;

import javax.swing.*;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        Ask user their last name
        If the last name starts with 'A' to 'K'
        concat last name with "most popular last name"
        otherwise concat the last name: "well known last name"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your last name");

        String lastName = input.nextLine().toUpperCase();

        String print = lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'K' ? lastName + " most popular last name"
                : lastName + " well known last name";

        System.out.println(print);

        char print1 = lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'K' ? lastName.charAt(0) : lastName.charAt(0);
        System.out.println("first letter " + print1);


    }
}
