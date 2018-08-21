package testPackage;

import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[] a = {4,6,5,3,3,1};
		Arrays.sort(a);
		ArrayList countList = new ArrayList();
		for(int i = 0; i < a.length-1; i++) {
			ArrayList al = new ArrayList();
			al.add(a[i]);
			for(int j = i+1; j < a.length; j++) {
				if(Math.abs(a[i]-a[j]) == 0 || Math.abs(a[i]-a[j]) == 1) {
					al.add(a[j]);
				}
			}
			//System.out.print(al.size()+" ");
			countList.add(al.size());
		}
		Collections.sort(countList);
		System.out.println(countList.get(countList.size()-1));
	}

}
