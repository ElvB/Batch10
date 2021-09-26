package IfStatement;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {
        /* Ask user to enter an integer value,
        if the number is even number,
        print:
        "your number is even"
        otherwise print:
        "your number is odd"  */
        Scanner usersNumber = new Scanner(System.in);
        System.out.println("Please enter an integer value");

        int a = usersNumber.nextInt();
        if (a % 2 == 0) {
            System.out.println("your number is even");
        }
        else {
            System.out.println("your number is odd");
        }
    }
}

