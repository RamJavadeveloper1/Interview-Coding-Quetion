package com.java.core.QA;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program123 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
// ramkishorgautam1@gmail.com
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(10);
        a.add(100);
        a.add(9);
        
        
        Integer  b = 10;
        Integer  c = 100;
        Integer  d = 1;
        Integer f = 1;
        
        
      //  Map<Object, Long> b1= find groupby key and repeat no.
                a.stream()
                .collect(Collectors.groupingBy(x->x, Collectors.counting()))
                .forEach((x,y)-> System.out.println("key :"+ x.intValue() + "value : "+ y.intValue())); 
        
              //  List<Long> b1 = dulicate count
                        a.stream().collect(Collectors.groupingBy(x->x, Collectors.counting()))
                        .entrySet().forEach(x->{ 
                            if(x.getValue()>1) {
                                System.out.println(x.getKey());
                            }
                            
                        });
         // Long 
        
        
    }

}


