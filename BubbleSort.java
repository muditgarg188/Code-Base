package testPackage;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {176,-272,-272,-45,269,-327,-945,176};
		//int[] arr = {100,-89,-876,0,866,10,-945,65};
		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {
		
		int len = arr.length;
		int swapCount = 0;
		for(int i = 0; i < len-1; i++) {
			for(int j = 0; j < len-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapCount += 1;
				}
			}
		}
		System.out.println(swapCount);
	}

}
