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
			
			boolean flag2 = true;
			
			switch(menu1) {
			case 1:
				System.out.println("<<<<<<<<<<Database selected : EMP>>>>>>>>>>");
				flag2 = true;
				while(flag2) {
					System.out.println("------------------------------------------------");
					System.out.println("1.특정 사원 조회 | 2.전체 사원 조회 | 3.메인 | 4. 종료");
					System.out.println("------------------------------------------------");
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
						flag2 = false;
						System.out.println("메인화면으로 돌아갑니다.");
						break;
					case 4:
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
				while(flag2) {
					System.out.println("----------------------------------------------------------");
					System.out.println("1.특정 부서 조회 | 2.전체 부서 조회 | 3.부서 입력 | 4.메인 | 5. 종료");
					System.out.println("----------------------------------------------------------");
					System.out.print("메뉴 선택 : ");
					int menu2 = Integer.parseInt(sc.nextLine());
					switch(menu2) {
					case 1:
						System.out.println("부서번호 입력 >> ");
						int deptno = Integer.parseInt(sc.nextLine());
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
						String dname = sc.nextLine();
						System.out.print("부서 위치 >> ");
						String loc = sc.nextLine();
						
						if(deptdao.insert(deptno,dname,loc)) {
							System.out.println("입력이 성공하였습니다.");
						}else {
							System.out.println("입력이 실패하였습니다.");
						}						
						break;
					case 4:
						flag2 = false;
						System.out.println("메인화면으로 돌아갑니다.");
						break;
					case 5:
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
				//미완
				flag2 = true;
				while(flag2) {
					System.out.println("------------------------------------------------");
					System.out.println("1.특정 지점 조회 | 2.전체 지점 조회 | 3.메인 | 4. 종료");
					System.out.println("------------------------------------------------");
					System.out.print("메뉴 선택 : ");
					int menu2 = Integer.parseInt(sc.nextLine());
					switch(menu2) {
					case 1:
						System.out.println("부서번호 입력 >> ");
						int deptno = Integer.parseInt(sc.nextLine());
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
						flag2 = false;
						System.out.println("메인화면으로 돌아갑니다.");
						break;
					case 4:
						flag1 = false;
						flag2 = false;
						System.out.println("데이터베이스를 종료합니다.");
						break;
					default:
						System.out.println("잘못된 입력입니다.");
						break;						
					}				
					
				}
				GradeDAO gradedao = new GradeDAO();
				gradedao.select();				
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
