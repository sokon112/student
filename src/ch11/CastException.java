package ch11;

public class CastException {

	public static void main(String[] args) {
		Dog dog = new Dog();
		change(dog);
		Cat cat = new Cat();
		change(cat);
		
	}
	public static void change(Animal animal) {
		if(animal instanceof Dog){	
			Dog dog = (Dog) animal;}
	}

}
