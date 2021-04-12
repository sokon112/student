package ch7;

public class CheckingAccountEx{

	public static void main(String[] args) {
		CheckingAccount obj = 
				new CheckingAccount(
						"111-11","홍길동",1000000,"555-666"
						);
		
		obj.deposit(100000);
		System.out.println("잔액 확인 : "+obj.getBalance());
		
		//오류 검토용 잘못된 카드번호 입력
		obj.pay("4444-44",1000);
		//정상동작 확인용 카드번호 입력	
		
		System.out.println("잔액 : "+obj.pay("555-666",20000));
		
	}

}
