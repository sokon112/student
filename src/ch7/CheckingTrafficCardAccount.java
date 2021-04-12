package ch7;

public class CheckingTrafficCardAccount extends CheckingAccount {
	//교통카드 기능 여부.
	private boolean hasTafficCard;
	
	
	public CheckingTrafficCardAccount(String ano, String owner,
			int balance, String cardNo, boolean hasTafficCard){
		super(ano, owner, balance, cardNo);
		this.hasTafficCard = hasTafficCard;
		
	}
	
	int payTrafficCard(String cardNo,int amount) {
		if(!hasTafficCard) {
			System.out.println("교통 카드 기능이 없습니다.");
			return 0;
		}
		return pay(cardNo,amount);
	}

}
