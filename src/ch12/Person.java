package ch12;

public class Person {
	private String id;
	private String name;
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		if(this.id.equals(person.id) &&
				this.name.equals(person.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Person [id = "+id+", name = "+name+"]";
	}
	
	
}
