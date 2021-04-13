package ch14;

public class Util {
	public static <T> Box2<T> boxing(T t){
		Box2<T> box = new Box2<T>();
		box.setItem(t);
		return box;
	}
}
