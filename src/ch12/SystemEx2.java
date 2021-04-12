package ch12;

public class SystemEx2 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i+"\t");
			
			if(i==5)System.exit(0);
		}
	}
}
