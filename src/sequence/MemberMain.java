package sequence;

import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag1 = true;
		boolean flag2 = true;
		int menu1=0;
		int menu2=0;
		MemberDAO memdao = new MemberDAO();
		
		while(flag1) {
			System.out.println("-------------메뉴------------");
			System.out.println("1.회원등록 | 2.회원조회 | 3.종료");
			System.out.println("----------------------------");
			System.out.print("메뉴 선택 >> ");
			menu1 = Integer.parseInt(sc.nextLine());
			switch(menu1) {
			case 1:
				System.out.println("\n 회원 등록");
				System.out.print("이름 >>");
				String userName = sc.nextLine();
				System.out.println(memdao.insert(userName)?"\n등록 성공\n":"\n등록 실패\n");
				break;
			case 2:
				flag2 = true;
				while(flag2) {
					System.out.println("-------------------메뉴------------------");
					System.out.println("1.회원 조회 | 2.전체 조회 | 3.메인화면 | 4.종료");
					System.out.println("----------------------------------------");
					System.out.print("메뉴 선택 >> ");
					menu2 = Integer.parseInt(sc.nextLine());
					
					switch(menu2) {
					case 1:
						System.out.println("\n회원 정보 검색");
						System.out.print("검색할 회원 번호 >>");
						int userNo = Integer.parseInt(sc.nextLine());
						MemberVO vo1 = memdao.getRow(userNo);
						System.out.println("\n번호\t이름");
						System.out.println(vo1.getUserNo()+"\t"+vo1.getUserName());						
						System.out.println();
						break;
					case 2:
						System.out.println("\n회원 전체 정보");
						System.out.println("번호\t이름");
						List<MemberVO> list = memdao.getList();
						for(MemberVO vo:list) {
							System.out.println(vo.getUserNo()+"\t"+vo.getUserName());
						}
						System.out.println();
						break;
					case 3:
						flag2=false;
						System.out.println("\n메인화면으로 돌아갑니다.\n");
						break;
					case 4:
						flag1=false;
						flag2=false;
						System.out.println("\n시스템 종료");
						break;
					default:
						System.out.println("\n잘못 입력되었습니다.\n");
						break;
					}
				}
				break;
			case 3:
				System.out.println("시스템 종료");
				flag1=false;
				break;
			default:
				System.out.println("잘못 입력되었습니다.");
				break;
				
			}
		}
		sc.close();
		
	}

}
