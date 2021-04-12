package member;

public class ClearScreen {
	private int i;
	private final int MAX_ARRAY = 25; 
	
	public void clearScreen(int j) {	

		if(j>MAX_ARRAY)j=MAX_ARRAY;
		while(i<j) {
			System.out.println();
			i++;
		}
	}
}
