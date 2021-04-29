package dept;

import java.util.Scanner;

public class DeptGetAction implements Action{
	public void execute(Scanner sc){
		ConsoleUtil util = new ConsoleUtil();
		int deptno = util.deptGet(sc);
		
		DeptSelectOneService service = new DeptSelectOneService();
		DeptVO vo = service.getRow(deptno);
		
		if(vo!=null) {
			util.printGetMessage(vo);
		}else {
			util.printGetFailMessage(deptno);
		}
	}
}
