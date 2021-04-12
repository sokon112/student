package ch10;

public class MyAdder implements AdderInterface {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sumOnetoN(int n) {
		int sum=0;
		if(n<MIN_NUM) {
			System.out.println("0보다 작은 수가 입력되었습니다.");
			return 0;
		}
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
