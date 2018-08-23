package testPackage;

public class ComputeAPowerB {
    
    private static long power(long a, long b) {
    	long M=1000000007;
        long res = 1;
        a = a%M;
        while(b > 0) {
        	if((b&1)==1)
        		res = (res*a)%M;
        	b = b>>1;
        	a = (a*a)%M;
        }
        return res;
    }
    
    public static void main(String[] args) {
        long a = 1000000;
        long b = 1000000000;
        System.out.println(power(a,b));
    }
}

