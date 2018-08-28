package testPackage;

import java.util.Arrays;

public class FindCeil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-6 ,10 ,-1 ,20 ,15 ,5};
		Arrays.sort(arr);
		int k = -1;
		int lo = 0;
		int hi = arr.length-1;
		int res = findCeil(arr, k, lo, hi);
		System.out.println(res);
	}

	private static int findCeil(int[] arr, int k, int lo, int hi) {

		if(k > arr[hi])	return Integer.MAX_VALUE;
		while(lo < hi) {
			int mid = lo+(hi-lo)/2;
			if(arr[mid] < k) {
				lo = mid+1;
			}
			else {
				hi = mid;
			}
		}
		return arr[hi];
	}

}
