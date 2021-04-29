package user2;

import static user2.JdbcUtil.*;

import java.sql.Connection;

public class UserDeleteService {
	
	public boolean del(int no) {
		boolean isDeleted = false;
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		if(dao.delete(no)>0) {
			commit(con);
			isDeleted = true;
		}else {
		rollback(con);
		}
		close(con);		
		
		return isDeleted;
		
	}
}
