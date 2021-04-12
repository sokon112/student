package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		List<Double> numbers = new ArrayList<Double>();
		
		System.out.println("실수 입력");
		String input = sc.nextLine();
		StringTokenizer token = new StringTokenizer(input);
		
		while(token.hasMoreElements()) {
			numbers.add(Double.parseDouble(token.nextToken()));
		}
		
		double max=0;
		for(Double value:numbers) {
			if(max<value) {
				max = value;
				
			}
		}
		double min =0;
		for(Double value:numbers) {
			if(min>value) {
				min = value;
				
			}
		}
		System.out.println("가장 큰 수는 "+max);
		System.out.println("가장 작은 수는 "+min);
	}
	
}
