package testPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryRepresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = (long) 1e9;
		long temp = num;
		List al = new ArrayList();
		int i = 0;
		while(temp > 0) {
			al.add((num>>i)&1);
			temp = temp/2;
			i++;
		}
		Collections.reverse(al);
		for(int j = 0; j < al.size(); j++) {
			System.out.print(al.get(j));
			
		}
	}

}
