package ch6;

public class GoodsStockEx {
	public static void main(String[] args) {
		//객체 생성
		GoodsStock goods1=new GoodsStock("p210215", 100);
		
		//메소드 호출 - 재고수량 추가
		goods1.addStock(20); 
		
		//재고수량 확인
		System.out.println("재고수량 : "+goods1.getStockNum());
		
		//메소드 호출 - 재고수량 감소
		goods1.subtractStock(40);
		
		//재고수량 확인
		System.out.println("재고수량 : "+goods1.getStockNum());
		
		
		
		GoodsStock goods2 = new GoodsStock("P210216", 0);
	}

}








