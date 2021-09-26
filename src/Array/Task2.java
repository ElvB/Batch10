package Array;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an array to store these numbers: 45, 5, 6, 47, 57,8, 12, 0, 30
        Using loop print out only numbers they are greater than 10

        Store numbers that less than 10 in another array
         */

        int[] numbers = {45, 5, 6, 47, 57, 8, 12, 0, 30};
        int[] smallNumbers = new int[numbers.length];

        for (int a = 0; a< numbers.length; a++) {
            if (numbers[a] > 10) {
                System.out.println(numbers[a]);
            }else {
                smallNumbers[a] = numbers[a];
            }
        }
        System.out.println(Arrays.toString(smallNumbers));
    }
}
