package testPackage;

public class FindingFrequency2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,3,1,2,5,7};
		//all elements are in range 1 to N (7 here)
		//find frequency of each element in O(N) and space complexity 1.
		for(int i = 0; i < arr.length; i++) {
			//add any random number (say 10, greater than length)
			//to index 1 less than arr[i]
			//%10 to prevent overflow in case value comes out to be greater than allowed length
			arr[arr[i]%10 - 1] += 10;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Frequency of " +(i+1) +" is "+ (arr[i]/10));
		}
	}

}
