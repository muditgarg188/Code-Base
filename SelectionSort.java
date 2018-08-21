package testPackage;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {154,-109};
		//int[] arr = {154,-109};
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		//sorting in decreasing order keeping last index fixed and finding max
		//element from remaining array
		for(int i = arr.length-1; i > 0; i--) {
			int idx = i;
			for(int j = i-1; j >= 0; j--) {
				if(arr[j] >= arr[idx]) {
					idx = j;
				}
			}
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
			System.out.print(idx+" ");
		}
		System.out.println();
		for(int z = 0; z < arr.length; z++) {
			System.out.print(arr[z]+" ");
		}
	}

}
