package user2;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int menu = 0;
		
		while(run) {
			System.out.println("=========== 회원 관리 ===========");
			System.out.println("1. 등록 | 2. 전체조회 | 3. 특정조회");
			System.out.println("4. 수정 | 5. 탈   퇴 | 6. 종   료");
			System.out.println("===============================");
			System.out.print("메뉴 번호 >> ");
			menu = Integer.parseInt(sc.nextLine());
			Action action = null;
			switch(menu) {
			case 1:
				action= new UserAddAction();
				break;
			case 2:
				action= new UserSelectAllAction();
				break;
			case 3:
				action= new UserSelectOneAction();
				break;
			case 4:
				action= new UserUpdateAction();
				break;
				
			case 5:
				action= new UserDeleteAction();
				break;
			case 6:
				System.out.println("시스템을 종료합니다.");
				run = false;
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
			
			if(action!=null) {
				action.execute(sc);
			}
		}
	
	}
}
