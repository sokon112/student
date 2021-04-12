package member;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.getAge();
		
		new Member().getAge();
		
		Member member2 = new Member(1212, "홍", "서울", "Sokon112@gmail.com", "대한민국", 120);
		
		System.out.println(member1);
		System.out.println(member2);
		
	}

}
