package com.java.core.QA;

public class LamdaFunctionIMP {

   public static char []  printReverse(char l [] ) {
       int size = l.length;

       for (int i = 0, j =size-1 ; i < j && j < 0 ; i++, j--) {
        char temp = l[j]; 
        System.out.println("-------------  "+temp);
        l[j] = l[i];
        l[i] = temp; 
       // System.out.println(l[i]);
    }
    return l;
       
   }
   
    public static void main(String[] args) {

        // 2nd way by interface
        addition c = (a, b) -> (a + b);
     //   System.out.println(c.add(30, 20));
        

        char[] letters = {'e', 'v', 'o', 'l', '4'};
        
        
        int size = letters.length;

        for (int i = 0, j =size-1 ; i < j && j < 0 ; i++, j--) {
         char temp = letters[j]; 
         System.out.println("-------------  "+temp);
         letters[j] = letters[i];
         letters[i] = temp; 
         System.out.println("dhjshdjshdjsjd");
        System.out.println(letters[i]);
     }
        
        
      //  char []s = LamdaFunctionIMP.printReverse(letters);
        

    }
}

interface addition {
    int add(int a, int b);
}
