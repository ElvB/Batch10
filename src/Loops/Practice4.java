package Loops;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        /*
        User has $100
        as long as user has more than $0
        ask user "how much money she/he wants to spend"
        if the amount is less than balance
            update the balance and show it to user
        if the amount is more than the balance
            >> print >> "You don't have enough money in the account! Your balance is ..."
         */

        Scanner scanner = new Scanner(System.in);
        double balance = 100;

        while (balance > 0) {

            System.out.println("How much do you want to spend?");
            double spending = scanner.nextDouble();

            if (spending <= balance) {
                balance -= spending;
                System.out.println("Your new balance is " + balance);
            } else {
                System.out.println("You don't have enough money in the account! Your balance is " + balance);
            }
        }
    }
}



