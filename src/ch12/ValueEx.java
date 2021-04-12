package ch12;

public class ValueEx {

	public static void main(String[] args) {
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		
		Value value3 = value1;
		
		
		System.out.println(value1==value2);
		
		//value 멤버 변수의 값이 같은지 파악하는 메소드로 오버라이딩 하여
		//기존의 주소를 비교하는 equals와는 다르게
		//true 반환.
		System.out.println(value1.equals(value2));
		
		//그냥 같은거.
//		System.out.println(value1.equals(value3));
		
		System.out.println(value1.toString());
		
		
		
	}

}
