package ch5;

public class Product {
	String code;
	String name;
	String company;
	int price;
	int discount;
	
	public Product(String code, String name, String company, int price, int discount) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
		this.discount = discount;
	}
	public Product(String code, String name, String company, int price) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	void changeDiscount(int discount) {
		this.discount = discount;
	}
	
	int calculation() {
		return price *(100-discount)/100;
	}
}
