package test.practice;

public class BubbleSort1 {

	public void bubblesort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public void printbubbleSort(int arr[]) {
  
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		BubbleSort1 bubbleSort1 = new BubbleSort1();
		bubbleSort1.bubblesort(arr);
		bubbleSort1.printbubbleSort(arr);

	}

}
