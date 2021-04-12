package ch7;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonus = new BonusPointAccount("2211", "홍길동이", 50000, 30);
		
		bonus.deposit(3000000);
		System.out.println("예금액 : "+bonus.getBalance());
		System.out.println("보너스 포인트 : "+bonus.getBonusPoint());
	}

}
