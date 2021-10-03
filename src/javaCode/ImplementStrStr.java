package javaCode;

//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class ImplementStrStr {

    public static void main (String [] args){
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {

        int nLength = needle.length();
        int hLength = haystack.length();
        int n = 0; int h = 0;
        int firstOcc = 0;

        if (nLength !=0 && hLength != 0){
            while (n<nLength){
                while (h<hLength){
                    if (haystack.charAt(h) == needle.charAt(n)){
                        h=h+1;
                        n++;
                        break;
                    }
                    h++;
                }
            }
        }
        return firstOcc;
    }
}
