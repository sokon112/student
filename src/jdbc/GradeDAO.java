package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GradeDAO {

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
	
	public GradeVO selectOne(int grade) {
		String sql = "select * from salgrade where grade=?";
		con = getConnection();
		GradeVO vo = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, grade);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new GradeVO();
				vo.setGrade(rs.getInt("grade"));
				vo.setHisal(rs.getInt("hisal"));
				vo.setLosal(rs.getInt("losal"));
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
	
	public List<GradeVO> select() {
		con = getConnection();
		String sql = "select * from salgrade";
		GradeVO vo = null;
		
		List<GradeVO> list = new ArrayList<GradeVO>();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new GradeVO();
				vo.setGrade(rs.getInt("grade"));
				vo.setHisal(rs.getInt("hisal"));
				vo.setLosal(rs.getInt("losal"));
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

}
