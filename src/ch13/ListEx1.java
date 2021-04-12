package ch13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(10);
		list1.add(100);
		list1.add(1000);
		list1.add(10000);
		list1.add(100000);
		
		
		for(int i:list1) {
			System.out.println(i);
		}
		
		
		list1.sort(Comparator.reverseOrder());
		
		for(int i:list1) {
			System.out.println(i);
		}
	}

}
