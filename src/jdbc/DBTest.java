package jdbc;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DBTest {

	//DB 연결용 객체
//	static Connection con = null;
	
	//서버쪽으로 SQL문을 전송하는 객체  
//	static PreparedStatement pstmt = null;
	
	//결과를 저장하는 객체 
//	static ResultSet rs = null;

	
	
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		boolean flag1 = true;
		
		while(flag1) {
			System.out.println("------------------------------------");
			System.out.println("1.emp | 2.dept | 3.salgrade | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("메뉴 선택 : ");
			int menu1 = Integer.parseInt(sc.nextLine());
			EmpDAO empdao = new EmpDAO();
			DeptDAO deptdao = new DeptDAO();
			GradeDAO gradedao = new GradeDAO();
			
			boolean flag2 = true;
			
			switch(menu1) {
			case 1:
				System.out.println("<<<<<<<<<<Database selected : EMP>>>>>>>>>>");
				flag2 = true;
				while(flag2) {

					System.out.println("---------------------------------------------");
					System.out.println("1.특정 사원 조회 | 2.전체 사원 조회 | 3.사원 추가 ");
					System.out.println("4.추가 수당 변경 | 5.사원 정보 삭제 | 6.메인 | 7. 종료 ");
					System.out.println("---------------------------------------------");
					System.out.print("메뉴 선택 : ");
					int menu2 = Integer.parseInt(sc.nextLine());
					switch(menu2) {
					case 1:
						System.out.println("사원번호 입력 >> ");
						int empno = Integer.parseInt(sc.nextLine());
						EmpVO vo = empdao.selectOne(empno);
						System.out.print(vo.getEmpno()+"\t");
						System.out.print(vo.getEname()+"\t");
						System.out.print(vo.getJob()+"\t");
						System.out.print(vo.getMgr()+"\t");
						System.out.print(vo.getHiredate()+"\t");
						System.out.print(vo.getSal()+"\t");
						System.out.print(vo.getComm()+"\t");
						System.out.println(vo.getDeptno());
						System.out.println();
						break;
					case 2:
						List<EmpVO> list = empdao.select();
						for(EmpVO vo1:list) {
							System.out.print(vo1.getEmpno()+"\t");
							System.out.print(vo1.getEname()+"\t");
							System.out.print(vo1.getJob()+"\t");
							System.out.print(vo1.getMgr()+"\t");
							System.out.print(vo1.getHiredate()+"\t");
							System.out.print(vo1.getSal()+"\t");
							System.out.print(vo1.getComm()+"\t");
							System.out.println(vo1.getDeptno());
							System.out.println();
						}
						break;
					case 3:
						System.out.println("사원 정보 입력");
						System.out.print("사원 번호 >> ");
						empno = Integer.parseInt(sc.nextLine());
						System.out.print("사원 이름 >> ");
						String ename = sc.nextLine();
						System.out.print("사원 직무 >> ");
						String job = sc.nextLine();
						System.out.print("담당 매니저 번호 >> ");
						int mgr = Integer.parseInt(sc.nextLine());
						System.out.print("급여 >> ");
						int sal = Integer.parseInt(sc.nextLine());
						System.out.print("추가 수당 >> ");
						int comm = Integer.parseInt(sc.nextLine());
						System.out.print("부서 번호 >> ");
						int deptno = Integer.parseInt(sc.nextLine());
						
//						if(empdao.insert(empno,ename,job,mgr,sal,comm,deptno)) {
//							System.out.println("입력이 성공하였습니다.");
//						}else {
//							System.out.println("입력이 실패하였습니다.");
//						}
						
						EmpVO vo1 = new EmpVO();
						vo1.setEmpno(empno);
						vo1.setEname(ename);
						vo1.setJob(job);
						vo1.setMgr(mgr);
						vo1.setSal(sal);
						vo1.setComm(comm);
						vo1.setDeptno(deptno);
						
						System.out.println(empdao.insert(vo1)
								?"입력이 성공하였습니다.":"입력이 실패하였습니다.");
						
						break;
					case 4:
						System.out.println("사원 보너스 변경");
						System.out.print("수정할 사원 번호 >> ");
						empno = Integer.parseInt(sc.nextLine());
						System.out.print("보너스 금액 >> ");
						comm = Integer.parseInt(sc.nextLine());
						
						if(empdao.update(empno,comm)) {
							System.out.println("수정이 성공하였습니다.");
						}else {
							System.out.println("수정이 실패하였습니다.");
						}						
						break;
						
					case 5:
						System.out.println("\n 사원 정보 삭제");
						System.out.print("삭제할 사원 번호 입력 >> ");
						empno = Integer.parseInt(sc.nextLine());
						System.out.print("삭제할 사원 이름 입력 >> ");
						ename = sc.nextLine();
						System.out.println(empdao.delete(empno,ename)
								?"삭제가 성공하였습니다.":"삭제가 실패하였습니다."); 
						break;						
					case 6:
						flag2 = false;
						System.out.println("메인화면으로 돌아갑니다.");
						break;
					case 7:
						flag1 = false;
						flag2 = false;
						System.out.println("데이터베이스를 종료합니다.");
						break;
					default:
						System.out.println("잘못된 입력입니다.");
						break;						
					}				
					
				}
				break;
			case 2:
				System.out.println("<<<<<<<<<<Database selected : DEPT>>>>>>>>>>");
				flag2 = true;
				int deptno = 0;
				String dname = null;
				String loc = null;
				
				while(flag2) {
					System.out.println("---------------------------------------------");
					System.out.println("1.특정 부서 조회 | 2.전체 부서 조회 | 3.부서 입력 ");
					System.out.println("4.부서 위치 변경 | 5.부서 정보 삭제 | 6.메인 | 7. 종료 ");
					System.out.println("---------------------------------------------");
					System.out.print("메뉴 선택 : ");
					int menu2 = Integer.parseInt(sc.nextLine());
					switch(menu2) {
					case 1:
						System.out.println("부서번호 입력 >> ");
						deptno = Integer.parseInt(sc.nextLine());
						DeptVO vo = deptdao.selectOne(deptno);
						
						System.out.print(vo.getDeptno()+"\t");
						System.out.print(vo.getDname()+"\t");
						System.out.println(vo.getLoc());
						System.out.println();
						break;
					case 2:
						List<DeptVO> list = deptdao.select();
						for(DeptVO vo1:list) {		
							
							System.out.print(vo1.getDeptno()+"\t");
							System.out.print(vo1.getDname()+"\t");
							System.out.println(vo1.getLoc());
							System.out.println();
						}
						break;
					case 3:
						System.out.println("부서 정보 입력");
						System.out.print("부서 번호 >> ");
						deptno = Integer.parseInt(sc.nextLine());
						System.out.print("부서 이름 >> ");
						dname = sc.nextLine();
						System.out.print("부서 위치 >> ");
						loc = sc.nextLine();
						
//						if(deptdao.insert(deptno,dname,loc)) {
//							System.out.println("입력이 성공하였습니다.");
//						}else {
//							System.out.println("입력이 실패하였습니다.");
//						}		
						
						DeptVO vo1 = new DeptVO();
						vo1.setDeptno(deptno);
						vo1.setDname(dname);
						vo1.setLoc(loc);
						System.out.println(deptdao.insert(vo1)
								?"입력이 성공하였습니다.":"입력이 실패하였습니다.");
						break;
					case 4:
						System.out.println("부서 위치 변경");
						System.out.print("수정할 부서 번호 >> ");
						deptno = Integer.parseInt(sc.nextLine());
						System.out.print("변경될 부서 위치 >> ");
						loc = sc.nextLine();
						
						if(deptdao.update(deptno,loc)) {
							System.out.println("수정이 성공하였습니다.");
						}else {
							System.out.println("수정이 실패하였습니다.");
						}						
						break;
						
					case 5:
						System.out.println("\n 부서 정보 삭제");
						System.out.print("삭제할 부서 번호 입력 >> ");
						deptno = Integer.parseInt(sc.nextLine());
						System.out.println(deptdao.delete(deptno)
								?"삭제가 성공하였습니다.":"삭제가 실패하였습니다."); 
						break;
					case 6:
						flag2 = false;
						System.out.println("메인화면으로 돌아갑니다.");
						break;
					case 7:
						flag1 = false;
						flag2 = false;
						System.out.println("데이터베이스를 종료합니다.");
						break;
					default:
						System.out.println("잘못된 입력입니다.");
						break;						
					}				
					
				}
				break;
			case 3:
				System.out.println("<<<<<<<<<<Database selected : SALGRADE>>>>>>>>>>");
			
				List<GradeVO> list = gradedao.select();
				for(GradeVO vo:list) {		
					
					System.out.print(vo.getGrade()+"\t");
					System.out.print(vo.getLosal()+"\t");
					System.out.println(vo.getHisal());
					System.out.println();
				}			
				break;
			case 4:
				flag1 = false;
				System.out.println("데이터베이스를 종료합니다.");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		sc.close();
	}
}
