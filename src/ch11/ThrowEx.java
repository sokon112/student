package ch11;

public class ThrowEx {

	public static void main(String[] args) {
		int arr[] = new int[0];
		
		try {
			System.out.println("합계 = "+getTotal(arr));
			System.out.println("합계 = "+getAverage(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static double getAverage(int arr[]) throws Exception {
		if(arr.length==0) {
			//강제 예외 생성
			throw new Exception("비어있는 배열입니다.");
			
		}
		return getTotal(arr)/arr.length;
	}
	
	static int getTotal(int arr[]) throws Exception {
		if(arr.length==0) {
			throw new Exception("비어있는 배열입니다.");
		}
		int total =0;
		for(int num:arr) {
			total+=num;
		}
		return total;
	}

}
