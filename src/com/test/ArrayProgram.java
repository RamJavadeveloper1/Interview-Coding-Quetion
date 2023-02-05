package com.test;

import java.util.Arrays;

public class ArrayProgram  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {3,6,1,7,3,10};
		 int min = Arrays.stream(array).min().getAsInt();
		 System.out.println(min);
		
		int smallNo=array[0];
		for (int i = 0; i <array.length; i++) {
			if(smallNo > array[i]) {
				smallNo = array[i];
			}
		
		}
		System.out.println(smallNo);

	}

	
//	 1. emp: name deptid   2. dept: deptid name
//	 
//	 Select d.name, e.name from emp e, dept d where e.deptid = d.deptid and d.name="hr";
//	 
//	 Select * from emp e and dept d groupBy d.name having(count(*));
//	 
	 
	 
	 
}
