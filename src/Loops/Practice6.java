package Loops;

public class Practice6 {
    public static void main(String[] args) {

        /*
        Summer --> print every single letter from this word
        S, U, M, M, E, R
         */

        String text = "Summer";

        int index = 0;
        while (index < text.length()) {

            System.out.println(text.charAt(index)+ ", "); // if we want it on the same line we need print instead od println
            index++;
        }
    }
}