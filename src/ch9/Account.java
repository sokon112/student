package ch9;

public abstract class Account {
	
	String name;
	
	public Account() {
		System.out.println("Account 기본 생성자.");
	}
	//추상 메소드
	abstract void method1();
	//일반 메소드
	void method2() {
		
	}
}
