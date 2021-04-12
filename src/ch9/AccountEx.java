package ch9;

public class AccountEx {

	public static void main(String[] args) {
		
		// 추상 클래스 이므로 객체 생성 불가.
//		Account account = new Account();
		Account account = new CheckingAccount();
	}

}
