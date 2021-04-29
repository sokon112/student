package dept;

import java.util.Scanner;

public class DeptAddAction implements Action{

	public void execute(Scanner sc) {
		ConsoleUtil util = new ConsoleUtil();
		DeptVO vo = util.printAddMessage(sc);
		
		DeptInsertService service = new DeptInsertService();
		boolean result = service.deptInsert(vo);
		
		if(result) {
			util.printAddSuccessMessage();
		}else {
			util.printAddFailMessage();
		}
		
		
	}
}
