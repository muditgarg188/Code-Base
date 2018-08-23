package testPackage;

import java.util.ArrayList;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] A = {1, 3, 8, 10, 13, 13, 16, 16, 16, 18, 21, 23, 24, 31, 31, 31, 33, 35, 35, 37, 37, 38, 40, 41, 43, 47, 47, 48, 48, 52, 52, 53, 53, 55, 56, 60, 60, 61, 61, 63, 63, 64, 66, 67, 67, 68, 69, 71, 80, 80, 80, 80, 80, 80, 81, 85, 87, 87, 88, 89, 90, 94, 95, 97, 98, 98, 100, 101};
		final int[] B = {5, 7, 14, 14, 25, 28, 28, 34, 35, 38, 38, 39, 46, 53, 65, 67, 69, 70, 78, 82, 94, 94, 98};
		findIntersection(A, B);
	}

	private static void findIntersection(int[] A, int[] B) {
		
		int p1 = 0;
		int p2 = 0;
		ArrayList res = new ArrayList();
		if(A.length==0 || B.length==0){
            System.out.println(res);
        }
		while(p1< A.length && p2 < B.length) {
			if(A[p1] == B[p2]) {
				res.add(A[p1]);
				p1++;
				p2++;
			}
			else if(A[p1] < B[p2]){
				p1++;
			}
			else {
				p2++;
			}
		}
		for(int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i)+" ");
		}
	}

	

}
