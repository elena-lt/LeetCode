package javaCode;

//Given an integer x, return true if x is palindrome integer.
//
// An integer is a palindrome when it reads the same backward as forward.
// For example, 121 is palindrome while 123 is not.

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome1(10));
    }

    public static boolean isPalindrome(int x) {
        int currNum = x;
        int mod = x;
        String xReversed = "";

        if (x < 0) return false;
        if (x < 10) return true;

        while (currNum != 0) {
            mod = currNum % 10;
            xReversed = xReversed + mod;
            currNum = (currNum / 10) - (mod / 10);
        }

        try {
            return x == Integer.parseInt(xReversed);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isPalindrome1(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        char[] nums = (String.valueOf(x)).toCharArray();

        int length = nums.length;
        int middle = (length / 2);

        String first = String.valueOf(nums, 0, middle);
        String second = "";
        if ((length % 2) == 0) {
            String secondPart = String.valueOf(nums, middle, middle);
            for (int i = secondPart.length() - 1; i >= 0; --i) {
                second = second + secondPart.charAt(i);
            }
        } else {
            String secondPart = String.valueOf(nums, middle + 1, middle);
            for (int i = secondPart.length() - 1; i >= 0; --i) {
                second = second + secondPart.charAt(i);
            }
        }
        return first.equals(second);
    }

    public static boolean isPalindrome2(int x){
        int reverse =0;
        int temp = x;
        if (x>=0){
            while (x!=0){
                int remainder = x%10;
                reverse = reverse *10 + remainder;
            }
        }return false;
    }
}
