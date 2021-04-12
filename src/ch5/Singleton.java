package ch5;

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() {
		// TODO Auto-generated method stub

	}
	
	static Singleton getInstance() {
		if (singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
