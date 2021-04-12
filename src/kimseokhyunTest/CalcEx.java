package kimseokhyunTest;
//문제5
import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		int firstNum = 0;
		int secoundNum = 0;
		String operator;
		Calc calc = null;

		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Input Num1 : ");
		firstNum = Integer.parseInt(scanner.nextLine());
		System.out.printf("Input Num2 : ");
		secoundNum = Integer.parseInt(scanner.nextLine());
		System.out.printf("Input operator : ");
		operator = scanner.nextLine();
		
		switch(operator) {
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		calc.setValue(firstNum, secoundNum);
		System.out.println(calc.calculate());
		
		
	}

}
