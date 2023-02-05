package test.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharCount {

	public static void main(String[] args) {
		
		String  s = "This is a MindTree interview";
		String sUpperCase =s.toUpperCase();
		char [] schar =sUpperCase.toCharArray();
		
	HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
	
	for (int i = 0; i < schar.length; i++) {
		if (hashMap.containsKey(schar[i])) {
			
			hashMap.put(schar[i], hashMap.get(schar[i])+1);
		} else {
			hashMap.put(schar[i], 1);
		}
	}

	Set set = hashMap.entrySet();
	
	for (Iterator iterator = set.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
	
	
		

	}

}
