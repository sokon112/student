package ch10;

import java.util.Scanner;

public class MyAdderEx extends MyAdder{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyAdder adder = new MyAdder();
		
		int x,y;
		int maxNum = 0;
		
		System.out.printf("정수 2개 입력 > ");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println(adder.add(x,y));
		
		System.out.printf("정수 입력 > ");
		maxNum=sc.nextInt();
		System.out.println(adder.sumOnetoN(maxNum));
		
		
	}

}
