package testPackage;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {

	
	static int count = 0;
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		int numOfDiscs = 3;
		solveTowerOfHanoi(numOfDiscs, 'A', 'C', 'B');
		
		System.out.println(count);
		for(String s : list) {
			System.out.println(s);
		}
		count = 0;
		list.clear();
	}

	private static void solveTowerOfHanoi(int numOfDiscs, char src, char dest, char temp) {
		if(numOfDiscs == 0) {
			return;
		}
		if(numOfDiscs == 1) {
			list.add("Move "+numOfDiscs+" from "+src+" to "+dest);
			count++;
			return;
		}
		solveTowerOfHanoi(numOfDiscs-1, src, temp, dest);
		list.add("Move "+numOfDiscs+" from "+src+" to "+dest);
		count++;
		solveTowerOfHanoi(numOfDiscs-1, temp, dest, src);
	}

}
