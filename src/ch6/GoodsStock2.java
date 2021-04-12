package ch6;

public class GoodsStock2 {
	//상품 재고 관리를 위한 클래스
	//속성 - 상품코드(p210135), 재고수량(100)
	private String code;
	private int stockNum;	
	//생성자 - 기본 생성자, 인자를 받는 생성자(상품코드만 받는/상품코드와 재고수량 받는)
	
	//기능 - 재고를 더한다. 재고를 뺀다
	//재고를 더한다(addStock) : 정수형 매개변수(재고수량), 현재재고수량+=재고수량,리턴타입 없음
	void addStock(int amount) {
		stockNum+=amount;
	}
	//재고를 뺀다(subtractStock): 정수형 매개변수(재고수량), 현재재고수량-=재고수량,리턴타입 없음
	void subtractStock(int amount) {
		if(stockNum>amount) {
			stockNum-=amount;			
		}
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	
	public String getCode() {
		return code;
	}
	
	public int getStockNum() {
		return stockNum;
	}
}












