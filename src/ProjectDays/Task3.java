package ProjectDays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Using a scanner ask a user to provide one int number
        If the number is a prime number --> then print "Prime Number"
        otherwise print it "is not a prime number"
         */
        Scanner scanner = new Scanner(System.in);
        int num = 0, i = 0, count = 0;
        System.out.print("Please enter an integer number");
        num = scanner.nextInt();
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.print("This is a Prime Number");
        } else {
            System.out.print("This is not a Prime Number");
        }
    }
}
