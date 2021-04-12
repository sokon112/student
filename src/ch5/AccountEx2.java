package ch5;

public class AccountEx2 {
	public static void main(String[] args) {
		Account account =
				new Account("120-31-5689","홍길동",100000);
		
		account.deposit(50000);
		accountPrint(account);
		account.withdraw(30000);
		accountPrint(account);
		
		Account account2 =
				new Account("120-31-5799","성춘향",200000);
		
		account2.deposit(50000);
		accountPrint(account2);
		account2.withdraw(30000);
		accountPrint(account2);
				
	}
	static void accountPrint(Account obj) {
		System.out.println("잔액확인 : "+obj.balance);
	}
}
