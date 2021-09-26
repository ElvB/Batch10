package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        /*
        Ask user how many names of people they want to store
        Ask user to give the name
        Store those names in a String array
        print out those names by using toString() method
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many names of people you want to store");
        int size = scanner.nextInt();
        scanner.nextLine();
        String names[] = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter a name");
            names[i] = scanner.next();
        }
        System.out.println(Arrays.toString(names));
    }
}
