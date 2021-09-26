package Primitives;

public class DataTypes<number6> {

    /*
    there are 8 different primitive data types

    byte, short, int, long. float, double --> for numbers
    char--> for single character
    boolean --> for True/False
     */
    byte number= 6;
    byte number1 = 127;
    //for byte the range is -128 to 127, that is why it will not compile

    short number3=100;
    short number4=31789;

    public static void main(String[] args){
        int number5 = 32_000; // you can use underscore (_) in between digits it will not affect the value
        int number6 = 1_000_000;

        System.out.println(number6);

        long number7= 341345;
        long number8= 74_813_492_034_854L; // you should use "l/L" at the end of long values

        System.out.println(number8);

        float number9= 2.3f;//you should use "f/F" at the end of long values
        float number10= 56; // 56 -->56.0

        System.out.println("value of number10 --> "+number10);
        // int a = 5.6; you cannot store decimal value in int data type
        float number11= 56.0f;

        double number12= 2.1;
        double number13= 89; // 89 --> 89.0 double data type can store int value
        // most common primitive data types usages are int, double, lng, boolean




    }

}
