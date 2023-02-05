package test.practice;

import java.util.Scanner;

public class PalidromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reminder,sum=0,temp;  
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number....");
		int inputNumber = scanner.nextInt();
		temp = inputNumber;
		
		while (inputNumber > 0) {
			reminder = inputNumber%10;
		//	System.out.println("reminder :"+reminder);
			sum = (sum*10)+reminder;
			//System.out.println("sum :"+sum);
			inputNumber = inputNumber/10;
			//System.out.println("inputNumber :"+inputNumber);
		}
		
		if (sum==temp) {
			System.out.println("This is palidrom number");
		} else {
			System.out.println("This is not a palidrom number");
		}

	}

}
