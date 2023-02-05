package stream.practice;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "ram", 25000f));
		list.add(new Product(2,"naveen", 27000f));
		list.add(new Product(3,"anuj", 33000f));
		list.add(new Product(4,"ankit", 37000f));
		list.add(new Product(5,"mukesh", 40000f));
		list.add(new Product(6,"sidhharth", 20000f));
		list.add(new Product(7,"surendra", 22000f));
		
		List<Float> floatsList= list.stream().filter(p->p.price < 30000).map(p->p.price).collect(Collectors.toList());
		
		System.out.println(floatsList);
		
		//Iterating
		
		Stream.iterate(1, n -> n+1).filter(n-> n%5==0).limit(5).forEach(System.out :: println);
		
		// filter data where price is 30000f and get the name of emp
		
		list.stream().filter(p->p.price==33000f).forEach(p->System.out.println(p.name));
	}

}
