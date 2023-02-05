package com.java.core.QA;

public class Test123 {

	public static void main(String[] args) {

		/*
		 * // arraylist = {1,3,5,7,2,5,8,9,4}
		 * 
		 * // {1,3,5,7,2,5,8,9,4}
		 * 
		 * ArrayList<Integer> list = new ArrayList<>(); list.add(3); list.add(6);
		 * list.add(5); list.add(7); list.add(8); list.add(9); list.add(4); ListIterator
		 * listIterator = list.listIterator();
		 * 
		 * for (; listIterator.hasNext();) { Integer num = (Integer)
		 * listIterator.next(); list.removeIf(a -> num % 2 != 0);
		 * 
		 * }
		 * 
		 * for (; listIterator.hasNext();) { Integer num = (Integer)
		 * listIterator.next(); System.out.println(num); }
		 */

		String s1 =  " 12345678";
		String s2 =  "123456789";
		String s3 = "";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int num1 = 0;
		int num2 = 0;
		int len=c2.length;
		 
        int r, sum=0;


		//System.out.println( Integer.parseInt(String.valueOf(c1[len-1])));
		for (int i=len-1; i >0; i--) {

			int n1 = Integer.parseInt(String.valueOf(c1[i]));
			int n2 = Integer.parseInt(String.valueOf(c2[i]));
			System.out.println("n1 :" + n1 +" ,n2 :"+ n2);
			int n3 = n1 + n2;
			System.out.println("n3 :" + n3);
			int curry = (n3)%10;
            r = n3%10;
            System.out.println("reminder : "+r);
            sum = sum + r;
			System.out.println(sum);
		  //  s3.concat(String.valueOf(n3));
			//System.out.println(s3);
		}

	}

}
