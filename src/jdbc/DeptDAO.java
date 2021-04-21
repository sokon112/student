package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	//Connection/select/insert/update/delete
	
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
	
	public DeptVO selectOne(int deptno) {
		String sql = "select * from dept_temp where deptno=?";
		con = getConnection();
		DeptVO vo = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new DeptVO();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
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
	
	public List<DeptVO> select() {
		con = getConnection();
		String sql = "select * from dept_temp";
		DeptVO vo = null;
		
		List<DeptVO> list = new ArrayList<DeptVO>();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new DeptVO();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
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
				e.printStackTrace();
			}
		}
		return list;
	}
	
//	public boolean insert(int deptno, String dname, String loc) {
//		boolean insertFlag = false;
//		try {
//			String sql = "insert into dept_temp(deptno,dname,loc) values(?,?,?)";
//			con = getConnection();
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, deptno);
//			pstmt.setString(2, dname);
//			pstmt.setString(3, loc);
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
	
	public boolean update(int deptno, String loc ) {
		boolean updateFlag = false;
		try {
			String sql ="update dept_temp set loc=? where deptno=?";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, loc);
			pstmt.setInt(2, deptno);
			int result = pstmt.executeUpdate();
			if(result>0) {
				updateFlag=true;
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
		
		return updateFlag;
	}
	
	public boolean insert(DeptVO vo) {
		boolean insertFlag = false;
		try {
			String sql = "insert into dept_temp(deptno,dname,loc) values(?,?,?)";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getDeptno());
			pstmt.setString(2, vo.getDname());
			pstmt.setString(3, vo.getLoc());
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
	
	public boolean delete(int deptno) {
		boolean deleteFlag=false;
		try {
			String sql = "delete from dept_temp where deptno = ?";
			con =getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
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



























