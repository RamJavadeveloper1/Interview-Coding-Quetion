package stream.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortedMapDemo {

	public void sortMap() {
		Map<Product, Integer> map = new ProductDAO().MapOfPerson();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Product::getName).reversed()))
				.forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ram", 9);
		map.put("shayam", 2);
		map.put("krishna", 1);
		map.put("puran", 6);
		map.put("lakhan", 7);
		// convert list and after sort
		// List<Entry<String, Integer>> list =
		// map.entrySet().stream().collect(Collectors.toList());
		// list.stream().sorted((o1, o2)->
		// o1.getKey().compareToIgnoreCase(o2.getKey())).forEach(System.out:: println);
		// without conver we can also do it

		// map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::
		// println); // by key
	//	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); // by value
		
		SortDemo demo = new SortDemo();
		demo.listofProductsort();

	}

}
