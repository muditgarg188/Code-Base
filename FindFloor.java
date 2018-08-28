package testPackage;

import java.util.Arrays;

public class FindFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-6 ,10 ,-1 ,20 ,15 ,5};
		int k = 30;
		int lo = 0;
		int hi = arr.length-1;
		Arrays.sort(arr);
		System.out.println(findFloor(arr, k, lo, hi));
	}

	private static int findFloor(int[] arr, int k, int lo, int hi) {
		// TODO Auto-generated method stub
		if(k < arr[0]) {
			return Integer.MIN_VALUE;
		}
		while(lo < hi) {
			int mid = lo+(hi-lo+1)/2;
			if(k == arr[mid]) {
				return arr[mid];
			}
			else if(k < arr[mid]) {
				hi = mid-1;
			}
			else {
				lo = mid;
			}
		}
		return arr[lo];
	}

}
