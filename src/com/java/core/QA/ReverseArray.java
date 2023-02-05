package com.java.core.QA;

public class ReverseArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        char[] letters = { 'e', 'v', 'o', 'l', '4' };

        int size = letters.length;

        for (int i = 0, j = size - 1; i <= j && j > 0; i++, j--) {
            char temp = letters[j];
            letters[j] = letters[i];
            letters[i] = temp;
            System.out.println(letters[i]);
        }
        
        System.out.println("///////////////////////////");
        
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }

}
