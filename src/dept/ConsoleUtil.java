package dept;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
	public int deptGet(Scanner sc) {
		System.err.println("부서 번호 입력 >>");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void printGetMessage(DeptVO vo) {
		System.out.print(vo.getDeptno()+"\t");
		System.out.print(vo.getDname()+"\t");
		System.out.println(vo.getLoc());
		System.out.println();
	}
	
	public void printGetFailMessage(int deptno) {
		System.out.println(deptno + " : 부서번호를 확인해주세요.");
	}
	
	public void printListFailMessage() {
		System.out.println("조회할 내용이 없음.");
	}
	
	public void printListSuccessMessage(List<DeptVO> list) {
		for(DeptVO vo1:list) {
			System.out.print(vo1.getDeptno()+"\t");
			System.out.print(vo1.getDname()+"\t");
			System.out.print(vo1.getLoc()+"\n");	
		}
	}
	
	public DeptVO printAddMessage(Scanner sc) {
		DeptVO vo = new DeptVO();
		System.out.println("\n부서정보 입력");
		System.out.print("부서번호 >> ");
		vo.setDeptno(Integer.parseInt(sc.nextLine()));
		System.out.print("부서명 >> ");
		vo.setDname(sc.nextLine());
		System.out.print("부서위치 >> ");
		vo.setLoc(sc.nextLine());
		
		return vo;
		
	}
	
	public void printAddSuccessMessage() {
		System.out.println("입력 성공");
	}
	
	public void printAddFailMessage() {
		System.out.println("입력 실패");
	}
	
	public int printDeleteMessage(Scanner sc ) {
		System.out.println("\n부서 정보 삭제");
		System.out.print("삭제할 부서 번호 입력 >> ");
		return Integer.parseInt(sc.nextLine());
		
	}
	
	public void printDeleteSuccessMessage() {
		System.out.println("삭제 성공");
	}
	
	public void printDeleteFailMessage() {
		System.out.println("삭제 실패");
	}
	
	public DeptVO printUpdateMessage(Scanner sc) {
		DeptVO vo = new DeptVO();
		System.out.println("\n부서 정보 수정");
		System.out.print("수정할 부서 번호 입력 >> ");
		vo.setDeptno(Integer.parseInt(sc.nextLine()));
		System.out.print("수정할 지역명 입력 >> ");
		vo.setLoc(sc.nextLine());
		return vo;
	}
	
	public void printUpdateSuccessMessage() {
		System.out.println("수정 성공");
	}
	
	public void printUpdateFailMessage() {
		System.out.println("수정 실패");
	}
	
	
}
