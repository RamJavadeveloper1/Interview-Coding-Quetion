package test.practice;

import java.util.Scanner;

public class BinarySerach {

	@SuppressWarnings("null")
	int first,last,middle;
	
//	public int recursiveBinarysearch(int array[],int l, int currentindex, int search) {
//		
//		
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter, num, array[],first,last,middle;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element");
		
		
		num = scanner.nextInt();
		array = new int[num];
	
		for (int i = 0; i < num; i++) {
			System.out.println("Enete the number : "+ i);
			array[i]= scanner.nextInt();
		}
		System.out.println("Enete the number you want to serach");
		int temp = scanner.nextInt();
		
		first = 0;
		last = num-1;
		middle = (first+last)/2;
		
		while (first<=last) {
			if(array[middle]< temp) {
				first = middle+1;
			} else if (array[middle]==temp) {
				System.out.println(temp +" found at location"+ (middle+1)+".");
				break;
			} else {
				last = middle -1;
			}
			
			middle = first+last/2;
		}
		
		if (first>last) {
			System.out.println(temp+"item is not found. \n");
		}
		

	}

}
