package ch5;

public class PrinterEx {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		printer.println('A');
	}

}
