package com.java.core.QA;

public class TwoLargestNo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int values[] = { 4, 2, 5, 3, 9, 34 };
        int largest1 = values[0];
        int largest2 = -1;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > largest1) {
                largest2 = largest1;
                largest1 = values[i];
            } else if (values[i] > largest2 && values[i] != largest1) {
                largest2 = values[i];
            }
        }
        System.out.println("Largest - " + largest1);
        System.out.println("2nd largest Largest - " + largest2);
    }

}
