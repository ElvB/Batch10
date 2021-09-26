package Primitives;

public class LogicalNegation {
    public static void main(String[] args) {

        boolean haveMoney = false;
        System.out.println(haveMoney); // false

        //!haveMoney = false; u cannot use it,compile time error

        System.out.println(!haveMoney); // true

        boolean isCarOn = true;
        isCarOn = false;
        System.out.println(!isCarOn); // true



    }
}
