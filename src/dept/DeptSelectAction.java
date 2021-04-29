package dept;

import java.util.List;
import java.util.Scanner;

public class DeptSelectAction implements Action{
	public void execute(Scanner sc) {
		DeptSelectService service = new DeptSelectService();
		List<DeptVO> list =  service.getList();
		
		ConsoleUtil util = new ConsoleUtil();
		if(list.isEmpty()) {
			util.printListFailMessage();
		}else {
			util.printListSuccessMessage(list);
		}
		
	}
}
