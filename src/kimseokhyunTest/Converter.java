package kimseokhyunTest;
//문제4
import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"를"+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"를 입력하세요.>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환결과: "+res+getDestString()+"입니다.");
		scanner.close();
	}
	
	
}
