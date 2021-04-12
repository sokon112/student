package ch12;

public class StringEx11 {
	public static void main(String[] args) {
//		StringBuilder builder1 = new StringBuilder("Hello");
//		StringBuilder builder2 = new StringBuilder("Hello");
//		
//		String str1 = builder1.toString();
//		String str2 = builder2.toString();
//		
//		
//		System.out.println(builder1.equals(builder2));
//		System.out.println(str1.equals(str2));
		
		
		StringBuilder sb1 = new StringBuilder("java");
		sb1.append("Programming");
		System.out.println(sb1);
		
		sb1.insert(4,"Test");
		System.out.println(sb1);
		
		sb1.replace(6,10,"Book");
		System.out.println(sb1);
		
		
		StringBuilder sb2 = new StringBuilder("abcdefg");
		sb2.delete(0, 3);
		System.out.println(sb2);
		
		sb2.deleteCharAt(0);
		System.out.println(sb2);
	}
	
}
