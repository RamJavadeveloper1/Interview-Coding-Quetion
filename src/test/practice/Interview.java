package test.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Interview {

	public static void main(String[] args) {
		/*String t1= new String("Test");
		String t2 = new String ("Test");
		

		if(t1.equals(t2)) {
			System.out.println("Equels");
		} else {
			System.out.println("No Equels "+ t1.toString());
		}
	System.out.println("t1 hascode"+ t1.hashCode() +" t2 hascode"+ t2.hashCode());
	*/
		/*
		 * HashSet<String> set = new HashSet<>(); set.add("Ram"); set.add("Ram"); for
		 * (Iterator iterator = set.iterator(); iterator.hasNext();) { String string =
		 * (String) iterator.next(); System.out.println(string); }
		 */
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Ram", 1);
		hashMap.put("Ram", 2);
		Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
		
		for(Map.Entry<String, Integer>  e : entries) {
			System.out.println(e.getKey()+ ":" +e.getValue());
		}
	}
		
	
}
