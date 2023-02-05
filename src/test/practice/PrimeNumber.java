package test.practice;

import java.util.Scanner;

public class PrimeNumber {
	
	void primeNumebr(int n){
		int flag = 0;
		int m = n/2;
		if(n== 0 || n == 1) {
			 System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n%i == 0) {
					flag= 1;
					break;
				} 
			}
		}
		
		 if(flag == 0) {
			 System.out.println("It is Prime No");
		 } else {
			System.out.println("It is not Prime No");
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter the Numer of");
		int n = scanner.nextInt();
		PrimeNumber number = new PrimeNumber();
		number.primeNumebr(n);
	}

}
