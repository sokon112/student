package user2;

import java.util.Scanner;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		ConsolUtil util = new ConsolUtil();
		UserVO vo = new UserVO();
		UserUpdateService service = new UserUpdateService();
		
		vo = util.printUpdateMessege(sc);
		boolean result = service.updateUser(vo.getMobile(), vo.getAddr(), vo.getNo());
		if(result) {
			util.printUpdateSuccessMessege();
		}else {
			util.printUpdateFailMessege();
		}
		

	}

}
