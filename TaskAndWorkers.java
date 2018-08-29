package testPackage;

import java.util.ArrayList;
import java.util.Collections;

public class TaskAndWorkers {

	static ArrayList maxPartitions = new ArrayList();
	public static void main(String[] args) {
		
		int[] arr = {5,6,8,1,4,2,10,3,7,1};
		int k = 4;	//number of workers
		getTaskDistribution(arr, k);
		Collections.sort(maxPartitions);
		System.out.println(maxPartitions.get(0));
	}

	private static void getTaskDistribution(int[] arr, int k) {

		int lo = getMaxElement(arr);
		int hi = getSum(arr);
		while(lo < hi) {
			int mid = lo+(hi-lo)/2;
			if(isValidTaskDistribution(arr, mid, k) == true) {
				hi = mid;
			}
			else {
				lo = mid+1;
			}
		}
		return;
	}

	private static boolean isValidTaskDistribution(int[] arr, int mid, int k) {
		int sum = 0;
		ArrayList partitions = new ArrayList();
		for(int i = 0; i < arr.length; i++) {
			if(sum + arr[i] <= mid) {
				sum += arr[i];
			}
			else {
				partitions.add(sum);
				sum = arr[i];
			}
		}
		partitions.add(sum);
		if(partitions.size() <= k) {
			Collections.sort(partitions);
			maxPartitions.add(partitions.get(partitions.size()-1));
			return true;
		}
		return false;
	}

	private static int getMaxElement(int[] arr) {
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	private static int getSum(int[] arr) {

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
