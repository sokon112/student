package ch10;

public interface Account {
	
	int SPADE = 4;
	void test();
	void print();
	
	default int method2() {
		return 0;
	}
	static void method1() {
		
	}
	
}
