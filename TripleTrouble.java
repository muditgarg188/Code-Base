package testPackage;

public class TripleTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5 ,7 ,8 ,7 ,7 ,5 ,5 ,9 ,8 ,8};
		findSingleElement(arr);
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length-1 && arr[i] == arr[i+1]) {
				i++;
				i++;
			}
			else {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	private static void findSingleElement(int[] arr) {
		// sorting array using Merge Sort algorithm
		int lo = 0;
		int hi = arr.length-1;
		mergeSort(arr, lo, hi);
	}

	private static void mergeSort(int[] arr, int lo, int hi) {
		if(lo == hi) return;
		int mid = lo+(hi-lo)/2;
		mergeSort(arr, lo, mid);
		mergeSort(arr, mid+1, hi);
		merge(arr, lo, mid, hi);
	}

	private static void merge(int[] arr, int lo, int mid, int hi) {
		int[] temp = new int[hi-lo+1];
		int p1 = lo;
		int p2 = mid+1;
		int k = 0;
		while(p1 <= mid && p2 <= hi) {
			if(arr[p1] < arr[p2]) {
				temp[k++] = arr[p1++];
			}
			else {
				temp[k++] = arr[p2++];
			}
		}
		while(p1 <= mid) {
			temp[k++] = arr[p1++];
		}
		while(p2 <= hi) {
			temp[k++] = arr[p2++];
		}
		for(int i = lo; i <= hi; i++) {
			arr[i] = temp[i-lo];
		}
		
	}

}
