package Primitives;

public class Precedence {

    public static void main(String[] args) {

        int count = 10+15;
        int count1 = count + 3 * 5;

        System.out.println("count "+count); //25

        System.out.println(count1); //40

        int count2 = count - count1 / 2 * 3; // -35 is the answer --> 25 - 40/2 * 3 => 25 - 20*3 => 25 - 60 => -35

        System.out.println("count2 "+count2);

        int count3 = 6/3 * 5 % 3; // --> 2 * 5 % 3 = 1 (10%3 =>1 remainder)

        System.out.println(count3);

        int count4 = 6 - 4 - count + count3; // 2 - 25 +1
        System.out.println(count4);
        System.out.println("Total of count3 and count4 --> "+(count3+count4));

        //  50 food, 250 for electronics 80





        int number = 3;
        int number1 = number + 2; // number1 is 5
        number1 += 6; //number1 = number1+6;
        number1 = number1 + 6;
        int number2;
        number2=number1 + number1;
        number2+= number1; // number2 = number2+ number1


    }
}
