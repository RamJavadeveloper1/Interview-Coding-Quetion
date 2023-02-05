package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "hello world";
//		char [] ex= str.toCharArray();
//		
//		HashMap<Character,Integer> map = new HashMap<>();
//		
//		for (int i = 0; i < ex.length; i++) {
//			if(map.containsKey(ex[i])) {
//				map.put(ex[i], map.get(ex[i])+1);
//			} else {
//				map.put(ex[i], 1);
//			}
//		}
//		
		
		
	  ArrayList<Integer> list = new ArrayList();
		list.add(11);
		list.add(40);
		list.add(50);
		list.add(30);
		list.add(20);
		list.add(23);
		list.add(67);
		list.add(67);
		
		//Collections.sort(list);
		
		Optional<Integer> a=list.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst(); 
		System.out.println(a);
		
		//list.stream().distinct().sorted().map(t1,t2) .forEach(t -> System.out.println("Name: " + t));
		
		

		
		//System.out.println(list.get(list.size()-2));
		//ArrayList<Integer> arr1=list.stream().distinct().collect(List.class);
		//System.err.println(arr1.get(list.size()-2));

	}

}
