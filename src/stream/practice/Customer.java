package stream.practice;

import java.util.List;

public class Customer {

	private int id;
	private String name;
	private String email;
	private List<String> mobileNo;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String name, String email, List<String> mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(List<String> mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
	

}
