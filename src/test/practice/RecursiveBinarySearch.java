package test.practice;

import java.util.Scanner;

public class RecursiveBinarySearch {
	public int Binarysearch(int array[], int len, int currentindex, int searchElement) {
		if (currentindex >= len) {
			int mid = len + (currentindex - len) / 2;

			if (array[mid] == searchElement)
				return mid;

			if (array[mid] > searchElement)
				return Binarysearch(array, len, mid - 1, searchElement);
			return Binarysearch(array, mid + 1, currentindex, searchElement);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter, len, array[], first, last, middle;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lenth of element in  Array : ");

		len = scanner.nextInt();
		array = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.println("Inser the number in Array : " + i);
			array[i] = scanner.nextInt();
		}

		System.out.println("Enter the number you want to serach for in the array : ");
		int searchElement = scanner.nextInt();

		RecursiveBinarySearch binarySearch = new RecursiveBinarySearch();
		int result = binarySearch.Binarysearch(array, 0, len, searchElement);

		if (result == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("Element found at index " + result);
		}

	}

}
