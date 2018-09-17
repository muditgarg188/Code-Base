package testPackage;

import java.util.HashMap;
import java.util.Map;
//Given 2 strings A and B, find the smallest substring of B having all the characters of A, in any order.
public class EnclosingSubstring {

	public static void main(String[] args) {
		
		String pattern = "wwwr";
		String text = "ertyuiwwwipor";
		int len = text.length();
		int pLen = pattern.length();
		boolean validityCheck = validityCheck(len, pLen);
		if(validityCheck) {
			int minLen = Integer.MAX_VALUE;
			HashMap<Character, Integer> patternCount = getPatternCountMap(pattern);
			int i = 0;
			int j = pLen-1;
			String subString = text.substring(i, j+1);
			HashMap<Character, Integer> subStringCount = getTextSubStringCountMap(subString);
			boolean isValidSubString = compareTextSubstring(subStringCount, patternCount);
			if(isValidSubString) {
				minLen = Math.min(minLen, subString.length());
			}
			else {
				j++;
				char c = text.charAt(j);
				if(subStringCount.containsKey(c)) {
					subStringCount.put(c, subStringCount.get(c)+1);
				}
				else {
					subStringCount.put(c, 1);
				}
				while(i < len && j < len) {
					if(!compareTextSubstring(subStringCount, patternCount)) {
						j++;
						if(j < len) {
							char ch = text.charAt(j);
							if(subStringCount.containsKey(ch)) {
								subStringCount.put(ch, subStringCount.get(ch)+1);
							}
							else {
								subStringCount.put(ch, 1);
							}
						}
					}
					else {
						subString = text.substring(i, j+1);
						char ch = text.charAt(i);
						if(subStringCount.get(ch) == 1) {
							subStringCount.remove(ch);
						}
						else {
							subStringCount.put(ch, subStringCount.get(ch)-1);
						}
						i++;
						minLen = Math.min(minLen, subString.length());
					}
				}
			}
			if(minLen == Integer.MAX_VALUE) minLen = -1;
			System.out.println(minLen);
		}
		else {
			System.out.println(-1);
		}
	}
	
	private static HashMap<Character, Integer> getTextSubStringCountMap(
			String subString) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int len = subString.length();
		for(int i = 0; i < len; i++) {
			char c = subString.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		return map;
	}

	private static boolean validityCheck(int len, int pLen) {
		// TODO Auto-generated method stub
		if(pLen < len) return true;
		return false;
	}

	private static HashMap<Character, Integer> getPatternCountMap(
			String pattern) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int len = pattern.length();
		for(int i = 0; i < len; i++) {
			char c = pattern.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		return map;
	}
	
	private static boolean compareTextSubstring(HashMap<Character, Integer> subStringCount,
			HashMap<Character, Integer> patternCount) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(subStringCount.keySet().containsAll(patternCount.keySet())) {
			for(Map.Entry<Character, Integer> entry : patternCount.entrySet()) {
				if(subStringCount.get(entry.getKey()) >= entry.getValue()) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
		}
		if(flag) return flag;
		return false;
	}
}
