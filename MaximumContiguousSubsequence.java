package testPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MaximumContiguousSubsequence {
	//print the length of the longest subsequence, 
	//The difference between 2 adjacent elements in the subsequence, 
	//after re-arrangement, should be exactly 1.
	public static void main(String[] args) {
		int[] arr = {1,2,3,11,12};
		findMaximumContiguousSubarray(arr);
	}

	private static void findMaximumContiguousSubarray(int[] arr) {
		//sorting the array first using Count Sort
		int M = 1000;
		int m = -1000;
		int[] countArr = new int[M-m+1];
		for(int i = 0; i < arr.length; i++) {
			countArr[arr[i]+Math.abs(m)]++;
		}
		int k = 0;
		for(int i = 0; i < countArr.length; i++) {
			for(int j = 0; j < countArr[i]; j++) {
				arr[k++] = i-Math.abs(m);
			}
		}
		Set finalSet = new HashSet();
		for(int i = 0; i < arr.length-1; i++) {
			if(Math.abs(arr[i]-arr[i+1]) == 1) {
				finalSet.add(arr[i]);
				finalSet.add(arr[i+1]);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>(finalSet);
		Collections.sort(list);
		ArrayList finalCountList = new ArrayList();
		int count = 1;
		for(int i = 0; i < list.size()-1; i++) {
			if(Math.abs(list.get(i)-list.get(i+1)) == 1) {
				count ++;
			}
			else {
				finalCountList.add(count);
				count = 1;
			}
		}
		finalCountList.add(count);
		Collections.sort(finalCountList);
		System.out.println(finalCountList.get(finalCountList.size()-1));
	}

}
