package stream.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	public List<Product> listofProductsort() {
		List<Product> list = new ProductDAO().ListofPerson();
		//Collections.sort(list, (o1, o2)-> (int)o1.getPrice() - (int)o2.getPrice());
		//list.stream().sorted((o1,o2) -> (int)(o1.getPrice() - o2.getPrice())).forEach(t-> System.out.println(t));
		list.stream().sorted(Comparator.comparing(Product:: getName)).forEach(System.out :: println);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listNumber = new ArrayList<Integer>();

		listNumber.add(5);
		listNumber.add(8);
		listNumber.add(7);
		listNumber.add(9);
		listNumber.add(2);

		// Collections.sort(listNumber); //assending order
		// Collections.reverse(listNumber); //desendng order
		// System.out.println(listNumber);

		// using stream

		// listNumber.stream().sorted().forEach(t-> System.out.println(t)); //assending
		// order

		listNumber.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t)); // desendng order

		SortDemo demo = new SortDemo();
		demo.listofProductsort();
		//List<Product> list = demo.listofProductsort();
		//System.out.println(list);

	}

}
