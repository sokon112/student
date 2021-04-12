package ch6;

import java.util.Scanner;


public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int index=0;
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 >>> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				createAccount(); 
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("\n시스템 종료.");
				run = false;
				break;
			default:
				System.out.println("\n잘못된 선택입니다.\n");
				break;
			}
			
		}
	}
	//출금하기
	private static void withdraw() {
		System.out.printf("계좌번호를 입력바랍니다 \n >>>");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		
		if(acc==null) {
			System.out.println("해당 계좌를 찾을 수 없습니다.");
			return;
		}
		
		System.out.printf("%s님의 예금액 : %d\n",acc.getOwner(),acc.getBalance());
		System.out.print("출금할 금액을 입력 바랍니다 : ");
		int balance = 0;
		for(;;) {
			balance = Integer.parseInt(sc.nextLine());
			if(balance>acc.getBalance()) {
				System.out.println("예금 금액보다 많이 입력되었습니다.");
				System.out.println("다시 입력 바랍니다.");
			}
			else break;
		}
		acc.setBalance(acc.getBalance()-balance);
		System.out.println("출금 후 예금액 : "+acc.getBalance());	
		
	}
	//계좌생성
	private static void createAccount() {
		if(index==100)System.out.println("계좌를 더이상 생성할 수 없습니다.");
		else {
			System.out.print("계좌번호 >>");
			String ano = sc.nextLine();
			System.out.print("계좌주 >>");
			String owner = sc.nextLine();
			System.out.print("잔액 >>");
			int balance = Integer.parseInt(sc.nextLine());
		
			Account account = new Account(ano,owner,balance);
			accountArray[index] = account;
			index++;
		}
	}
	//목록 출력
	private static void accountList() {
		int j=0;
		System.out.println();
		if(accountArray[0]==null)System.out.println("저장된 계좌가 없습니다.");
			
		while(accountArray[j]!=null) {
			System.out.printf("계좌번호: %s\t 계좌주: %s\t 잔액: %d\n",
				accountArray[j].getAno(),accountArray[j].getOwner(),accountArray[j].getBalance());
			j++;
		}
		System.out.println();
		
	}
	//입금하기
	private static void deposit() {
		System.out.printf("계좌번호를 입력바랍니다 \n >>>");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		
		if(acc==null) {
			System.out.println("해당 계좌를 찾을 수 없습니다.");
			return;
		}
		
		System.out.printf("%s님의 예금액 : %d\n",acc.getOwner(),acc.getBalance());
		System.out.print("입금할 금액을 입력 바랍니다 : ");
		int balance = Integer.parseInt(sc.nextLine());
		acc.setBalance(balance+acc.getBalance());
		System.out.println("입금 후 예금액 : "+acc.getBalance());		
	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기.
	private static Account findAccount(String ano) {
		
		//강사님 구문.
//		Account findAcc=null;
//		for(Account acc:accountArray) {
//			if(acc!=null) {
//				if(acc.getAno().equals(ano)) {
//					findAcc = acc;
//				}
//			}
//		}
//		return findAcc;
//		
		int i=0;
		Account findAcc = null; 
		if(accountArray[0]==null)System.out.println("저장된 계좌가 없습니다.");
		
		while(accountArray[i]!=null) {
			if(accountArray[i].getAno().equals(ano)) {
				findAcc = accountArray[i];
				break;
			}
			i++;			
		}
		return findAcc;
	}
}

