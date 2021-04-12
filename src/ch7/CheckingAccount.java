package ch7;

public class CheckingAccount extends Account {

	private String cardNo;
	
	public CheckingAccount(String ano, String owner, int balance,String cardNo) {
		super(ano, owner, balance);
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) {
		if(!this.cardNo.equals(cardNo)||amount>getBalance()) {
			System.out.println("번호가 틀리거나 금액이 부족합니다.");
			return 0;
		}
		return withdraw(amount);	
		
	}
}
