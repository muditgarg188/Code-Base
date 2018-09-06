package testPackage;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{8,9,4},{7,6,5}};
		int N = 3;
		for(int x = 0; x < N/2; x++) {
			for(int y = x; y < N-x-1; y++) {
				int temp = arr[x][y];
				arr[x][y] = arr[N-1-y][x];
				arr[N-1-y][x] = arr[N-1-x][N-1-y];
				arr[N-1-x][N-1-y] = arr[y][N-1-x];
				arr[y][N-1-x] = temp;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
