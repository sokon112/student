package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<String>();
		
		System.out.println("빈칸으로 분리하여 5개의 학점을 입력(A/B/C/D/E)");
		String input = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input);
		
		while(token.hasMoreTokens()) {
			list1.add(token.nextToken());			
		}
		
		String grade = null;
		
		for(String g:list1) {
			switch(g) {
			case "A":
			case "a":
				grade="4.0";
				break;
			case "B":
			case "b":
				grade="3.0";
				break;				
			case "C":
			case "c":
				grade="2.0";
				break;
			case "D":
			case "d":
				grade="1.0";
				break;
			case "E":
			case "e":
				grade="0.0";
				break;			
			default :
				System.out.println("잘못된 입력입니다. 다시입력바랍니다.");
				continue;
			}
			System.out.println("grade = "+grade+" ");
		}
				
		
	}

}
