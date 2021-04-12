package ch5;

public class NumbersEx {

	public static void main(String[] args) {
		
		
		int arr[]= {75,95,69,11,23,84,25,47,35};
		Numbers obj = new Numbers(arr);
		
		
		
		System.out.println("합 : " +obj.getTotal());
		System.out.println("평균 : "+obj.getAverage());
	}

}
