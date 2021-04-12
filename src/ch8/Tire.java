package ch8;

public class Tire {
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	public Tire(int maxRatation, String location) {
		super();
		this.maxRotation = maxRatation;
		this.location = location;
	}

	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명 :"+
					(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire  펑크 ***");
			return false;
		}
	}
}
