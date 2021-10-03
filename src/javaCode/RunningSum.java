package javaCode;

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.

//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

public class RunningSum {


    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
     * Memory Usage: 39.1 MB, less than 62.84% of Java online submissions for Running Sum of 1d Array.
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {

        int [] runningSum = new int[nums.length];

        int tempRes = nums[0];
        runningSum[0] = tempRes;

        for (int i=1; i< nums.length; i++){
            runningSum[i] = tempRes+nums[i];
            tempRes += nums[i];
        }
        return runningSum;
    }
}
