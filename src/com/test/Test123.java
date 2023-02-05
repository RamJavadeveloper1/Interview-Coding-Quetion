package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test123 {

	public static void main(String[] args) {
		Integer array [] = {1,2,4,5,7,3};
		
		ArrayList<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1,array);
		
		//list1.stream().sorted(Comparator.reverseOrder()).limit(2).sorted(Comparator.naturalOrder()).limit(1).forEach(t-> System.out.println(t)); 
		//list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));
// @formatter:on
		
		Integer n = Arrays.stream(array).sorted(Comparator.reverseOrder()).skip(1).findFirst().get(); 

System.out.println(n);
		
		
	}
}
