package Mentoring;

import java.util.Scanner;

public class HW8Task7 {
    public static void main(String[] args) {
        /*
        Write a Java program to make such a pattern like a pyramid with numbers increased by 1.
        For this task ask user to enter a number of the line.
        Example:
        Please enter line number: 4 .expected output

         */


        Scanner scanner = new Scanner(System.in);
        int allLine = scanner.nextInt();
        int numbersToBePrinted = 0;
        for (int l = 1; l <= allLine; l++) {
            //this loop will repeat line times
            for (int i = 1; i <= l; i++){
                System.out.println(++numbersToBePrinted);
            }
            //this is used for jumping the next line
            System.out.println();
        }

    }


}
