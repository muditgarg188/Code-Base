package testPackage;

public class ManachersAlgorithm {

	public static void main(String[] args) {
		// Implementation of Manacher’s algorithm
		String s = "pfyafafd";
		String sub = longestPalindrome(s);
		System.out.println(sub);
	}

	private static String longestPalindrome(String s) {
		// TODO Auto-generated method stub
		String T = preProcess(s);
		int n = T.length();
		int[] P = new int[n];
		int C = 0, R = 0;
		for (int i = 1; i < n-1; i++) {
		  int i_mirror = 2*C-i; // equals to i' = C - (i-C)
		  if(R > i)
			  P[i] = Math.min(R-i, P[i_mirror]);
		  else
			  P[i] = 0;
		    
		  // Attempt to expand palindrome centered at i
		  while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i]))
		    P[i]++;
		 
		    // If palindrome centered at i expand past R,
		    // adjust center based on expanded palindrome.
		  if (i + P[i] > R) {
		    C = i;
		    R = i + P[i];
		  }
		}
		int maxLen = 0;
		int centerIndex = 0;
		for (int i = 1; i < n-1; i++) {
			if (P[i] > maxLen) {
				maxLen = P[i];
				centerIndex = i;
			}
		}
		int startIndex = (centerIndex - 1 - maxLen)/2;
		int endIndex = startIndex+maxLen;
		return s.substring(startIndex, endIndex);
	}

	private static String preProcess(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		if (n == 0) return "^$";
		StringBuffer ret = new StringBuffer("^");
		for (int i = 0; i < n; i++)
			ret.append("#" + s.substring(i, i+1));
 
		ret.append("#$");
		return ret.toString();
	}

}
