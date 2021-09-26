package Loops;

public class ForLoop2 {
    public static void main(String[] args) {

        //Print out the letters from a given String value --> chicago
        //Print out the letters starting from end of the string

        // Print out only letter "o" from this String --> "Today is the day to practice for loop"


        String word = "chicago";

        for (int i = 0; i <= word.length() - 1; i++) {
            System.out.println(word.charAt(i));
        }

        for (int index = word.length() - 1; index >= 0; index--) {
            System.out.println(word.charAt(index));
        }

        String string = "Today is the day to practice for loop";

        int count = 0;
        for (int k = 0; k < string.length(); k++) {
            if (string.charAt(k) == 'o') {
                System.out.println(string.charAt(k));
                count++;
            }
        }
        System.out.println("There is that many o = " + count + " in the string ");
        // Count the amount of the letter "o"

        // the index number of is ...

        for (int k = 0; k < string.length(); k++) {
            if (string.charAt(k) == 'o') {
                System.out.println(string.charAt(k));
                System.out.println("the index number of is "+k);
                count++;
            }
        }
        System.out.println("count is " + count);


    }
}
