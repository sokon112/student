package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken7 {
	public static void main(String[] args) {
		
		int rand[] = new int[5]; 
		int count = 0;
		while(true) {
			count++;
			for(int i = 0; i<rand.length;i++){
				rand[i] = (int)(Math.random()*5+1);
				System.out.print(rand[i]+" ");
			}
			System.out.println();
			if(rand[0]==rand[1]&&rand[1]==rand[2]&&rand[0]==rand[3]&&rand[0]==rand[4]) {
				System.out.println(count+"회 성공");
				break;
			}
		}
	}
}
