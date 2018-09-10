package testPackage;

public class RabinKarpStringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "yekicmsmartplrplsmartrplplmrpsmartrpsmartwmrmsmartsmart";
		String pattern = "smart";
		int patternOccurrences = getStringMatching(text, pattern);
		System.out.println(patternOccurrences);
	}

	private static int getStringMatching(String text, String pattern) {
		// TODO Auto-generated method stub
		int N = text.length();
		int M = pattern.length();
		int k = 1000000007;
		int p1 = 47;
		int p2 = 59;
		int occurrences = 0;
		if(N < M) return occurrences;
		//Making power array
		long[] pwr1 = new long[M+1];
		long[] pwr2 = new long[M+1];
		pwr1[0] = 1;
		pwr2[0] = 1;
		for(int i = 1; i <= M; i++) {
			pwr1[i] = (pwr1[i-1]*p1)%k;
			pwr2[i] = (pwr2[i-1]*p2)%k;
		}
		//Computing Hash function for Pattern and Text
		long Ha1 = 0;
		long Hb1 = 0;
		long Ha2 = 0;
		long Hb2 = 0;
		for(int i = 0; i < M; i++) {
			char x=text.charAt(i);
            char y=pattern.charAt(i);
            Ha1=(Ha1+((int)x)*pwr1[M-i])%k;
            Ha2=(Ha2+((int)x)*pwr2[M-i])%k;
            Hb1=(Hb1+((int)y)*pwr1[M-i])%k;
            Hb2=(Hb2+((int)y)*pwr2[M-i])%k;
		}
		if(Ha1 == Hb1 && Ha2 == Hb2) {
			occurrences++;
		}
		for(int i = M; i < N; i++) {
			char s = text.charAt(i-M);
            char e = text.charAt(i);
			Ha1 = ((Ha1-((int)s)*pwr1[M])*p1 + ((int)e)*p1)%k;
			if(Ha1 < 0)
				Ha1 = (Ha1+k)%k;
			Ha2 = ((Ha2-((int)s)*pwr2[M])*p2 + ((int)e)*p2)%k;
			if(Ha2 < 0)
				Ha2 = (Ha2+k)%k;
			if(Ha1 == Hb1 && Ha2 == Hb2) {
				occurrences++;
			}
		}
		return occurrences;
	}

}
