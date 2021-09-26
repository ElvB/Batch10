package Loops;

public class CountLetters {
    public static void main(String[] args) {

        /*
        I want to solve this question by myself this time
        count how many lower case "i" and upper case "I" in the given sentence
        print there are ... in the sentence
         */

        String text = "I want to solve this question by myself this time";
        int index = 0;
        int count = 0;
        while (index < text.length()) {

            if (text.charAt(index) == 'i' || text.charAt(index) == 'I') {
                count++;
            }
            index++;
        }
        System.out.println("There are " + count + " i or I in the sentence");
    }
}

