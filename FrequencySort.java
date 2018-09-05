package testPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class FrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {176,-272,-272,-45,269,-327,-945,176};
		frequencySort(arr);
	}

	private static void frequencySort(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
        	if(map.containsKey(arr[i])) {
        		map.put(arr[i], map.get(arr[i])+1);
        	}
        	else {
        		map.put(arr[i], 1);
        	}
        }
        Set<Entry<Integer, Integer>> set = map.entrySet();
        Comparator<Entry<Integer, Integer>> comp = new Comparator<Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				Integer i1 = o1.getValue();
				Integer i2 = o2.getValue();
				return i1.compareTo(i2);
			}
		};
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer,Integer>>(set);
		Collections.sort(list, comp);
		System.out.println(list);
		for(Entry<Integer, Integer> entry : list) {
			int frequency = entry.getValue();
			while(frequency!=0) {
				System.out.print(entry.getKey()+" ");
				frequency--;
			}
		}
    }
}
