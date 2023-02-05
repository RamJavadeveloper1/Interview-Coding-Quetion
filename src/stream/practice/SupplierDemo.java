package stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
// not take input just return;
public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier = () -> "Hi Ram";
		//System.out.println(supplier.get());
		
		List<String> list = Arrays.asList();
		// if not find any thing in list return the demo value using supplier we can achive this.
		System.out.println(list.stream().findAny().orElseGet(()->"Hi Ram"));

	}

}
