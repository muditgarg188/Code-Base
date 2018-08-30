package testPackage;

import java.util.Arrays;

public class PowerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] teamA = {1,4,5,7};
		int[] teamB = {2,3,8,10};
		Arrays.sort(teamA);
		Arrays.sort(teamB);
		getTeamAWinningChances(teamA, teamB);
	}

	private static void getTeamAWinningChances(int[] teamA, int[] teamB) {
		
		int p1 = 0;
		int p2 = 0;
		int count = 0;
		while(p1<teamA.length && p2<teamB.length) {
			if(teamA[p1] < teamB[p2]) {
				p1++;
			}
			else {
				p1++;
				p2++;
				count++;
			}
		}
		System.out.println(count);
	}

}
