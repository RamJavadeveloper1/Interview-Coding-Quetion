package stream.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("sita");
		list.add("lakshaman");
		list.add("Bharat");
		list.add("Shatrokhan");
		list.add("Dashrath");

		list.stream().filter(t-> t.startsWith("R")).forEach(t -> System.out.println("Name: " + t));
		// filter map even key
		
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "c");
		map.put(3, "b");
		map.put(4, "d");
		map.put(5, "f");
		
		//map.forEach((k, v)-> System.out.println(k +" : "+ v));
		map.entrySet().stream().filter(t-> t.getKey()%2==0).forEach(obj -> System.out.println(obj.getValue()));


	}

}
