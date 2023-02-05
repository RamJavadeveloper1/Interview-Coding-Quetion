package test.practice;

import java.util.Scanner;

public class PalidromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String....");
		String sampleString = sc.nextLine();
		char[] stringChar = sampleString.toCharArray();
		String reverse = "";
		int j =0;
		for (int i = stringChar.length - 1; i >= 0; i--) {
	
			reverse = reverse + stringChar[i];
		}
		System.out.println(reverse);
		if (reverse.equalsIgnoreCase(sampleString)) {
			System.out.println("This is palidrom");
		} else {
			System.out.println("This is not palidrom");
		}

	}

}
