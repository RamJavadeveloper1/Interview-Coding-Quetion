package test.practice;

import java.util.Scanner;

public class FibbonaSeries {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of n :");
		int n = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + "");
		}
	}

}
