package shopingmall;

public class MyShopEx {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		
		shop.setTitle("TEST-SHOP");
		
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
