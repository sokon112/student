package ch9;

public abstract class Animal {
	String kind;
	
	void breathe() {
		System.out.println("숨을 쉰다.");
	}
	abstract void sound();
}	
