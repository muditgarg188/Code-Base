package testPackage;

import java.util.ArrayList;

public class MergeSortedLists {
	//used 2 pointed technique
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(-4);
		a.add(3);
		b.add(-2);
		b.add(-2);
		ArrayList list = merge(a, b);
		System.out.println(list);
	}
	
	private static ArrayList merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(p1<a.size() && p2<b.size()) {
            if(a.get(p1) < b.get(p2)) {
                list.add(a.get(p1));
                p1++;
            }
            else {
                list.add(b.get(p2));
                p2++;
            }
        }
        while(p1<a.size()) {
            list.add(a.get(p1));
            p1++;
        }
        while(p2<b.size()) {
            list.add(b.get(p2));
            p2++;
        }
        a.clear();
        a.addAll(list);
        return a;
    }
}
