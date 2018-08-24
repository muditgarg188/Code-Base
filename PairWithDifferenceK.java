package testPackage;

public class PairWithDifferenceK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,20,40,100,80};
		int k = 60;
		int lo = 0;
		int hi = arr.length-1;
		mergeSort(arr, lo, hi);
		for(int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		boolean res = checkDifference(arr, k);
		System.out.println(res);
	}

	private static boolean checkDifference(int[] arr, int k) {
		// TODO Auto-generated method stub
		//fixing pointer at a location (say a) and binary searching
		//for (k+b) in the remaining array
		int lo = 0;
		int hi = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			int a = arr[i];
			int b = (a-k);
			boolean status = binarySearch(arr, b, i+1, hi);
			if(status) {
				return true;
			}
		}
		return false;
	}

	private static boolean binarySearch(int[] arr, int k, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo > hi) {
			return false;
		}
		int mid = lo+(hi-lo)/2;
		if(arr[mid] == k) {
			return true;
		}
		else if(arr[mid] < k) {
			return binarySearch(arr, k, lo, mid-1);
		}
		else {
			return binarySearch(arr, k, mid+1, hi);
		}
	}

	private static void mergeSort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo == hi) return;
		int mid = lo+(hi-lo)/2;
		mergeSort(arr, lo, mid);
		mergeSort(arr, mid+1, hi);
		merge(arr, lo, mid, hi);
	}

	private static void merge(int[] arr, int lo, int mid, int hi) {
		// TODO Auto-generated method stub
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
