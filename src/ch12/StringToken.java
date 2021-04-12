package ch12;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		StringTokenizer token  = new StringTokenizer("자바/프로/그래밍","/");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
