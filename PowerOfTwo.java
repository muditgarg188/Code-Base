package testPackage;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 4;
		if((a&(a-1)) == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
