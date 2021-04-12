package ch5;

public class PhysicalInfo {
	String name;
	int age;
	float height;
	float weight;
	
	//메소드 오버로디
	void update(int age) {
		this.age = age;
	}
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
