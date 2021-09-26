package Loops;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {

        // Get a positive number from a user which is less than 10
        // Print out the numbers starting from that given number ro 10 is included

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a positive number less than 10");
        int a = scanner.nextInt();
        for (; a <= 10; a++) {
            System.out.println(a);
        }
    }
}
