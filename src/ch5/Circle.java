package ch5;

public class Circle {
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	double getArea() {
		return radius*radius*3.14;
	}
}
