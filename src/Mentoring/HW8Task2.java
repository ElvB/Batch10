package Mentoring;

import java.util.Scanner;

public class HW8Task2 {
    public static void main(String[] args) {
        /*
        Write a Java program to find the perfect numbers within a given number of range
        Test data:
        Input the starting range or number: 1 Input the ending range of number 50
        Expected Output:
        The perfect numbers within the given range: 6 28
        NOTE: you need to use the nested for loop
        We need to find all divisors of the given number
        Perfect number is the number sum of
         */

        Scanner scanner = new Scanner(System.in);
        int small = scanner.nextInt();
        int big = scanner.nextInt();
        for (int i = small; i <= big; i++){
            // i is the current number we should check if it is perfect
            // this second for loop will find all the divisors

            int sumOfDivisor = 0;
            for (int j = 1; j <i; j++){
                if (i%j==0){
                    sumOfDivisor+=j;
                }
            }
            if (sumOfDivisor==i){
                System.out.println(i + " is the perfect number");
            }
        }


    }
}
