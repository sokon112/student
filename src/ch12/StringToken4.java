package ch12;

import java.util.StringTokenizer;

public class StringToken4 {
	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer token  = new StringTokenizer(expression,"=*()+/");
		
		while(token.hasMoreTokens()) {
			System.out.print(token.nextToken()+" ");
		}
	}
}
