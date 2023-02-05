package com.java.core.QA;

public class SubStringMatcher {
    
    public static void main(String[] args) {
        
        String s = "T-shirt";
        String str = "Suace Lab Bolt T-shirt ram ram";
        
        if (str.contains(s)) {
            System.out.println("T-shirt");
        }
    }
}
