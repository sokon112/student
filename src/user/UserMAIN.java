package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMAIN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run1 = true;
		
		int menu1 = 0;
		int menu2 = 0;
		
		while(run1) {
			System.out.println("======== 회원 관리 ========");
			System.out.println("1. 등록 | 2. 조회 | 3. 수정");
			System.out.println("4. 탈퇴 | 5. 종료");
			System.out.println("=========================");
			System.out.print("메뉴 번호 >> ");
			menu1 = Integer.parseInt(sc.nextLine());
			switch(menu1) {
			case 1:
				UserAddService uas = new UserAddService();
				System.out.println("\n======== 회원 등록 ========");
				System.out.print("이름\t: ");
				String username =sc.nextLine();
				System.out.print("출생년도\t: ");
				int birthYear =Integer.parseInt(sc.nextLine());
				System.out.print("주소\t: ");
				String addr=sc.nextLine();
				System.out.print("전화번호\t: ");
				String mobile =sc.nextLine();
				if(uas.addUser(username, birthYear, addr, mobile)) {
					System.out.println("입력이 성공하였습니다.");
				}else {
					System.out.println("입력이 실패하였습니다.\n");					
				}
				
				break;
			case 2:
				boolean run2 = true;
				UserSelectOneService usos = new UserSelectOneService();
				while(run2) {
					System.out.println("\n======== 회원 조회 ========");
					System.out.println("1. 전체 조회 | 2. 특정 조회");
					System.out.println("3. 메인 화면 | 4. 종료");
					System.out.println("=========================");
					System.out.print("메뉴 번호 >> ");
					menu2 = Integer.parseInt(sc.nextLine());
					switch(menu2) {
					case 1:
						UserSelectAllService usas = new UserSelectAllService();
						List<UserVO> list = usas.listAll();
						System.out.println("\n======== 전체 조회 ========");
						System.out.println("번호\t이름\t출생년도\t주소\t전화번호");
						for(UserVO vo:list) {
							System.out.printf("\n%d\t%s\t%d\t%s\t%s\n",
									vo.getNo(),vo.getUsername(),vo.getBirthYear(),
									vo.getAddr(),vo.getMobile());							
						}
						System.out.println("\n");
						
						break;
					case 2:
						System.out.println("\n======== 특정 조회 ========");
						System.out.print("검색할 회원 번호 >> ");
						int no = Integer.parseInt(sc.nextLine());
						UserVO vo = usos.getUser(no);
						System.out.println("번호\t이름\t출생년도\t주소\t전화번호");
						System.out.printf("\n%d\t%s\t%d\t%s\t%s\n\n\n",
								vo.getNo(),vo.getUsername(),vo.getBirthYear(),
								vo.getAddr(),vo.getMobile());
						break;
					case 3:
						run2 = false;
						System.out.println("\n\n메인화면으로 돌아갑니다.");
						break;
					case 4:
						run1 = false;
						run2 = false;
						System.out.println("\n\n시스템을 종료합니다.");
						break;
					default:
						System.out.println("\n\n잘못된 입력입니다.");
						break;
					}
				}
				break;
			case 3:
				break;
			case 4:
				UserDeleteService uds = new UserDeleteService();
				System.out.println("\n======== 회원 탈퇴 ========");
				System.out.print("탈퇴할 회원 번호 >> ");
				int no = Integer.parseInt(sc.nextLine());
				System.out.println(uds.del(no)?"회원 탈퇴 완료":"회원 탈퇴 실패");
				break;
			case 5:
				run1 = false;
				System.out.println("\n\n시스템을 종료합니다.");
				break;
			default:
				System.out.println("\n\n잘못된 입력입니다.");
				break;
			}
		}
		
	}

}
