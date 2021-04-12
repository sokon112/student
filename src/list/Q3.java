package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> heights = new ArrayList<Integer>();
		
		System.out.println("12년부터 20년 사이의 키를 입력하시오.");
		System.out.print(">> ");
		
		String input = sc.nextLine();
		StringTokenizer token = new StringTokenizer(input);
		
		while(token.hasMoreElements()) {
			heights.add(Integer.parseInt(token.nextToken()));
		}
		//148 149 153 159 160 165 171 178
		
		int between = 0, pos = 0;
		for(int i=0;i<heights.size()-1;i++) {
			int diff = heights.get(i+1)-heights.get(i);
			if(between<diff) {
				between = diff;
				pos = i+2012;				
			}
		}
		System.out.println("키가 가장 많이 자란해는 "+pos+"년 이고 "+between+"cm 자람.");
	}
}
