package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //Binary Search
        // Binary Search will return index number if the element is present in the array,
        // if the element is not in the array, it will return possible element position with negative sign
        // You need to sort the array before you apply binary search

        int[] studentNumber = {100, 10, 15, 20, 30, 35};
        Arrays.sort(studentNumber);
        System.out.println(Arrays.toString(studentNumber));
        System.out.println(Arrays.binarySearch(studentNumber, 35));
        System.out.println(Arrays.binarySearch(studentNumber,1));
        System.out.println(Arrays.binarySearch(studentNumber,111));

        //String str = "Java";
        //System.out.println("a"); // index number of first 'a' -->1
    }
}
