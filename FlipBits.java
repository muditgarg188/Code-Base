package testPackage;

public class FlipBits {

	public static void main(String[] args) {
		long a = 549;
		long b = 24;
		long largerNum = 0;
		if(a-b > 0) {
			largerNum = a;
		}
		else {
			largerNum = b;
		}
		long bitCount = countBits(largerNum);
		int count = 0;
		for(int i = 0; i < bitCount; i++) {
			if(((a>>i)&1) != ((b>>i)&1)) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static long countBits(long num) {
		// TODO Auto-generated method stub
		long count = 0;
		while(num > 0) {
			 count ++;
			 num = num>>1;
		}
		return count;
	}
	
}
