package testPackage;

public class FirstMissingPositiveElement {	//Time Complexity N and space complexity 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5,3,8,1,6,4,1,2,50,8,-10};
		int res = getFirstMissingPositiveElement(arr, arr.length);
		System.out.println(res);
	}

	private static int getFirstMissingPositiveElement(int[] arr, int length) {
		// TODO Auto-generated method stub
		int irr = length+1000;
		for(int i = 0; i < length; i++) {
			if(arr[i] <= 0 || arr[i] > length) {
				arr[i] = irr;
			}
		}
		for(int i = 0; i < length; i++) {
			int abs = Math.abs(arr[i]);
			if(abs == irr) {
				arr[i] = -arr[i];
			}
			else {
				arr[abs-1] = -arr[abs-1];
			}
		}
		for(int i = 0; i < length; i++) {
			if(arr[i] > 0) {
				return arr[i]-1;
			}
		}
		return 0;
	}

}
