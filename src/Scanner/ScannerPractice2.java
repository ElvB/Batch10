package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // this is creation of scanner object

        System.out.println("Please enter your name ");
        String name = input.nextLine(); // input.next();

        System.out.println("Your name is " + name);

        System.out.println("Please enter your last name ");

        String lastname = input.nextLine();

        System.out.println("Your full name is " + name+ " " +lastname);

        System.out.println("Please enter your age ");
        int age = input.nextInt();
        System.out.println( "You age will be " + (age+10)+ " in 10 years");
        int ageIn5years = age+5;
        System.out.println("Your age will be " + ageIn5years + " in 5 years");


    }
}
