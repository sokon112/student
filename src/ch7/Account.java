package ch7;

public class Account {
	//은행계좌 클래스
	//속성 - 계좌번호(210-25-12536),이름(홍길동),잔액(1000000)
	private String ano;
	private String owner;
	private int balance;
		
	public Account() {
		
	}

	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
		
	public String getAno() {
		return ano;
	}
	public void setNo(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//기능(동작) - 입금한다. 출금한다
		//입금한다(deposit) - 정수 매개변수 하나(입금액), 현재잔액 += 입금액, 리턴은 없음
		void deposit(int amount) {
			balance+=amount;
		}
		//출금한다(withdraw) - 정수 매개변수 하나(출금액), 현재잔액 -= 입금액, 현재 잔액 리턴
		int withdraw(int amount) {
			balance-=amount;
			return balance;
		}
}













