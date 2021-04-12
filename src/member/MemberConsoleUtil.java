package member;

import java.util.Scanner;

public class MemberConsoleUtil {	
	
	//사용자로부터 회원 정보를 입력 받아 입력 받은 회원을 리턴
	Member getNewmember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요.");
		System.out.print("아이디\t: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("이름\t: ");
		String name = sc.nextLine();
		System.out.print("주소\t: ");
		String addr = sc.nextLine();
		System.out.print("이메일\t: ");
		String email = sc.nextLine();
		System.out.print("국가\t: ");
		String nation = sc.nextLine();
		System.out.print("나이\t: ");
		int age = Integer.parseInt(sc.nextLine());
		
		return new Member(id,name,addr,email,nation,age);
	}
	
	void printAddSuccessMessage(Member member) {
		if(member == null) {
			return;
		}
		System.out.println(member.getName()+" 회원 정보 추가 성공");
	}
	void printModifySuccessMessage() {
		System.out.println("수정 성공");
	}
	void printModifyFailMessage() {
		System.out.println("수정 실패");
		
	}
	void printRemoveSuccessMessage() {
		System.out.println("삭제 성공");
	}
	void printRemoveFailMessage() {
		System.out.println("삭제 실패");
	}
	void printMemberList(Member[] memArr) {
		int i=0;
		System.out.println("아이디\t이름\t\t주소\t\t이메일\t\t\t국가\t나이");
		while(true) {
			if(i>=memArr.length) {
				return;
			}
			if(memArr[i]==null) {
				i++;
				continue;
			}
			System.out.printf("%-6d\t%-12s\t%-12s\t%-18s\t%-6s\t%-3d\n"
					,memArr[i].getId(),memArr[i].getName(),memArr[i].getAddr()
					,memArr[i].getEmail(),memArr[i].getNation(),memArr[i].getAge()
					);
			i++;
		}
		
	}
	
	Member getUpdateMember(Scanner sc, Member[] memArr) {
		int i=0;
		int id;
		System.out.print("수정할 회원 ID : ");
		id = Integer.parseInt(sc.nextLine());
		while(true) {
			if(i>=memArr.length) {
				printModifyFailMessage();
				return null;
			}
			if(memArr[i].getId()==id) {
				System.out.print("변경할 주소를 입력하세요\n>> ");
				memArr[i].setAddr(sc.nextLine());
				System.out.print("변경할 이메일을 입력하세요\n>> ");
				memArr[i].setEmail(sc.nextLine());
				printModifySuccessMessage();
				return memArr[i];
			}
			i++;
		}
	}
	
	Member removeMember(Scanner sc, Member[] memArr) {
		int i=0;
		System.out.print("삭제할 회원 ID : ");
		int id = Integer.parseInt(sc.nextLine());
		Member deletedMember = null;
		while(true) {
			if(i>=memArr.length) {
				printRemoveFailMessage();
				return null;
			}
			if(memArr[i].getId()==id) {
				System.out.println("정말로 삭제하시겠습니까?");
				System.out.print("예: 1 아니오: 2   ");
				if(Integer.parseInt(sc.nextLine())==1) {
					deletedMember = memArr[i];
					memArr[i]=null;
					printRemoveSuccessMessage();
				}					
				return deletedMember;
			}
			i++;
		}
	}
	
	
	
	
	
	
}
