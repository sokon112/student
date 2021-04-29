package dept;

import static emp.JdbcUtil.getConnection;

import java.sql.Connection;

public class DeptInsertService {
	public boolean deptInsert(DeptVO vo) {
	
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		
		
		return dao.insert(vo);
	}
}
