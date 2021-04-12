package ch9;

public class CheckingAccount extends Account {

	public CheckingAccount() {
		System.out.println("CheckingAccount 기본 생성자");	
		}
	
	@Override
	void method1() {
		System.out.println("CheckingAccount method1();");
	}

}
