package ch8;

public class Car {
	
	Tire frontLeftTire = new Tire(6,"앞 왼쪽");
	Tire frontRightTire= new Tire(2,"앞 오른쪽");
	Tire backLeftTire= new Tire(3,"뒤 왼쪽");
	Tire backRightTire= new Tire(4,"뒤 오른쪽");
//	private Tire frontLeftTire = new Tire(6,"앞 왼쪽");
//	private Tire frontRightTire= new Tire(2,"앞 오른쪽");
//	private Tire backLeftTire= new Tire(3,"뒤 왼쪽");
//	private Tire backRightTire= new Tire(4,"뒤 오른쪽");
	
	String str;
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if(!frontLeftTire.roll()) {
			stop();
			return 1;
		}
		if(!frontRightTire.roll()) {
			stop();
			return 2;
		}
		if(!backLeftTire.roll()) {
			stop();
			return 3;
		}
		if(!backRightTire.roll()) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
