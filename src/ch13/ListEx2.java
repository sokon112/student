package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("java");
		list1.add("java");
		list1.add("jdbc");
		list1.add("oracle");
		list1.add("jsp");
		list1.add("servlet");
		
		
		for(String str:list1) {
			System.out.println(str);
		}
		
//		System.out.println(list1);
//		
//		System.out.println("size = "+list1.size());
//		
//		
//		list1.remove(3);
//		System.out.println(list1);
//		
//		
//		System.out.println(list1.indexOf("jsp"));
//		
//		System.out.println(list1.get(1));
//		
	}

}
