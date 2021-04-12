package kimseokhyunTest;
//문제5
public abstract class Calc {
	protected int a,b;
	void setValue(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}
