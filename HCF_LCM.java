package testPackage;

public class HCF_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 605904;
		long b = 996510762;
		long hcf = hcf(a,b);
		long lcm = lcm(a,b);
		System.out.println(lcm+" "+hcf);
	}

	private static long lcm(long a, long b) {
		// TODO Auto-generated method stub
		long mul = a*b;
		return (mul/hcf(a, b));
	}

	private static long hcf(long a, long b) {
		// TODO Auto-generated method stub
		if(a == 0) {
			return b;
		}
		return hcf(b%a, a);
	}

}
