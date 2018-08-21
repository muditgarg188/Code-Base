package testPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		List al = binaryRepresentation(num);
		long reversedNum = 0;
		for(int i = 0; i < al.size(); i++) {
			int a = Integer.parseInt(al.get(i).toString());
			long b = (long)java.lang.Math.pow(2, i);
			reversedNum += a*b;
		}
		System.out.println(reversedNum);
	}

	private static List binaryRepresentation(long num) {
		List al = new ArrayList();
		long temp = num;
		int i = 0;
		while(temp > 0) {
			al.add((num>>i)&1);
			temp = temp/2;
			i++;
		}
		Collections.reverse(al);
		int tempp = 32-al.size();
		for(int j = 0; j < tempp; j++) {
			al.add(j, 0);
		}
		return al;
	}

}
