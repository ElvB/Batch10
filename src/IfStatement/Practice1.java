package IfStatement;

public class Practice1 {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 10;

        if (a==b){

            System.out.println("You can go to picnic");
        }

        if (a==c){

            System.out.println("This is second option for picnic"); // it will not be printed, they will be ignored, bc it is false(boolean),
                                                                    // it will jump and show next true statement
        }

        if (a == b || a != c){ // it has to be boolean condition, there is limit how many condition we can have, it will be printed, bc it is true
            System.out.println("Yaaayyy, I am going");
        }

        System.out.println("I will be happy");

    }
}
