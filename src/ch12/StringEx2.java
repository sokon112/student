package ch12;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		char ch1[] = new char[30];
		
		for(int i=0;i<str.length();i++) {
			ch1[i]=str.charAt(i);
		}
		for(int i=0;i<str.length();i++) {
			if(ch1[i]=='프') {
				System.out.println("프 존재");
				break;
			}	
			if(i==str.length()) {
				System.out.println("없음.");
			}
		}
	}
}
