package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBselect2 {

	public static void main(String[] args) {
		Connection con = null;
		
		//서버쪽으로 SQL문을 전송하는 객체 
		PreparedStatement pstmt = null;
		
		//결과를 저장하는 객체 
		ResultSet rs = null;
		
		try {
			//드라이버 로드.
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			con = DriverManager.getConnection(url,user,password);
			if(con!=null) {
				System.out.println("연결되었습니다.");
				
				//emp table 내용 가져오기.
				String sql = "select * from emp where deptno = 10";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				System.out.println("empno\tename\tjob\tmgr\thirdate\tsal\tcomm\tdeptno\t");
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.print(rs.getInt(6)+"\t");
					System.out.print(rs.getInt(7)+"\t");
					System.out.print(rs.getInt(8)+"\t");
					System.out.println();
				}
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	}

}
