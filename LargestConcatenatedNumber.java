package testPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestConcatenatedNumber {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("49");
		list.add("73");
		list.add("58");
		list.add("30");
		list.add("72");
		list.add("44");
		list.add("78");
		list.add("23");
		printConcatenatedNumber(list);
	}

	private static void printConcatenatedNumber(List<String> list) {

		Collections.sort(list, new Comparator<String>() {
			
			public int compare(String X, String Y) {
				String XY = X+Y;
				String YX = Y+X;
				
				return XY.compareTo(YX) > 0 ? -1:1;
			}
		});
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

}
