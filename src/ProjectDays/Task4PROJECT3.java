package ProjectDays;

public class Task4PROJECT3 {

    public static void main(String[] args) {
    /*  Write a program that will accept only 6 digits numbers like 578432 and find multiplication (5*7*8*4*3*2)
    of all digits and sum (5+7+8+4+3+2) of all digits.
    Example1:
    578432 Multiplication of all digits is 6720
    The Sum of all digits is 29
    */
        int number = 145678;
        int n6 = number%10;
        number = number/10;

        int n5 = number%10;
        number = number/10;

        int n4 = number%10;
        number = number/10;

        int n3 = number%10;
        number = number/10;

        int n2 = number%10;
        number = number/10;

        int n1 = number%10;
        number = number/10;

        System.out.println( "Multiplication of all digits is " + n1*n2*n3*n4*n5*n6);
        System.out.println(  "The sum of all digits is " + (n1+n2+n3+n4+n5+n6));

        // TASK 5
         int digit5=13459;
         //95431


    }

}
