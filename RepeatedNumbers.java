package testPackage;

import java.util.Map;
import java.util.TreeMap;

//Printing repeated numbers in an array in sorted manner
public class RepeatedNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1 ,5 ,2 ,8 ,1 ,4 ,7 ,4, 3, 6};
		findRepeatedNumbers(arr);
	}

	private static void findRepeatedNumbers(int[] arr) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], (map.get(arr[i])+1));
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
