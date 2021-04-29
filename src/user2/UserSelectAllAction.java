package user2;

import java.util.List;
import java.util.Scanner;

public class UserSelectAllAction implements Action {

	@Override
	public void execute(Scanner sc) {
		ConsolUtil util = new ConsolUtil();
		UserSelectAllService service = new UserSelectAllService();
		List<UserVO> list = service.listAll();
		
		if(list!=null) {
			util.printSelectAllSuccessMessege(list);
		}else {
			util.printSelectAllFailMessege();
		}

	}

}
