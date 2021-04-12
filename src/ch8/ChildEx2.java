package ch8;

public class ChildEx2 {

	public static void main(String[] args) {
		Parant parent1 = new Child();
		
		method1(parent1);
		method2(parent1);
		
		
		Parant parent2 = new Parant();
		
		method1(parent2);
		method2(parent2);
	}
	
	private static void method1(Parant parent) {
		if (parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1() - Child 변환 성공");
		}else {
			System.out.println("method1() - Child 변환 성공");

		}
	}
	private static void method2(Parant parent) {
		Child child = (Child)parent;	
		System.out.println("method2() - Child 변환 성공");
		}

}
