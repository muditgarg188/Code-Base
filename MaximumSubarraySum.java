package testPackage;

public class MaximumSubarraySum {
	public static void main(String[] args) {
		int[] arr = {1,5,-2,3,-15,10,6,-4,8,1,-25,4};
		int ans = arr[0];
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
	}
}