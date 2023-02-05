package com.java.core.QA;

public class AlmostPalindrome {
    public static void main(String[] args) {
        String example1 = almostPalindrome("abcdcbg");
        System.out.println(example1);

        String example2 = almostPalindrome("abccia");
        System.out.println(example2);

        String example3 = almostPalindrome("abcdaaa");
        System.out.println(example3);

        String example4 = almostPalindrome("1234312");
        System.out.println(example4);
    }

    public static String almostPalindrome(String str) {

        char str1[] = str.toCharArray();
        String temp = "";
        int count = 0;
        int j = 0;

        for (int i = str1.length - 1; i >= 0; i--) {

            if (str1[i] != str1[j++] && i <= str1.length / 2) {
                count++;
               // System.out.println("hi " + str1[i]);
            }
            temp = temp + str1[i];
        }
        
        if (count > 0 && count < 2) {
            return "true";
        }
        if (str1.equals(temp)) {
            return "false";
        } else {
            return "false";
        }
    }
}
