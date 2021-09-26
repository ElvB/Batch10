package Array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        // create an array to store these numbers: 45, 5, 6, 47, 57,8, 12, 0, 30
        //find the biggest number from this array

        int[] nums = {45, 5, 6, 47, 57, 8, 12, 30};

        int biggest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > biggest) {
                biggest = nums[i];
            }
        }
        System.out.println("The biggest number is " + biggest);

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // print last element from this array

        System.out.println(nums[nums.length - 1]); // this is last element ang also the biggest number since array is sorted
        System.out.println(nums[0]); // // this is first element ang also the smallest number since array is sorted

        // write a code to find the smallest number without using sorting method

        int[] nums1 = {45, 5, 6, 47, 57, 8, 12, 20, 30};
        int smallest = nums1[0];
        for (int x = 1; x < nums.length; x++) {
            if (nums1[x] < smallest) {
                smallest = nums1[x];
            }
        }
        System.out.println("The smallest number is " + smallest);
    }
}
