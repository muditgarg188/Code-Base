package testPackage;

import java.util.Arrays;

public class FindingFrequencyByTwoBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-6 ,10 ,-1 ,20 ,-1 ,15 ,5 ,-1 ,15};
		int[] queryArr = {-1,10,8,15,20};
		Arrays.sort(arr);
		for(int i = 0; i < queryArr.length; i++) {
			System.out.println(findFrequency(arr, queryArr[i]));
		}
	}

	private static int findFrequency(int[] arr, int k) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = arr.length-1;
		int p1 = 0;
		int p2 = 0;
		p1 = searchNumberOccurence(arr, k, lo, hi, true);
		if(p1 == -1)
			return 0;
		else {
			p2 = searchNumberOccurence(arr, k, lo, hi, false);
			return p2-p1+1;
		}
	}

	private static int searchNumberOccurence(int[] arr, int k, int lo, int hi, boolean searchFirst) {
		// TODO Auto-generated method stub
		int result = -1;
		while(lo<=hi) {
			int mid = lo+(hi-lo)/2;
			if(k == arr[mid]) {
				result = mid;
				if(searchFirst)
					hi = mid-1;
				else
					lo = mid+1;
			}
			else if(k < arr[mid]) {
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		return result;
	}
}
