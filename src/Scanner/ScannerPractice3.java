package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter full name");

        String fullName = scanner.nextLine();

        System.out.println("Your entered this value "+ fullName);

        System.out.println("Please enter your state");
        char firstLetter = scanner.next().charAt(2); // indexing
                                                    // Illinois --> letter count is /8
                                                    // 01234567 --> index numbers
        System.out.println(firstLetter);



    }
}
