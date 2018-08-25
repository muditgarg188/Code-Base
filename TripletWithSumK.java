package testPackage;

public class TripletWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1 ,20 ,40 ,100 ,80};
		//int[] arr = {5,5,5};
		int lo = 0;
		int hi = arr.length-1;
		int k = 60;
		mergeSort(arr, lo, hi);
		boolean res = checkSum(arr, k);
		System.out.println(res);
	}

	private static boolean checkSum(int[] arr, int k) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = arr.length-1;
		for(int i = 0; i < arr.length-2; i++) {
			int a = arr[i];
			int bc = k-a;
			for(int j = i+1; j < arr.length-1; j++) {
				int a2 = arr[j];
				int b2c2 = bc-a2;
				boolean status = binarySearch(arr, b2c2, j+1, hi);
				if(status) {
					return status;
				}
			}
		}
		return false;
	}

	private static boolean binarySearch(int[] arr, int k, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo>hi) return false;
		int mid = lo+(hi-lo)/2;
		if(k==arr[mid])return true;
		else if(k < arr[mid])
			return binarySearch(arr, k, lo, mid-1);
		else
			return binarySearch(arr, k, mid+1, hi);
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
		while(p1<=mid && p2<=hi) {
			if(arr[p1] < arr[p2])
				temp[k++] = arr[p1++];
			else
				temp[k++] = arr[p2++];
		}
		while(p1<=mid) {
			temp[k++] = arr[p1++];
		}
		while(p2<=hi) {
			temp[k++] = arr[p2++];
		}
		for(int i = lo; i <= hi; i++) {
			arr[i] = temp[i-lo];
		}
	}

}
