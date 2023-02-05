package com.java.core.QA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test345   {
    
    
    public static void main(String[] args) {
        int [] a = {3,4,7,6,5};
        
        int targateNumber=9;
        
        
       ArrayList list= (ArrayList) Arrays.asList(a);
       
       
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]+a[i+1]==targateNumber) {
                System.out.println("find the sum of targate no");
                break;
            }
        }
    }
    
 
    

}
