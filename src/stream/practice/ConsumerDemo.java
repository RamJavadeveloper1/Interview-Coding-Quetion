package stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// not return anythings 
public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<Integer> consumer = (t) -> System.out.println("Print  : " + t);
		consumer.accept(10);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		// forEach internal using consumer functional interface
		list.stream().forEach(t-> System.out.println(t));
	}

}
