package test.practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
	
	public static void main(String[] args) {
		
//		IntStream.range(1, 10)
//		.sum();
		//.forEach(x -> System.out.println(x));
		System.out.println(	IntStream.range(1, 10)
				.sum());
		
		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out:: println);
		
	}

}
