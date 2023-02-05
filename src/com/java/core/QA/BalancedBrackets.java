package com.java.core.QA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedBrackets {

    private static boolean areBracketsBalanced(String expr) {
        // TODO Auto-generated method stub

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '[' || x == '{' || x == '(') {
                deque.push(x);
                continue;
            }

            if (deque.isEmpty()) {
                return false;
            }

            char check;
            switch (x) {
                case ')':
                    check = deque.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = deque.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = deque.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;

            }
        }

        return (deque.isEmpty());
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        
        
        
        // TODO Auto-generated method stub
        String expr = "([{}])";
        String s = "(]";
        String b = "()[]{}";

        if ('(' == ')') {
            System.out.println("sahi bc");
        }
        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

        /*
         * using stack checking
         * 3 pop [ == 6, ]
         * 2 pop { == 5, }
         * 1 pop ( == 4, )
         * ----once opening braces end start reading or poping
         * 1 (
         * 2 {
         * 3 [
         * opening braces inserting
         */
        
    }

}
