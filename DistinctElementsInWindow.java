package testPackage;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementsInWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, -4, -3, -4, -2, 0, 2, -2, 6, 0};
		int k = 7;
		findDistinctElements(arr, k);
	}

	private static void findDistinctElements(int[] arr, int k) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i = 0; i < k; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
				count++;
			}
		}
		System.out.print(count+" ");
		for(int i = k; i < arr.length; i++) {
			if(map.get(arr[i-k]) == 1) {
				map.remove(arr[i-k]);
				count--;
			}
			else {
				map.put(arr[i-k], map.get(arr[i-k])-1);
			}
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
				count++;
			}
			System.out.print(count+" ");
		}
	}

}
