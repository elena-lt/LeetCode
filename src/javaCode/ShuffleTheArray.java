package javaCode;
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Shuffle the Array.
     * Memory Usage: 39.1 MB, less than 65.38% of Java online submissions for Shuffle the Array.
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int nListIterator = 0;

        for (int i = 0; i < n; i++) {
            result[nListIterator] = nums[i];
            result[nListIterator+1] = nums[n+i];
            nListIterator+=2;
        }

        return result;
    }
}
