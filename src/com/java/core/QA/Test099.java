package com.java.core.QA;

public class Test099 {

    public static void main(String[] args) {

        Integer nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 10;
        boolean found = true;
        // Output: [3,4]
        // Explanation: Because nums[3] + nums[4] == 9, we return [3, 4];
        int sizeArr = nums.length;
        // 9/2 = 4 
        //int j = 1;
        for (int i = 0, j = sizeArr-1 ; i < sizeArr && j > i   ; i++, j--) {
            int sum = nums [i] + nums [j];
          //  System.out.println( nums [i] +" ,---, "+ nums [j]);
            if(sum == target) {
              //  System.out.println("index of first no :" + i + "seconde"+ j);
              //  break;
            } 
        }
        
        if(found)
        for (int i = sizeArr/2, j = (sizeArr/2) ; i>=0 && j < sizeArr  ; i--, j++) {
            int sum = nums [i] + nums [j];
            System.out.println( nums [i] +" ,---, "+ nums [j]);
            if(nums [i] == nums [j]) {
                found = true; 
                continue;
            }
            if(sum == target) {
               System.out.println("index of first no :" + i + "seconde"+ j+ "sum: "+ sum);
              //  break;
            } 
        }
        
       
        
        /*
         * for (int i = 0; i < sizeArr-1 ; i++) {
         * int sum = nums [i] + nums [j];
         * j++;
         * // System.out.println(sum);
         * if(sum == target) {
         * System.out.println("index of first no :" + i + "seconde"+ j);
         * } else {
         * // System.out.println("not found the result ");
         * }
         * 
         * }
         */
        
        

    }
}
