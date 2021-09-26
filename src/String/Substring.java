package String;

public class Substring {
    public static void main(String[] args) {

        String str = "Techtorial";
//                    0123456789
        String part1 = str.substring(2); // when u pass single index number into the substring method
                                         // it will take partial text starting from that index and will
                                         //  include that index's char
        System.out.println(part1);

        String part2 = str.substring(2,4); // when u pass beginning and ending index numbers,
                                           // it will start from beginning index which is included
                                           // and stop at the ending index which is not included
        System.out.println(part2);

        System.out.println(str.substring(0));

        //print last three chars from string "I will do it SOON"

        String string = "I will do it SOON";


        System.out.println(string.substring(string.length()-3)); // when ur string value does not have enough value to take substring
                                                                 // it will throw an exception (StringOutOfBound)

        String string1 = "ON";
        System.out.println(string1.substring(string.length()-3));


    }
}
