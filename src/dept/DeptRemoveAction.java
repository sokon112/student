package dept;

import java.util.Scanner;

public class DeptRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) {
		ConsoleUtil util = new ConsoleUtil();
		DeptDeleteService service = new DeptDeleteService();
		int deptno = util.printDeleteMessage(sc);
		
		if(service.deptDelete(deptno)) {
			util.printDeleteSuccessMessage();
		}else {
			util.printDeleteFailMessage();
		}
		

	}

}
