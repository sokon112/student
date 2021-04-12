package ch7;

public class SubListString extends ListStirng {
	String name="성춘향";
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
		super.list();
		System.out.println(name+ "하위 클래스 이름");
	}
	
	public void writer() {
		System.out.println("하위 클래스의 name 값 : "+name);
		System.out.println("상위 클래스의 name 값 : "+super.name);
	}
}
