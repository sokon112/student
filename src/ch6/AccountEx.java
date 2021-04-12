package ch6;

public class AccountEx {

	public static void main(String[] args) {
		Account2 account = new Account2();
		
		account.setBalance(10000);
		System.out.println("잔고 : "+account.getBalance()+"원");
		account.setBalance(-100);
		System.out.println("잔고 : "+account.getBalance()+"원");
		account.setBalance(2000000);
		System.out.println("잔고 : "+account.getBalance()+"원");
		account.setBalance(300000);
		System.out.println("잔고 : "+account.getBalance()+"원");
	}

}
