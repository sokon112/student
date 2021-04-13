package ch14;

public class BoxEx3<T> {

	public static void main(String[] args) {
		Box3<Fruit> fruitbox = new Box3<Fruit>();
		Box3<Apple> applebox = new Box3<Apple>();
		Box3<Toy> box = new Box3<Toy>();
		
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());

		applebox.add(new Apple());
		
	}

}
