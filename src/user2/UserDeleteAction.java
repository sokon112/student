package user2;

import java.util.Scanner;

public class UserDeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		ConsolUtil util = new ConsolUtil();
		UserDeleteService service = new UserDeleteService();
		int no = util.printDeleteMessege(sc);
		
		if(service.del(no)) {
			util.printDeleteSuccessMessege();
		}else {
			util.printDeleteFailMessege();
		}
		
		
	}

}
