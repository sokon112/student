package ch5;

public class ReferenceParam {

	public static void main(String[] args) {
		int arr[] = {3,9,2,7,1,6,5,4,8};
		printArr(arr);
		System.out.println("배열의 합 : "+sumArr(arr));
		sortArr(arr);
		printArr(arr);
		
	}
	
	static void printArr(int arr[]) {
		for(int i :arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static int sumArr(int arr[]) {
		int sum =0;
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	static void sortArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
