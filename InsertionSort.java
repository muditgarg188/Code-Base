package testPackage;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {176,-272,-272,-45,269,-327,-945,176};
		insertionSort(arr);
	}

	private static void insertionSort(int[] arr) {

		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
			System.out.print(j+1+" ");
		}
	}

}
