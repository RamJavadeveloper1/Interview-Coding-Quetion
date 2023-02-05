package stream.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO {

	public List<Product> ListofPerson() {
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "ram", 30f));
		productList.add(new Product(2, "manu", 50f));
		productList.add(new Product(3, "anuj", 60f));
		productList.add(new Product(4, "tarun", 20f));
		productList.add(new Product(5, "naveen", 10f));

		return productList;
	}

	public Map<Product, Integer> MapOfPerson() {
		Map<Product, Integer> map = new HashMap<Product, Integer>();
		map.put(new Product(1, "ram", 30f), 60);
		map.put(new Product(2, "manu", 30f), 90);
		map.put(new Product(3, "anuj", 30f), 50);
		map.put(new Product(4, "tarun", 30f), 40);
		map.put(new Product(5, "naveen", 30f), 120);

		return map;
	}

}
