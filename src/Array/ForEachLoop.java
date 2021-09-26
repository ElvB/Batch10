package Array;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] colors = {"Red", "Yellow", "brown", "Blue", "White", "Orange", "Green", "Pink", "Violet", "Black"};

        // for each loop --> it will start from beginning og the array and go to the end of it
        for (String color : colors) {
            System.out.println(color.toUpperCase());

        }
        int[] ids = {9, 5, 8, 23, 45, 12, 50, 30, 100, 11};
        //use foe each loop to print these elements from int array

        for (int idPrint : ids) {
            System.out.println(idPrint);
        }
        System.out.println("==========================");
        // print only numbers that 50 or greater
        for (int id : ids) {
            if (id >= 50) {
                System.out.println(id);
            }
        }
        char[] characters = {'g', '1', 5, '$', '*', 'A', 'H'};

        //print only letters from char array

        for (char letters : characters) {

            if ((letters >= 'A' && letters <= 'Z') || (letters >= 'a' && letters <= 'z')) {
                System.out.println(letters);
            }
        }
        System.out.println("===========================");

        for (char ch : characters) {

            if (Character.isAlphabetic(ch)) { // prints only letters
                System.out.println(ch);
            }
        }
        for (char ch : characters) {
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {// prints only numbers
                System.out.println(ch);
            }
        }

        // print all other symbols by using above methods
        System.out.println("==================================");
        for (char ch : characters) {
            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
    }
}
