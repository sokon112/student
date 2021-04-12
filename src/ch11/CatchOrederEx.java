package ch11;

public class CatchOrederEx {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int op1 = Integer.parseInt(data1);
			int op2 = Integer.parseInt(data2);
			
			System.out.println(op1+op2);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("에러. 확인 필요");
//		}catch(NumberFormatException e){
//			System.out.println(e.getMessage());
//			
		}finally {
			System.out.println("무조건 실행");
		}
		
		
	}

}
