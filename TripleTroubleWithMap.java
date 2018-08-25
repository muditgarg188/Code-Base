package testPackage;

import java.util.HashMap;
import java.util.Map;

public class TripleTroubleWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5 ,7 ,8 ,7 ,7 ,5 ,5 ,9 ,8 ,8};
		findSingleElement(arr);
	}

	private static void findSingleElement(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
