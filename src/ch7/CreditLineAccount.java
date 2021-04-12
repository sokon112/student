package ch7;
//마이너스 통장 
public class CreditLineAccount extends Account {
	//마이너스 한도 필드
	private int creditLine;
	
	public CreditLineAccount(String ano, String owner, int balance,int creditLine) {
		super(ano, owner, balance);
		this.creditLine = creditLine;
	}
	
	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	public int getCreditLine() {
		return creditLine;
	}
	
	@Override
	int withdraw(int amount) {
		if((super.getBalance()+creditLine)<amount) {
			System.out.println("인출 불가");
			return 0;
		}
		super.setBalance(super.getBalance()-amount);
		return super.getBalance();
	}
	
}
