package ch6;

public class Account {
	//은행계좌 클래스
	//속성 - 계좌번호(210-25-12536),이름(홍길동),잔액(1000000)
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String no, String owner, int balance) {
		super();
		this.ano = no;
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
	
}













