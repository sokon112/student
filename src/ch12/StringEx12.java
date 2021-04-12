package ch12;

public class StringEx12 {
	public static void main(String[] args) {
		
		
		
		String str1 = "AbZquartKgu";
		
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		StringBuilder sb1 = new StringBuilder(str1);
		System.out.println(sb1.reverse());
		
		
	}
	
}
