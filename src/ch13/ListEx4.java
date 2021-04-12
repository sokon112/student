package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx4 {

	public static void main(String[] args) {
		
		Member member1 = new Member("hong", "hong123");
		Member member2 = new Member("kim", "kim123");
		Member member3 = new Member("park", "park123");
		Member member4 = new Member("lee", "lee123");
		
		
		List<Member> members = new ArrayList<Member>();
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		
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
