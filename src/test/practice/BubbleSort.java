package test.practice;

public class BubbleSort {

	void bubblesort(int arr[]) {
		int n = arr.length;
		System.out.println("length : "+n);
		for (int i = 0; i < n - 1; i++) {
			System.out.println("arr value : "+arr[i]);
			for (int j = 0; j < n - i - 1; j++) {
				System.out.println("arr value2 : "+arr[j]);
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
			}
		}

	}

	void printbubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		BubbleSort sort = new BubbleSort();
		sort.bubblesort(arr);
		sort.printbubbleSort(arr);

	}

}
