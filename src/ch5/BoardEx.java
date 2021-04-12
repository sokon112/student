package ch5;

import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		Board board[] = new Board[3];
		
		for(int i=0;i<board.length;i++) {
			board[i] = new Board();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for(Board brd:board) {
			System.out.print("글번호 : ");
			brd.num = Integer.parseInt(sc.nextLine());
			System.out.print("제  목 : ");
			brd.name = sc.nextLine();
			System.out.print("작성자 : ");
			brd.writer = sc.nextLine();
			System.out.print("내  용 : ");
			brd.memo = sc.nextLine();
			System.out.println();
		}
		for(Board brd:board) {
			System.out.printf("[%d번 글]\n",brd.num);
			System.out.println("제  목 : "+brd.name);
			System.out.println("작성자 : "+brd.writer);
			System.out.println("내  용 : "+brd.memo);
			System.out.println();
		}
	}

}
