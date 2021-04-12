package ch12;

public class StringEx3 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		if(str.indexOf("프")>=0) {
			System.out.println("들어있음.");
		}
		else{
			System.out.println("없음.");
		}
		
		
		String str2 = "Hello";
		System.out.println(str2.indexOf('o'));
		System.out.println(str2.lastIndexOf('l'));
		System.out.println(str2.indexOf("l",3));
		System.out.println(str2.indexOf(68));
	}
}
