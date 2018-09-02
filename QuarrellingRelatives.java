package testPackage;

import java.util.Arrays;

public class QuarrellingRelatives {
	//Or Aggressive Cows
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] houses = {4,6,7,10,12,18,19,26,32,39,40,46,48,52,55};
		int[] houses = {1,2,8,4,9};
		int relatives = 3;
		Arrays.sort(houses);
		System.out.println(settleRelatives(houses, relatives));
	}

	private static int settleRelatives(int[] houses, int relatives) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = houses[houses.length-1];
		int max = -1;
		while(lo < hi) {
			int mid = lo+(hi-lo)/2;
			if(validateDistance(houses,relatives,mid) == true) {
				max = mid;
				lo = mid+1;
			}
			else {
				hi = mid;
			}
		}
		return max;
	}

	private static boolean validateDistance(int[] houses, int relatives, int mid) {
		// TODO Auto-generated method stub
		int count = 1;
		int prev = houses[0];
		for(int i = 1; i < houses.length; i++) {
			if(houses[i] - prev >= mid) {
				count++;
				prev = houses[i];
				if(count == relatives) {
					return true;
				}
			}
		}
		return false;
	}
}
