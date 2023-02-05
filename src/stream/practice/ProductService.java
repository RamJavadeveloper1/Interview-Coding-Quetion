package stream.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductService {

	public List<Product> sortListofProduct() {
		List<Product> productList = new ProductDAO().ListofPerson();
		Collections.sort(productList, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
			}
		});
		return productList;
	}

	public List<Product> ListofTaxableProduct(String input) {
		return input.equalsIgnoreCase("tax")
				? new ProductDAO().ListofPerson().stream().filter(t -> t.price > 30f).collect(Collectors.toList())
				: new ProductDAO().ListofPerson().stream().filter(t -> t.price < 30f).collect(Collectors.toList());
	}

	public List<Product> sortListofProduct1() {
		List<Product> productList = new ProductDAO().ListofPerson();
		Collections.sort(productList, (o1, o2) -> o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase()));
		return productList;
	}

	public static void main(String[] args) {
		ProductService service = new ProductService();
		List<Product> product = service.sortListofProduct();
		List<Product> productTax = service.ListofTaxableProduct("tax");
	//	System.out.println(product);
		System.out.println("Product tax : "+productTax);
	}
}
