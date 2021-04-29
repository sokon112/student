package user2;

import java.util.Scanner;

public class UserAddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		ConsolUtil util = new ConsolUtil();
		UserVO vo = util.printAddMessege(sc);
		
		UserAddService service = new UserAddService();
		
		if(service.addUser(vo.getUsername(), vo.getBirthYear(), vo.getAddr(), vo.getMobile())) {
			util.printAddSuccessMessege();
		}else {
			util.printAddFailMessege();
		}
		

	}

}
