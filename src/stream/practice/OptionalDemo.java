package stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static Customer getCustomerByEmailId(String email) {
		List<Customer> list = new CustomerDao().getListOfCustomer();	
		return list.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElse(new Customer());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(101, "ram", "ram@gamil.com", Arrays.asList("7867564531", "78565345671"));

		Optional<Object> emptyOptional = Optional.empty();
		// System.out.println(emptyOptional);

//		 Optional<String> emailOptional = Optional.of(customer.getEmail());
//		 System.out.println(emailOptional);

		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());

		//System.out.println(emailOptional2.orElse("abc@gmail.com"));
		//System.out.println(emailOptional2.map(String::toUpperCase));
		//System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("Email is not present")));
		/*
		 * if(emailOptional2.isPresent()) { System.out.println(emailOptional2.get()); }
		 */
          
		System.out.println(getCustomerByEmailId("ram@gmail.com"));
	}

}
