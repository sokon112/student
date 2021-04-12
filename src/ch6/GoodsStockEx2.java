package ch6;

public class GoodsStockEx2 {
	public static void main(String[] args) {
		//객체 생성
		GoodsStock2 goods1=new GoodsStock2();
		goods1.setCode("p210123");
		goods1.setStockNum(100);
		
		//메소드 호출 - 재고수량 추가
		goods1.addStock(20); 
		
		//재고수량 확인
		System.out.println(goods1.getCode()+" 재고수량 : "+goods1.getStockNum());
		
		//메소드 호출 - 재고수량 감소
		goods1.subtractStock(40);
		
		//재고수량 확인
		System.out.println(goods1.getCode()+" 재고수량 : "+goods1.getStockNum());
		
	}

}








