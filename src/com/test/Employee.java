package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
	private String firstname;
	private String lastname;
	private int age;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("ram", "Gautam", 25);
		Employee emp2 = new Employee("anuj", "mishra", 35);
		Employee emp3 = new Employee("naveen", "pathak", 45);
		Employee emp4 = new Employee("sita", "sony", 65);
		Employee emp5 = new Employee("krishan", "singh", 75);
		ArrayList<Employee> listEmp = new ArrayList<>();
		listEmp.add(emp);
		listEmp.add(emp2);
		listEmp.add(emp3);
		listEmp.add(emp4);
		listEmp.add(emp5);

		ArrayList<Employee> listEmp1 = (ArrayList<Employee>) listEmp.stream()
				.sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		listEmp.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		// sort by age
		// listEmp.sort(Comparator.comparing(Employee:: getAge).thenComparing(Employee::
		// getFirstname));

		// What will be output of following code block?
		for (Iterator iterator = listEmp1.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}

		/*
		 * String s1 = "abc"; String s2 = "abc"; System.out.println("s1 == s2 is:" +
		 * s1.hashCode() + " S2 hascode:" + s2.hashCode());
		 * 
		 * if (s1 == s2) { System.out.println("aaa"); } else {
		 * System.out.println("bbb"); } System.out.println("s1 == s2 is:" + s1 == s2);
		 */
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println("s1 == s2 is:" + "sasas"+ s1 == s2); // true

	}

}
