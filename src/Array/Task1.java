package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Ask user how many names of people they want to store
        Ask user to give the name
        Store those names in a String array
        - If the name has more than 5 or more letters -> save to an array as longNames
        - If the name has less than 5 letters -> save it to an array as shortNames
        - print out those longNames and shortName arrays by using toString() method
        - print out those names by using toString() method
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many names of people you want to store");
        int size = scanner.nextInt();
        // scanner.nextLine();
        String longNames[] = new String[size];
        String shortNames[] = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter a name");
            String name = scanner.next();
            if (name.length() >= 5) {
                longNames[i] = name;

            } else {
                shortNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));


    }
}
