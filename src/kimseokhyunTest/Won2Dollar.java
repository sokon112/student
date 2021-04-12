package kimseokhyunTest;
//문제4
public class Won2Dollar extends Converter {

	@Override
	protected double convert(double src) {		
		return src/1200;
		
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}
