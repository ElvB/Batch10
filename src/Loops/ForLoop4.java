package Loops;

import java.util.Locale;

public class ForLoop4 {
    public static void main(String[] args) {
        // String str = "aB*12345&*!d"
        // count and print out how many letters are there in the string
        // count and print out how many numbers are there in the string
        // count and print out how many other chars are there in the string

        // Может быть на собеседовании это задание!!!!!!!

        String str = "aB*12345&*!d";
        str = str.toLowerCase();
        int letterCounter = 0;
        int numberCounter = 0;
        int charCounter = 0;

        for (int index = 0; index < str.length(); index++) {

            if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
                letterCounter++;
            } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                numberCounter++;
            } else {
                charCounter++;
            }
        }
        System.out.println("There are - " + letterCounter + "  many letters ");
        System.out.println("There are - " + numberCounter + "  many numbers");
        System.out.println("There are - " + charCounter + "  many other chars ");

    }
}
