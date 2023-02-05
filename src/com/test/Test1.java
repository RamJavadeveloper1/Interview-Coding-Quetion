package com.test;

public final class Test1 {
 
	final String name;
	final int id;
	
	public Test1(String name,int id) {
		this.name = name;
		this.id=id;
	}
	
    
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
		

	}



	@Override
	public String toString() {
		return "Test1 [name=" + name + ", id=" + id + "]";
	}



	public static void main(String[] args) {
		Test1 test = new Test1("ram", 1);
		System.out.println(test);
	}
}
