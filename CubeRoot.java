package testPackage;

public class CubeRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 1000000000000000000l;
		long ans = findCubeRoot(Math.abs(num));
		if(num < 0) System.out.println(-ans);
		else System.out.println(ans);
	}

	private static long findCubeRoot(long num) {
		// TODO Auto-generated method stub
		if(num == 0 || num == 1) {
			return num;
		}
		long ans = 0;
		long start = 0;
		long end = num;
		while(start <= end) {
			long mid = start+(end-start)/2;
			if(mid == ((num/mid)/mid)) {
				return mid;
			}
			else if(mid < ((num/mid)/mid)) {
				start = mid+1;
				ans = mid;
			}
			else {
				end = mid-1;
			}
		}
		return ans;
	}

}
