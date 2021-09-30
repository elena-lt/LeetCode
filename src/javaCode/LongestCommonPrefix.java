package javaCode;

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

//Input: strs = ["flower","flow","flight"]
//Output: "fl"

public class LongestCommonPrefix {

    public static void main (String [] args){

        String [] str = new String [] {"flower","flow","flight"};

        System.out.println(longestCommonPrefix1(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i=1; i< strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix1(String[] strs) {
        String prefix = strs[0];

        for (String str : strs){
            if (str.length() == 0) return "";

            int length = Math.min(prefix.length(), str.length());
            prefix = prefix.substring(0, length);
            for (int i=0; i<length; i++){
                if (prefix.charAt(i) != str.charAt(i)){
                    prefix = prefix.substring(0,i);
                    break;
                }
            }
        }
        return prefix;
    }

}
