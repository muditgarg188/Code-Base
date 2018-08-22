package testPackage;

public class TrailingZeroesEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 20;
		long zeroCount = countZeroes(num);  
        System.out.println(zeroCount);
	}

	private static long countZeroes(long number) {
		long count = 0;
        for(long i = 5; number/i >=1; i *= 5) {
            count += (number/i);
        }
        return count;
	}

}
