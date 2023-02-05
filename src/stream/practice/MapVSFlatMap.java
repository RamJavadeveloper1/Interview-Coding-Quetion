package stream.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapVSFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customer> Listcutomer = new CustomerDao().getListOfCustomer();

		// conver List of Customer (List<Customer>) to List of email from Cutomer List
		// (List<String> email) :Data transformation
		// customer -> customer.getEmail() one to one mapping and no flattering

		List<String> email = Listcutomer.stream().map(t -> t.getEmail()).collect(Collectors.toList());
		System.out.println(email);
		Map<String, Customer> map = Listcutomer.stream()
				.collect(Collectors.toMap(Customer::getEmail, Customer -> Customer));
		System.out.println(map);

		// get list of phone number from Customer and one customer have many phone
		// number
		//// it process stream of stream of value

		List<List<String>> phoneNumber = Listcutomer.stream().map(t -> t.getMobileNo()).collect(Collectors.toList());

		System.out.println(phoneNumber);

		// for above problem we need to use flatMap
		// one to many mapping and flattening
		// it process stream of stream of values

		List<String> phoneNumber1 = Listcutomer.stream().flatMap(t -> t.getMobileNo().stream())
				.collect(Collectors.toList());

		System.out.println(phoneNumber1);

	}

}
