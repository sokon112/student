package ch6;

public class Account2 {
	//은행계좌 클래스
	//속성 - 계좌번호(210-25-12536),이름(홍길동),잔액(1000000)

	private int balance;
	final private int MIN_BALANCE = 0 ;
	final private int MAX_BALANCE = 1000000 ;
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE&& balance<=MAX_BALANCE)
			this.balance = balance;
	}
	
	
}













