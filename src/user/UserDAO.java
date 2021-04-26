package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static user.JdbcUtil.*;

public class UserDAO {
	
	private Connection con = getConnection();
	
	public UserDAO(Connection con) {
		this.con= con;
	}

	//결과값을 1개만 return시 무조건 vo로 리턴.
	public UserVO selectOne(int no){
		

		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String sql = "select * from userTBL where no=?";
		UserVO vo = new UserVO();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("userName"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return vo;
	}
	
	//리턴값이 여러개(또는 전체)일시 무조건 list로 리턴.
	public List<UserVO> getList(){
		List<UserVO> list = new ArrayList<UserVO>();
		

		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String sql = "select * from userTBL";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("userName"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return list;
	}
	
	// 수정,삭제,삽입은 성공의 갯수를 return을 함. => pstmt.excuteUpdate() : 성공한 행 갯수 return해줌.
	public int update(int no, String mobile, String addr) {
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String sql = "update userTBL set mobile=?,addr=? where no=? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mobile);
			pstmt.setString(2, addr);
			pstmt.setInt(3, no);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		
		return result;
	}
	
	public int delete(int no) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "delete from userTBL where no = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int insert(String userName,int birthYear,String mobile, String addr) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "insert into userTBL(no,userName,birthYear,addr,mobile)"
				+"values(user_seq.nextval,?,?,?,?)";
		UserVO vo = new UserVO();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setInt(2, birthYear);
			pstmt.setString(3, addr);
			pstmt.setString(4, mobile);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}	
	
}
