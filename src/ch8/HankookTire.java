package ch8;

public class HankookTire extends Tire {

	public HankookTire(int maxRatation, String location) {
		super(maxRatation, location);
		}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명 :"+
					(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" Hankook Tire  펑크 ***");
			return false;
		}
	}
	
}
