package user2;

import java.util.Scanner;

public class UserSelectOneAction implements Action{

	@Override
	public void execute(Scanner sc) {
		ConsolUtil util = new ConsolUtil();
		UserVO vo = new UserVO();
		UserSelectOneService service = new UserSelectOneService();
		int no = util.printSelectOneMessege(sc);
		
		vo = service.getUser(no);
		if(vo.getUsername() != null) {
			util.printSelectOneSuccessMessege(vo);
		}else {
			util.printSelectOneFailMessege(no);
		}
		
	}
	

}
