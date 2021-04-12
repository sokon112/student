package shopingmall;

public class SmartTV extends Product {
	
	private String resolution;
	
	public SmartTV(String pname, int price,String resolution) {
		super(pname, price);
		this.resolution = resolution;
	}	

	@Override
	void printExtra() {
		System.out.println("해상도\t : "+resolution);
	}
}
