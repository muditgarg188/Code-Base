package testPackage;

import java.util.HashMap;
import java.util.Map;

public class RepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1 ,3 ,2 ,3 ,4 ,6 ,5 ,5};
		findRepeatedNumbers(arr);
	}

	private static void findRepeatedNumbers(int[] arr) {
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
			if(entry.getValue() == 2) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
