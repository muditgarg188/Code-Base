package testPackage;

public class DivisorCount {

	public static void main(String[] args) {
		int count = divisorCount(10);
		System.out.println(count);
	}

	private static int divisorCount(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				//System.out.println(i);
				if(n % (n/i) == 0) {
					count ++;
					//System.out.println(n/i);
				}
				count++;
			}
		}
		if(n % Math.sqrt(n) == 0) {
			count --;
		}
		return count;
	}
}
