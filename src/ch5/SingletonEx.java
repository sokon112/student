package ch5;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton single = new Singleton();
//		Singleton.singleton = null;
		
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		
		System.out.println(account1==account2?"1,2같음":"1,2다름");
		System.out.println(account2==account3?"2,3같음":"2,3다름");
		
		
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		Singleton single3 = Singleton.getInstance();
		Singleton single4 = Singleton.getInstance();
		
		System.out.println(single1==single2);
		System.out.println(single2==single3);
		System.out.println(single3==single4);
		System.out.println(single1==single4);
		
	}

}
