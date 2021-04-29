package dept;

import java.sql.Connection;
import static emp.JdbcUtil.*;


public class DeptSelectOneService {
	public DeptVO getRow(int deptno){
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);	
		
		DeptVO vo = dao.selectOne(deptno);
		
		close(con);
		
		return vo;
	}
}
