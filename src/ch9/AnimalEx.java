package ch9;

public class AnimalEx {
	public static void main(String[] args) {
//		Animal animal = new Cat();
		animalSound(new Cat());
		animalSound(new Dog());
//		animal.sound();
//		
//		animal = new Dog();
//		animalSound(animal);
//		animal.sound();
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
