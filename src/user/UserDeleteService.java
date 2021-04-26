package user;

import static user.JdbcUtil.*;

import java.sql.Connection;

public class UserDeleteService {
	
	public boolean del(int no) {
		boolean isDeleted = false;
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		if(dao.delete(no)>0) isDeleted = true;
		
		close(con);		
		
		return isDeleted;
		
	}
}
