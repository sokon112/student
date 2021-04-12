package shopingmall;

public class CellPhone extends Product {

	private String carrier;
	
	public CellPhone(String pname, int price,String carrier) {
		super(pname, price);
		this.carrier = carrier;
	}

	@Override
	void printExtra() {
		System.out.println("통신사\t: "+carrier);
	}
}
