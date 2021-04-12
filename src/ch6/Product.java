package ch6;

public class Product {
	private String code;
	private String name;
	private String company;
	private int price;
	private int discount;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
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
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
