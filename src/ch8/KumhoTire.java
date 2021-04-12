package ch8;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRatation, String location) {
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
			System.out.println("*** "+location+" Kumho Tire  펑크 ***");
			return false;
		}
	}
	
}
