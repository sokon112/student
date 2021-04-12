package ch7;


final class FinalTest {
	final int MAX_SIZE = 10;
	
	String str;
	
	final int getMAX_SIZE() {
		final int LV = MAX_SIZE;
		return MAX_SIZE;
	}
}
