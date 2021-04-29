package dept;

import java.util.Scanner;

public class DeptUpdateAction implements Action {
	@Override
	public void execute(Scanner sc) {
		DeptVO vo = new DeptVO();
		ConsoleUtil util = new ConsoleUtil();
		DeptUpdateService service = new DeptUpdateService();
		vo = util.printUpdateMessage(sc);
		
		if(service.deptUpdate(vo.getLoc(), vo.getDeptno())) {
			util.printUpdateSuccessMessage();
		}else {
			util.printUpdateFailMessage();
		}
		
	}
}
