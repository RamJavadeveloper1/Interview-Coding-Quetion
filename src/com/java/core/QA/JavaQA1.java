package com.java.core.QA;

public class JavaQA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1 = new b();
		//a1.m2();

	}

}

class a {
	
	public void m1() {
		System.out.println("math 1");
	}
}

class b extends a {
	public void m1() {
		System.out.println("math 1 class b");
	}
	
	public void m2() {
		System.out.println("math 2");
	}
}
