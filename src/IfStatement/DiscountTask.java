package IfStatement;

import java.util.Scanner;

public class DiscountTask {
    public static void main(String[] args) {
        /*
        If ur purchase payment is 100 or more u will get 20% discount,
        otherwise u will get 5% discount
        Printout discounted total
         */

        double myPurchase = 80;

        if (myPurchase >= 100) {
            myPurchase -= myPurchase * 0.2;
            System.out.println("Your discount is 20% and you will pay " + myPurchase);
        }
        else {
            myPurchase -= myPurchase * 0.05;
            System.out.println("Your discount after 5% off is " + myPurchase);
        }

    }
}
