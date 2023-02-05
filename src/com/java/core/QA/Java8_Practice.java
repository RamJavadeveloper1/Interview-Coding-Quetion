package com.java.core.QA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8_Practice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15);

        // find the Even no from List
        System.out.println(" Find the Even no  from List --------------------  ");
        List<Integer> evenNumberList = myList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        ;
        evenNumberList.forEach(x -> System.out.println(x));

        // find No whos start with one
        System.out.println(" Find No whos start with one --------------------  ");
        List<Integer> stratWithOne = myList.stream().map(x -> x + "")
                .filter(x -> x.startsWith("1")).map(Integer::parseInt).collect(Collectors.toList());
        stratWithOne.forEach(x -> System.out.println(x));
       System.out.println("conctan with ,  --------------------------------------------"); 
       
      // myList.stream().map(x-> new String(x.toString()).collect(Collectors.joining(","))
        //.forEach(x->System.out.println(x));

        // find duplicate elements given List
        System.out.println(" find duplicate elements given List --------------------  ");
        HashSet<Integer> set = new HashSet<>();
        List<Integer> dublicateElement1 = myList.stream().filter(x -> !set.add(x)).collect(Collectors.toList());

        List<Entry<Integer, Long>> dublicateElement = myList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(x -> x.getValue() > 1).collect(Collectors.toList());
        // dublicateElement.forEach(x -> System.out.println(x.getKey()+ " values : "+
        // x.getValue()));

        Set<Integer> dublicateElement2 = myList.stream().filter(x -> Collections.frequency(myList, x) > 1)
                .collect(Collectors.toSet());
        dublicateElement2.forEach(x -> System.out.println(x));

        System.out.println(
                " find the first element of the list using Stream functions ---------------------------------------");

        Optional<Integer> firstElement = myList.stream().findFirst();// .ifPresent(System.out::println);
        System.out.println(firstElement.orElseThrow());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Found The element count ");
        Long myListSize = myList.stream().count();
        System.out.println(myListSize);
        
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("Find the non reatetive char in given string ");
        String input = "Java Hungry Blog Alive is Awesome";
        Character charq =input.chars()
                .mapToObj(x->Character.toLowerCase(Character.valueOf((char)x)))
                .collect(Collectors
                        .groupingBy(Function.identity(), 
                                LinkedHashMap:: new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue()==1L)
                .map(entry-> entry.getKey())
                .findFirst().get();
        System.out.println(charq);
        
        System.out.println("------------------------------------------------------------------");
      
 
        System.out.println(" Given a list of integers, sort all the values present in it in descending order using Stream functions");
        
       // myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}
