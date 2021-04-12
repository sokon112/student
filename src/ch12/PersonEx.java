package ch12;

public class PersonEx {

	public static void main(String[] args) {
		Person person1 = new Person("blue","BLUE");
		Person person2 = new Person("blue","BLUE");
		Person person3 = new Person("red","BLUE");
		Person person4 = new Person("blue","RED");
		
		
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
		System.out.println(person1.equals(person4));
		
		
		System.out.println(person1.toString());
	}

}
