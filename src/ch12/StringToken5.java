package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문장을 /로 구분하여입력하시오\n>>");
		StringTokenizer token  = new StringTokenizer(sc.nextLine(),"/");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
