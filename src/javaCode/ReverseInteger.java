package javaCode;

//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        String reversed ="";
        String xString = String.valueOf(x);

        int reversedNum = 0;
        for (int i = xString.length(); i >= 1; i--) {
            if (!Character.isDigit(xString.charAt(i-1))){
                reversed = (xString.charAt(i-1)) + reversed;
            }else reversed = reversed + xString.charAt(i-1);
        }

        try{
            reversedNum = Integer.parseInt(reversed);
            return reversedNum;
        }catch(Exception e){
            System.out.println(e.toString());
            return 0;
        }
    }


}
