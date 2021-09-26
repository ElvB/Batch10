package Array;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class MultiDimensional3 {
    public static void main(String[] args) {

        int[] ids = {3, 4, 2, 34, 56, 7};

        int[][] multiDim = {{60123, 60124, 60125}, {9123, 9124, 9125}, {5123, 5124, 5125, 5126}};

       // multiDim [2][4] = 5234; since there is no 4th index it will throw an exception
        System.out.println(Arrays.deepToString(multiDim));

        int [][] multiDem1 = new int[2][5];
        System.out.println(Arrays.deepToString(multiDem1));
    }
}
