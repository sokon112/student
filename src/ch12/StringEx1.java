package ch12;

public class StringEx1 {
	public static void main(String[] args) {
		String str = "Hello";
		char ch1[] = new char[10];
		
		for(int i=0;i<str.length();i++) {
			ch1[i]=str.charAt(i);
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(ch1[i]+"\t");
			
			
		}
		System.out.println();
		char ch[] = {'H','e','l','l','o'};
		String str2 = new String(ch);
		
		System.out.println(str);
		System.out.println(str2);
	}
}
