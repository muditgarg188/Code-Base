package testPackage;

public class PalindromeString {
	//Given a string, determine if it is a palindrome, 
	//considering only alphanumeric characters and ignoring cases.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "A man, a plan, a canal: Panama";
		A = A.toLowerCase().trim();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < A.length(); i++) {
			char x = A.charAt(i);
			if(((int)x >= 65 && (int)x <= 90)
					|| ((int)x >= 97 && (int)x <= 122)
					|| ((int)x >= 48 && (int)x <= 57)) {
				sb.append(x);
			}
		}
		String str = sb.toString();
		String rev = sb.reverse().toString();
		System.out.println(str);
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
