package shopingmall;

import java.util.Scanner;

public class MyShop implements IShop {
	
	private String title;
	Product[] carts = new Product[5];
	User[] users = new User[5];
	Product[] products = new Product[10];
	String selUser;
	private int cartcount=0;
	
	Scanner sc = new Scanner(System.in);
	
	
	

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
//		int i=0;
		users[0] = new User("강호동", PayType.CARD);
		users[1] = new User("홍길동", PayType.CASH);
//		while(true) {
//			if
//			if(users[i]==null) {
//				users[i]=
//			}
//			i++;
//		}
		
	}

	@Override
	public void genProduct() {
		
		products[0] = new CellPhone("갤럭시", 13000000, "SKT");
		products[1] = new CellPhone("Apple", 12000000, "KT");
		products[2] = new CellPhone("갤럭시", 11000000, "LGT");
		products[3] = new SmartTV("삼성울트라HD", 100000000, "4K");
		products[4] = new SmartTV("LG전자", 80000000, "8K");
		products[5] = new SmartTV("삼성울트라HD", 10000000, "8K");
	}

	@Override
	public void start() {
		System.out.println(title+" : "+"메인화면 - 계정 선택");
		System.out.println("================================");
//		for(int i=0;i<users.length;i++) {
//			if(users[i]==null)break;
//			System.out.println("["+i+"] "+users[i].getName()+
//					"("+users[i].getPayType()+")");
//		}
		int i =0;
		for(User user:users) {
			if(user==null)break;
			System.out.println("["+i+"] "+user.getName()+
					"("+user.getPayType()+")");
			i++;
		}
		System.out.println("[x] 종료");
		System.out.print("선택 : ");
		String choice = sc.nextLine();
		switch(choice) {
		case "x":
		case "X":
			System.out.println(title+"을(를) 종료합니다.");
			break;
		default:
			int choiceNum = Integer.parseInt(choice);
			if(choiceNum>=5||users[choiceNum]==null){
				System.out.println("다시 입력 바랍니다.\n\n");
				start();
				break;	
			}
			else if(users[choiceNum]!=null) {
				System.out.println("## "+choice+" 선택 ##");
				selUser = choice;
				productList();
				break;
			}
			else{
				System.out.println("다시 입력 바랍니다.\n\n");
				start();
				break;	
			}
		}

	}
	
	void productList() {
		cartcount++;
		
		System.out.println(title+" : "+"상품목록 - 상품 선택");
		System.out.println("================================");
		
		int i=0;
		for(Product product:products) {
			if(product==null)break;
			System.out.print("["+i+"]");
			product.printDetail();
			i++;
		}
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String choice = sc.nextLine();
		
		if(cartcount >carts.length) {
			System.out.println("장바구니가 꽉 찼습니다.");
			System.out.println("계산 화면으로 넘어갑니다.");
			choice = "c";
		}
		
		switch(choice) {
		case "c":
		case "C":
			checkOut();
			break;				
		case "h":
		case "H":
			System.out.println("메인화면으로 갑니다.\n");
			start();
			break;				
		default:
			int choiceNum = Integer.parseInt(choice);
			if(choiceNum>=6||products[choiceNum]==null){
				System.out.println("다시 입력 바랍니다.\n\n");
			}
			else if(products[choiceNum]!=null) {
				System.out.println("["+choice+"] "+
						products[choiceNum].getPname()+" 선택\n");
				i=0;
				for(Product cart:carts) {
					if(cart==null) {
						carts[i] = products[choiceNum];
						break;
					}
					i++;
				}
			}
			else{
				System.out.println("다시 입력 바랍니다.\n");
			}
			productList();
			break;
		}
	}
	
	void checkOut() {
		System.out.println(title+" : "+"장바구니 - 선택 목록");
		System.out.println("================================");

		int i=1;
		int sum =0;
		int selUserNum =0;
		selUserNum = Integer.parseInt(selUser);
		for(Product cart:carts) {
			if(cart==null)break;
			System.out.print("["+i+"]"+cart.getPname()
				+"("+cart.getPrice()+"WON)\n");
			sum+=cart.getPrice();
			i++;
		}
		System.out.println("합계 : "+sum+"WON");
		System.out.println("================================");
		System.out.println("결제 방법 : "+users[selUserNum].getPayType());
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String choice = sc.nextLine();
		switch(choice) {
		case "p":
		case "P":
			productList();
			break;
		case "q":
		case "Q":
			System.out.println("결제가 완료되었습니다.\n시스템을 종료합니다.\n\n");
			break;
		default:
			System.out.println("다시 입력 바랍니다.\n\n");
			checkOut();
			break;
		}
		
	}

}
