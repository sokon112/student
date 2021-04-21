package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");			
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public List<EmpVO> select() {
		con = getConnection();
		String sql = "select * from emp_temp";
		
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMgr(rs.getInt("mgr"));
				vo.setHiredate(rs.getDate("hiredate"));
				vo.setSal(rs.getInt("sal"));
				vo.setComm(rs.getInt("comm"));
				vo.setDeptno(rs.getInt("deptno"));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public EmpVO selectOne(int empno) {
		String sql = "select * from emp_temp where empno=?";
		con = getConnection();
		EmpVO vo = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new EmpVO();
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMgr(rs.getInt("mgr"));
				vo.setHiredate(rs.getDate("hiredate"));
				vo.setSal(rs.getInt("sal"));
				vo.setComm(rs.getInt("comm"));
				vo.setDeptno(rs.getInt("deptno"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	return vo;	
	}
	
	public boolean insert(EmpVO vo) {
		boolean insertFlag = false;
		try {
			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
			sql+= "values(?,?,?,?,sysdate,?,?,?)";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getMgr());
			pstmt.setInt(5, vo.getSal());
			pstmt.setInt(6, vo.getComm());
			pstmt.setInt(7, vo.getDeptno());
			int result = pstmt.executeUpdate();
			if(result>0) {
				insertFlag = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return insertFlag;
	}
//	public boolean insert(int empno,String ename,String job,int mgr,int sal,int comm,int deptno) {
//		boolean insertFlag = false;
//		try {
//			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
//			sql+= "values(?,?,?,?,sysdate,?,?,?)";
//			con = getConnection();
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, empno);
//			pstmt.setString(2, ename);
//			pstmt.setString(3, job);
//			pstmt.setInt(4, mgr);
//			pstmt.setInt(5, sal);
//			pstmt.setInt(6, comm);
//			pstmt.setInt(7, deptno);
//			int result = pstmt.executeUpdate();
//			if(result>0) {
//				insertFlag = true;
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				pstmt.close();
//				con.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		return insertFlag;
//	}
	
	public boolean update(int empno, int comm ) {
		boolean updateFlag = false;
		try {
			String sql ="update emp_temp set comm=? where empno=?";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, comm);
			pstmt.setInt(2, empno);
			int result = pstmt.executeUpdate();
			if(result>0) {
				updateFlag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return updateFlag;
	}
	
	public boolean delete(int empno, String ename) {
		boolean deleteFlag=false;
		try {
			String sql = "delete from emp_temp where empno = ? and ename =?";
			con =getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2,ename);
			int result = pstmt.executeUpdate();
			if(result>0) {
				deleteFlag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
					
		}
		return deleteFlag;
	}

}
















