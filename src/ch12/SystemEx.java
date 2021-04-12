package ch12;

public class SystemEx {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		long sum=0;
		for(int i=0; i<1000000000;i++) {
			sum+=i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("1~1,000,000,000까지 합 : "+sum);
		System.out.println("소요 시간 : "+(end-start));
		
	}
}
