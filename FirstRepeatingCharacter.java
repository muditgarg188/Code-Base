package testPackage;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "algorithms";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		boolean flag = false;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
				flag = true;
				break;
			}
			else {
				flag = false;
			}
		}
		if(!flag) System.out.println(".");
	}

}
