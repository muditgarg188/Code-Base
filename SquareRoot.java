package testPackage;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sqrt = findSqrt(121);
		System.out.println(sqrt);
	}

	private static int findSqrt(int n) {
		// TODO Auto-generated method stub
		if(n == 0 || n == 1) {
			return n;
		}
		int ans = 0;
		int start = 1;
		int end = n;
		while(start <= end) {
			int mid = (start+end)/2;
			if(mid*mid == n) {
				return mid;
			}
			if(mid*mid < n) {
				start = mid + 1;
				ans = mid;
			}
			else {
				end = mid-1;
			}
		}
		return ans;
	}

}
