package kimseokhyunTest;

public class Odd extends OddDetector {

	public Odd(int n) {
		super(n);
	}
	
	@Override
	public boolean isOdd() {
		if(getN()%2!=0) {
			System.out.printf("%d는 홀수 입니다.",getN());
			return true;
		}
		else {
			System.out.printf("%d는 짝수 입니다.",getN());
			return false;
		}
	}

}
