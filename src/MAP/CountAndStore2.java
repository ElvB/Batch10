package MAP;

import java.util.HashMap;

public class CountAndStore2 {
    public static void main(String[] args) {

        // Reach out every letter and count them
        // I --1
        // t --3
        // i --3
        // .....

        String string = "It is easy with practice";
        //string = string.replace(" ","");
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (int index = 0; index < string.length(); index++) {

            if (string.charAt(index) == ' ') {
                continue;
            }
            if (!letterCount.containsKey(string.charAt(index))) {
                letterCount.put(string.charAt(index), 1);
            } else {
                letterCount.put(string.charAt(index), letterCount.get(string.charAt(index)) + 1);
            }
        }
        System.out.println(letterCount);

    }
}
