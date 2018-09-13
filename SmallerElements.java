package testPackage;

public class SmallerElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrLen = 6;
		long[] arr = {15, 35, 25, 10, 15, 12};
		int lo = 0;
		int hi = arrLen-1;
		long res = findSmallerElements(arr, lo, hi);
		System.out.println(res);
	}

	private static long findSmallerElements(long[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		long count = 0;
		if(arr.length == 1) return 0;
		if(lo < hi) {
			int mid = lo+(hi-lo)/2;
			count = findSmallerElements(arr, lo, mid);
			count += findSmallerElements(arr, mid+1, hi);
			count += merge(arr, lo, mid, hi);
		}
		return count;
	}

	private static long merge(long[] arr, int lo, int mid, int hi) {
		// TODO Auto-generated method stub
		long count = 0;
		long[] tempArr = new long[hi-lo+1];
		int p1 = lo;
		int p2 = mid+1;
		int k = 0;
		while(p1 <= mid && p2 <= hi) {
			if(arr[p1] < arr[p2]) {
				tempArr[k++] = arr[p1++];
			}
			else if(arr[p2] < arr[p1]) {
				count += mid-p1+1;
				tempArr[k++] = arr[p2++];
			}
			else {
				tempArr[k++] = arr[p1++];
			}
		}
		while(p1 <= mid) tempArr[k++] = arr[p1++];
		while(p2 <= hi) tempArr[k++] = arr[p2++];
		
		for(int i = lo; i <= hi; i++) {
			arr[i] = tempArr[i-lo];
		}
		return count;
	}
}
