package String;

import java.util.Locale;

public class Method3 {
    public static void main(String[] args) {

        String string = "Selenium";

        // .toUpperCase(); --. method, it will convert yo upper case

        string = string.toUpperCase();
        System.out.println(string);

        //.toLowerCase(); --> method, it will convert all string to lower case

        string.toLowerCase();
        System.out.println(string.toLowerCase());
        string = string.toLowerCase();
        String a = "" + string.charAt(0);
        a = a.toUpperCase();
        System.out.println(a);

        //.endswith();

        String word = "do whatever it takes";

        word.endsWith("do"); // false

        System.out.println(word.endsWith("s")); // true
        System.out.println(word.endsWith("es")); // true
        System.out.println(word.endsWith("takes")); // true
        System.out.println(word.endsWith("takeS")); // false
        System.out.println(word.endsWith("it")); // false

        // .contains();
        System.out.println("==============================");
        String text = "Techtorial";

        System.out.println(text.contains("Tech")); // true

        text = text + word;

        System.out.println(text.contains("do")); // true
        System.out.println(text.contains("for")); //false
        System.out.println(text.contains("i")); // true

    }
}
