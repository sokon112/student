package ch12;

import java.util.StringTokenizer;

public class StringToken3 {
	public static void main(String[] args) {
		String str ="name=kitae&addr=seoul&age=21";
		StringTokenizer token  = new StringTokenizer(str,"&=");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
