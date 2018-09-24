package testPackage;

import java.util.TreeMap;

public class WindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 4, k = 2;
		int[] arr = {11, 15, 12, 9};
		int sum = 0;
		TreeMap<Integer, Integer> tMap = new TreeMap<Integer, Integer>();
		for(int i = 0; i < k; i++) {
			if(tMap.containsKey(arr[i])) {
				tMap.put(arr[i], tMap.get(arr[i])+1);
			}
			else {
				tMap.put(arr[i], 1);
			}
		}
		sum += tMap.lastKey();
		for(int i = k; i < len; i++) {
			if(tMap.get(arr[i-k]) == 1) {
				tMap.remove(arr[i-k]);
			}
			else {
				tMap.put(arr[i-k], tMap.get(arr[i-k])-1);
			}
			if(tMap.containsKey(arr[i])) {
				tMap.put(arr[i], tMap.get(arr[i])+1);
			}
			else {
				tMap.put(arr[i], 1);
			}
			sum += tMap.lastKey();
		}
		System.out.println(sum);
	}

}
