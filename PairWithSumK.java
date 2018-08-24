package testPackage;

public class PairWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,-2,8,3,15,-6,12};
		int k = 10;
		int lo = 0;
		int hi = arr.length-1;
		mergeSort(arr, lo, hi);	//Sorting the array
		checkSum(arr, k, lo, hi);
	}

	private static void checkSum(int[] arr, int k, int lo, int hi) {
		
		if(lo == hi) {
			System.out.println("Such pair not found");
			return;
		}
		if(arr[lo]+arr[hi] == k) {
			System.out.println("("+arr[lo]+","+arr[hi]+")");
			return;
		}
		else if(arr[lo]+arr[hi] < k) {
			lo++;
		}
		else if(arr[lo]+arr[hi] > k) {
			hi--;
		}
		checkSum(arr, k, lo, hi);
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
		for(int a = lo; a <= hi; a++) {
			arr[a] = temp[a-lo];
		}
	}
}
