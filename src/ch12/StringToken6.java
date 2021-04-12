package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run=true;
		while(true) {
			System.out.print("문장을 띄어쓰기로 구분하여입력하시오\n>>");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				System.out.println("종료");
				break;
			}
			StringTokenizer token  = new StringTokenizer(str," ");
			int count = 0;
			System.out.println(token.countTokens()+" 어절");
		}
	}
}
