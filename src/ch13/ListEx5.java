package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {
		List<Member> members = new ArrayList<Member>();
		
		members.add(new Member("hong", "hong123"));
		members.add(new Member("kim", "kim123"));
		members.add(new Member("park", "park123"));
		members.add(new Member("lee", "lee123"));
		
//		System.out.println(members);
		
//		for(int i=0;i<members.size();i++) {
//			Member member = members.get(i);
//			System.out.println("아이디\t: "+member.getId());
//			System.out.println("비밀번호\t: "+member.getPassword());
//			System.out.println();
//		}
		for(Member member:members) {
			System.out.println("아이디\t: "+member.getId());
			System.out.println("비밀번호\t: "+member.getPassword());
			System.out.println();
		}
		
	}

}
