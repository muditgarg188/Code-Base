package testPackage;

public class Fibonacci {

	static long n1 = 0;
	static long n2 = 1;
	static long n3 = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 50;
		System.out.print(n1+","+n2);
		findFibonacci(N-2);
	}

	private static void findFibonacci(int N) {
		// TODO Auto-generated method stub
		if(N>0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(","+n3);
			findFibonacci(N-1);
		}
	}

}
