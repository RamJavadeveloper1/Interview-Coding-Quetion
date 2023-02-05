package stream.practice;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
// just return true/false based on input
public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Predicate<Integer> predicate = t->t%2==0;
//		System.out.println(predicate.test(5));
		
		// filter is always using predicate 
		// forEach internal using consumer functional interface
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		list.stream().filter(t->t%2==0).forEach(t-> System.out.println("Print Even : "+ t));
	
			
	}

}
