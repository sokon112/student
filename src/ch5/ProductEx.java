package ch5;

public class ProductEx {

	public static void main(String[] args) {
		Product product = new Product("p123","모자","나이키",300000);
		
		product.changeDiscount(10);
		
		System.out.println("판매가 : "+product.calculation());

	}

}
