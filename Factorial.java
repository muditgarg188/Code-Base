package testPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 100;
		BigInteger fact = findFactorial(num);
		String str = fact.toString();
		System.out.println(str);
		int count = 0;
		if(str.endsWith("0")) {
			
			System.out.println(count);
		}
		else {
			System.out.println(0);
		}
	}

	private static BigInteger findFactorial(long num) {
		// TODO Auto-generated method stub
		BigInteger fact = new BigInteger("1");
		if(num == 1) {
			return fact;
		}
		for (int i = 2; i <= num; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
		return fact;
	}

}
