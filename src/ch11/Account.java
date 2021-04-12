package ch11;

public class Account {
	private long balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance<money) {
			throw new BalanceInsufficientException("잔고 부족"
					+(money -balance));
		}
		balance -=money;
	}
}

