package stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {
	
	public List<Customer> getListOfCustomer() {
	 return Stream.of(
			 new Customer(101, "ram", "ram@gmail.com", Arrays.asList("7867564531","78565345671")),
			 new Customer(102, "shayam", "shayam@gmail.com", Arrays.asList("7867564532","78565345672")),
			 new Customer(103, "sita", "sita@gmail.com", Arrays.asList("7867564533","78565345673")),
			 new Customer(104, "bhart", "bhart@gmail.com", Arrays.asList("7867564534","78565345674")),
			 new Customer(105, "krishan", "krishan@gmail.com", Arrays.asList("7867564535","78565345675"))
			 ).collect(Collectors.toList());			
	}

}
