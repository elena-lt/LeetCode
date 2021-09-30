package javaCode;

//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
//element appears only once. The relative order of the elements should be kept the same.
//
//Since it is impossible to change the length of the array in some languages,
// you must instead have the result be placed in the first part of the array nums.
// More formally, if there are k elements after removing the duplicates,
// then the first k elements of nums should hold the final result.
// It does not matter what you leave beyond the first k elements.
//
//Return k after placing the final result in the first k slots of nums.
//
//Do not allocate extra space for another array.
//You must do this by modifying the input array in-place with O(1) extra memory.

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int firstNum = 0;
        int currNum = 1;
        int len = nums.length-1;

        if (len == 0) return firstNum;
        else if (len == 1) return currNum;

        while (firstNum < len && currNum < len) {
            if (nums[firstNum] == nums[currNum]) {
                while (currNum < nums.length - 1 && nums[firstNum] == nums[currNum + 1]) {
                    currNum++;
                }

                if (currNum < len) {
                    nums[firstNum + 1] = nums[currNum+1];
                    currNum = currNum+1;
                }
            }
            firstNum++;
        }

        return currNum;
    }

    public int removeDuplicates1(int[] nums) {
        int first = 0;
        int second = 1;
        while(second < nums.length) {
            if(nums[first] == nums[second])
                second++;
            else
                nums[++first] = nums[second++];
        }
        return first + 1;
    }
}
