package ch7;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		CreditLineAccount obj =
				new CreditLineAccount("222-11", "박보검",20000, 10000000);
		
		
		System.out.println("잔액 : "+obj.withdraw(5000000));
		
	}

}
