package ch6;

public class TimeEx {

	public static void main(String[] args) {
		Time t = new Time();

		for(int i=0;i<=5;i++) {
			t.setHour((int)(Math.random()*11+1));
			t.setMinute((int)(Math.random()*59+1));
			t.setSecond((int)(Math.random()*59+1));
		
			System.out.printf(
				"현재시간  %02d:%02d:%02d\n",
				t.getHour(),t.getMinute(),t.getSecond()
			);
		}
		
	}

}
