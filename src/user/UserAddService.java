package user;

import java.sql.Connection;
import static user.JdbcUtil.*;

public class UserAddService {
	// 비즈니스 로직 처리 클래스
	// DB 작업 호출.
	
	
	public boolean addUser(String userName,int birthYear,String mobile, String addr) {
		boolean isAdd = false;
		
		
		Connection con = getConnection();
		
		UserDAO dao = new UserDAO(con);
		
		int result =dao.insert(userName, birthYear, addr, mobile);
		if(result>0) {
			commit(con);
			isAdd = true;
		}else {
			rollback(con);
		}
		close(con);
		return isAdd;
	}
}
