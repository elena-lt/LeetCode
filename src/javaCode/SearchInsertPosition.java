package javaCode;

//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        int firstInd = 0;
        int lastInd = nums.length - 1;
        while (firstInd <= lastInd) {
            int mid = (firstInd + lastInd) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) firstInd = mid + 1;
            else if (nums[mid] > target) lastInd = mid - 1;
        }
        return lastInd + 1;
    }

}
