package testPackage;

public class PrintDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDiamond(11);
	}

	private static void printDiamond(int size) {
		// TODO Auto-generated method stub
		int loopRange = (size/2)+1;
		int z = 1;
		int innerRange = loopRange-2;
		for(int i = 1; i <= loopRange; i++) {
			if(i == 1) {
				for(int j = 1; j <= size/2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				continue;
			}
			for(int j = 1; j <= innerRange; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j <= z; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j <= innerRange; j++) {
				System.out.print(" ");
			}
			z += 2;
			innerRange--;
			System.out.println();
		}
		int lowerLoopRange = size-((size/2)+1);
		int y = z-4;
		for(int i = 1; i <= lowerLoopRange; i++) {
			if(i == lowerLoopRange) {
				for(int j = 1; j <= size/2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				continue;
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = y; j >= 1; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			y -= 2;
			System.out.println();
		}
	}

}
