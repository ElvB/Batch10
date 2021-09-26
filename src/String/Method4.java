package String;

public class Method4 {
    public static void main(String[] args) {

        //.equals(); --> it will compare String values with each other if they are exactly in some order or not

        String a= "John";
        String b = "John";

        boolean bl1 = a.equals(b); // --> true
        System.out.println(bl1);

        boolean bl2 = a.equals("John"); // --> true
        System.out.println(bl2);

        String c = "JOHN";

        boolean bl3 = a.equals(c); // false
        System.out.println(bl3);

        System.out.println("=========================");

        // .equalsIgnoreCase()

        boolean bl25 = a.equalsIgnoreCase(c); //true

        System.out.println(bl25);

        System.out.println("Java is".equalsIgnoreCase("JAVA is")); // true
        System.out.println("Java is cool".equalsIgnoreCase("JAVA is")); // false

        String str1 = "Java is cool";

        // .replace(); --> it will replace original value with a new one

        str1 = str1.replace('o', '$');

        System.out.println(str1);

        str1= str1.replace("c$$l", "easy");
        System.out.println(str1);

        String text1 = "Tava";
        str1 = str1.replace("Java", text1);
        System.out.println(str1);

        System.out.println(str1.replace("***","???")); // nothing will happen bc there is no *** to replace with

        String star = "Star of the day is *";
        System.out.println(star.replace("*", "$$$"));

        System.out.println("=================================");

        // .trim(); --> it's only for spaces, it removes all the spaces before and after

        String text2 = "  It is Saturday  ";
        System.out.println(text2);

        text2 = text2.trim();
        System.out.println(text2);

        // Task:
        /* "Do whatever it takes"
        - concat with "to learn Java"
        - make everything to uppercase
        - replace "Java" with "JOB"
        - check if the text contains "Chicago"
         */

        String text = "Do whatever it takes";
       text = text.concat(" to learn Java");
       text.toUpperCase();
       text = text.replace("JAVA", "JOB");
        System.out.println("Does it contain Chicago -->"+ (text.contains("Chicago")));
        text = text.replace("LEARN", "GET");

        System.out.println(text);



    }
    }
