package stream.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDataBase {

	public static List<Employee> getEmployees() {
		return Stream.of(
				new Employee(101, "ram", "A", 60000), 
				new Employee(109, "sita", "B", 30000),
				new Employee(102, "naveen", "C", 80000), 
				new Employee(103, "ankit", "A", 90000),
				new Employee(104, "mukesh", "A", 15000)

		).collect(Collectors.toList());

	}

}
