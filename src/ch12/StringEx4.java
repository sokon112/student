package ch12;

public class StringEx4 {
	public static void main(String[] args) {
		String str = "abcdefg";
		
		System.out.println(str.contains("ab"));
		
		String str1 = "자바프로그래";
		
//		if(str1.contains("프")) {
//			System.out.println("존재");
//		}else {
//			System.out.println("없음.");
//		}
		System.out.println(str1.contains("프")?"존재":"없음.");
		
		
		
		
	}
}
