package member;

import java.util.Scanner;

public class MemberUI {

	public static void main(String[] args) {
		boolean run = true;

		Scanner sc = new Scanner(System.in);
		
		MemberConsoleUtil util = new MemberConsoleUtil();
		
		Member[] members = new Member[10];
		
		
		while(run) {
			System.out.println("========회원 관리 프로그램=========");
			System.out.println("1.회원등록");
			System.out.println("2.회원목록보기");
			System.out.println("3.회원정보수정");
			System.out.println("4.회원정보삭제");
			System.out.println("5.프로그램종료");
			System.out.print("메뉴 선택 >> ");
			int select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1:
				Member newMember = util.getNewmember(sc);
				//배열에 담기
				for(int i=0;i<members.length;i++) {
					if(i==(members.length-1) && members[members.length-1]!=null) {
						System.out.println("회원모집이 마감되었습니다.");
						newMember = null;
					}
					if(members[i]==null) {
						members[i] = newMember;
						break;
					}
				}
				
				
				util.printAddSuccessMessage(newMember);
				break;
			case 2:
				util.printMemberList(members);
				break;
			case 3:
				util.getUpdateMember(sc, members);
				break;
			case 4:
				util.removeMember(sc, members);
				break;
			case 5:
				run=false;
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
				
					
			}
			
			
		}
		
	}

}
