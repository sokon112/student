package ch7;

public class BonusPointAccount extends Account {
	private int bonusPoint;

	public BonusPointAccount(String ano, String owner, int balance, int bonusPoint){
		super(ano, owner, balance);
		this.bonusPoint = bonusPoint;
	}
	
	@Override
	void deposit(int amount) {
		super.deposit(amount);
		setBonusPoint((int)(amount/100));
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint += bonusPoint;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	

}
