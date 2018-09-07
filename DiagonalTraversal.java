package testPackage;

import java.util.ArrayList;

public class DiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{-2, -3, -6, -5, 50, 3},
						{8, 7, 10, -5, -3, 30},
						{6, 3, 70, 9, -20, -7},
						{-9, 9, -6, 7, 3, 2},
						{-1, 7, 7, 6, -4, 3},
						{8, 5, 6, -9, 40, 8}};
		int N = 6;
		int i = 0; int j = N-1; int z = j; int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int x = N-1; x >=0; x--) {	//running loop N times to make N slices out of 2N-1 slices
			while(j <= N-1) {
				sum += arr[i][j];
				i++;
				j++;
			}
			z--;
			i = 0; j = z;
			list.add(sum);
			sum = 0;
		}
		i = 1; j = 0; z = i;
		for(int x = N-2; x >=0; x--) { // running loop to make remaining slices
			while(i <= N-1) {
				sum += arr[i][j];
				i++;
				j++;
			}
			z++;
			j = 0; i = z;
			list.add(sum);
			sum = 0;
		}
		for(int k : list) {
            System.out.print(k+" ");
        }
		System.out.println();
	}

}
