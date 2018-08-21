package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		List uniqueSocks = new ArrayList();
		int count = 0;
		Map<Object, Object> map = new HashMap<Object, Object>();
		int[] ar = {10,20,20,10,10,30,50,10,20};
		for(int i = 0; i < ar.length; i++) {
			list.add(ar[i]);
			if(uniqueSocks.contains(ar[i])) {
                continue;
            }
            else {
            	uniqueSocks.add(ar[i]);
            }
		}
		for(int i = 0; i < uniqueSocks.size(); i++) {
			map.put(uniqueSocks.get(i), Collections.frequency(list, uniqueSocks.get(i)));
		}
		for(Map.Entry<Object, Object> entry : map.entrySet()) {
			int div = Integer.parseInt(entry.getValue().toString())/2;
			if(div >= 1) {
				count = count + div;
			}
		}
		System.out.println(count);
	}

}
