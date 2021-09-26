package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {
        /*
        user will enter a number
        if the number falls in the range of 0 to 5 --> "your number between 0 -5"
        if the number falls in the range of 6 to 10 --> "your number between 6 -10"
        if the number falls in the range of 11 to 15 --> "your number between 11 -15"
        if the number falls in the range of 16 to 20 --> "your number between 16 -20"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please pick a number between 0 to 20");

        int number = input.nextInt();

        if (number >= 0 && number <= 5) {
            System.out.println("Your number between 0 - 5");
        } else if (number > 5 && number <= 10) {
            System.out.println("Your number between 6 - 10");
        } else if (number > 10 && number <= 15) {
            System.out.println("Your number between 11 - 15");
        } else if (number > 15 && number <= 20) {
            System.out.println("Your number between 16 - 20");
        } else {
            System.out.println("Your number does not fall into any range of 0 - 20");
        }
    }
}
