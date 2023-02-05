package stream.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("sita");
		list.add("lakshaman");
		list.add("Bharat");
		list.add("Shatrokhan");
		list.add("Dashrath");

		list.stream().forEach(t -> System.out.println("Name: " + t));

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "c");
		map.put(3, "b");
		map.put(4, "d");
		map.put(5, "f");
		
		//map.forEach((k, v)-> System.out.println(k +" : "+ v));
		map.entrySet().stream().forEach(obj -> System.out.println(obj.getValue()));

	}

}
