package user2;

import java.util.List;
import java.util.Scanner;

public class ConsolUtil {

	public UserVO printAddMessege(Scanner sc) {
		UserVO vo = new UserVO();
		
		System.out.println("\n======== 회원 등록 ========");
		System.out.print("이름\t: ");
		vo.setUsername(sc.nextLine());
		System.out.print("출생년도\t: ");
		vo.setBirthYear(Integer.parseInt(sc.nextLine()));
		System.out.print("주소\t: ");
		vo.setAddr(sc.nextLine());
		System.out.print("전화번호\t: ");
		vo.setMobile(sc.nextLine());
		
		return vo;		
	}
	
	public void  printAddSuccessMessege() {
		System.out.println("입력이 성공하였습니다.\n");
	}

	public void printAddFailMessege(){
		System.out.println("입력이 실패하였습니다.\n");					
	}
	
	public int printSelectOneMessege(Scanner sc) {
		System.out.println("\n======== 특정 조회 ========");
		System.out.print("검색할 회원 번호 >> ");
		int no = Integer.parseInt(sc.nextLine());
		
		return no;
	}
	
	public void printSelectOneSuccessMessege(UserVO vo) {
		System.out.println("번호\t이름\t출생년도\t주소\t전화번호");
		System.out.printf("\n%d\t%s\t%d\t%s\t%s\n\n\n",
				vo.getNo(),vo.getUsername(),vo.getBirthYear(),
				vo.getAddr(),vo.getMobile());
		
	}
	
	public void printSelectOneFailMessege(int no) {
		System.out.println(no + "번의 회원이 없습니다. 다시 입력 바랍니다.");
	}
	
	public void printSelectAllMessege() {
		System.out.println("\n======== 전체 조회 ========");
		System.out.println("번호\t이름\t출생년도\t주소\t전화번호");		
	}
	
	public void printSelectAllSuccessMessege(List<UserVO> list) {
		for(UserVO vo:list) {
			System.out.printf("\n%d\t%s\t%d\t%s\t%s\n",
					vo.getNo(),vo.getUsername(),vo.getBirthYear(),
					vo.getAddr(),vo.getMobile());							
		}
		System.out.println("\n");
		
	}
	
	public void printSelectAllFailMessege() {
		System.out.println("조회할 내용이 없습니다.");
	}
	
	public UserVO printUpdateMessege(Scanner sc) {
		UserVO vo = new UserVO();
		System.out.println("\n======== 회원 정보 수정 ========");
		System.out.print("수정할 회원 번호 >> ");
		vo.setNo(Integer.parseInt(sc.nextLine()));

		System.out.println("바뀐 주소 >>");
		vo.setAddr(sc.nextLine());	
		System.out.println("바뀐 전화 번호 >>");
		vo.setMobile(sc.nextLine());	
		
		return vo;
	}
	
	public void printUpdateSuccessMessege() {
		System.out.println("수정이 성공했습니다.");
	}
	
	public void printUpdateFailMessege() {
		System.out.println("수정이 실패했습니다.");
	}
	
	public int printDeleteMessege(Scanner sc) {
		System.out.println("\n======== 회원 탈퇴 ========");
		System.out.print("탈퇴할 회원 번호 >> ");
		int no = Integer.parseInt(sc.nextLine());
		
		return no;
	}
	
	public void printDeleteSuccessMessege() {
		System.out.println("탈퇴가 성공하였습니다.");
	}
	
	public void printDeleteFailMessege() {
		System.out.println("탈퇴에 실패하였습니다.");
	}

}

























