package testPackage;

import java.util.Arrays;

public class CountTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sides = {20, 67, 72, 83, 23, 59};
		Arrays.sort(sides);
		countTriangles(sides);
	}

	private static void countTriangles(int[] sides) {
		
		int count = 0;
		for(int i = 0; i < sides.length-2; i++) {
			int k = i+2;
			for(int j = i+1; j < sides.length-1; j++) {
				while(k < sides.length && sides[i]+sides[j] > sides[k]) {
					count += k-j;
					k++;
				}
			}
		}
		System.out.println(count);
	}
}
