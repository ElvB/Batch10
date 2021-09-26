package Primitives;

public class CharPractice {
    public static void main(String[] args) {

        char  firstLetter='A'; // value for a char data type needs to be in the single quotation mark ('A')
        System.out.println(firstLetter);

        char secondLetter = '6';
        System.out.println(secondLetter);

        char thirdLetter = '^';
        System.out.println(thirdLetter);

        char forthLetter = 66;
        System.out.println(forthLetter);

        // char forthLetter1 = '66'; // you can store only single character in a single quotation mark for char

        char fifthLetter = 2550;
        System.out.println(fifthLetter);

        char x =11; // if you assign a number for a char data type, it will print a symbol/character from ASCII table
        System.out.println(x);

        double d = '?'; // if you assign a symbol/character from ASCII table, it will
                        //print the number/value for it.
        System.out.println(d);

        // Task: create an int data type and assign a character for it and print it out

        int i = '%';
        System.out.println(i);

        int c= 'C', k= 'K', g= 'G', t = 'T', e='E', m= 'M';
        System.out.println(""+c+k+g+t+e+m);
        System.out.println(c+k+g+t+e+m);
    }
}
