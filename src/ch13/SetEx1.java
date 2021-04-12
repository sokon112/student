package ch13;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("git");
		set.add("jdbc");
		set.add("MySQL");
		set.add("swing");
		
		System.out.println(set);
		
		System.out.println(set.contains("jdbc"));
		
	}

}
