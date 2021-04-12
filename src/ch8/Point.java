package ch8;

public class Point {
	int x,y;
	public Point() {
		
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	String getXY() {
		return"("+x+", "+y+")";
	}
}
