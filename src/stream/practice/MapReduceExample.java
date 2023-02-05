package stream.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MapReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(3, 7, 8, 9, 5, 1);

		List<String> words = Arrays.asList("corejava", "spring", "hibernate");
		// Sum the no first way
		int sum = 0;

		for (Integer integer : numList) {
			sum = sum + integer;
		}
		System.out.println(sum);

		// using map

		int sum1 = numList.stream().mapToInt(number -> number).sum();
		System.out.println(sum1);

		// method reduce
		System.out.println("Reduce method call ......");
		Integer reduseSum = numList.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sum : " + reduseSum);

		// method reduce method refernce

		Optional<Integer> reduseSum1 = numList.stream().reduce(Integer::sum);
		System.out.println("sum1 using method refernce :" + reduseSum1.get());

		Optional<Integer> reduseSum2 = Optional.ofNullable(numList.stream().reduce(1, (a, b) -> a * b));
		System.out.println("multiplication :" + reduseSum2.get());

		Optional<Integer> reduseSum3 = numList.stream().reduce(Integer::max);
		System.out.println("max : " + reduseSum3.get());

		String s = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("Find the max char in list of string : " + s);

		// get the empoyee with grade A
		// get salary
		double l = EmployeeDataBase.getEmployees().stream()
				.filter(emp -> emp.getGrade().equalsIgnoreCase("A")).map(emp -> emp.getSalary()).mapToDouble(emp-> emp).average().getAsDouble(); //collect(Collectors.toList());
		System.out.println(l);
		

	}

}
