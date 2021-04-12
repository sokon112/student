package ch5;

public class Account {
	//은행계좌 클래스
	//속성 - 계좌번호(210-25-12536),이름(홍길동),잔액(1000000)
	String accountNo;
	String name;
	int balance;
	

	//생성자 - 기본 생성자, 인자를 받는 생성자(속성 모두를 초기화할 수 있는)
//	Account(){}
//	Account(String accountNo,String name,int balance){
//		this.accountNo=accountNo;
//		this.name=name;
//		this.balance=balance;
//	}	
	
	
	public Account() {
		super();
	}
	public Account(String accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
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













