package test18;

public class SortTest {
	
	public static void method (int[] arr) {
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1;j< arr.length;j++){
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i]= arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0; i<arr.length;i++) {
			if(i<arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
			
			
		}
				
	}
 
	

	public static void main(String[]args) {
		int[] arr = new int[] {2,3,5,7,9,10,24,57};//방을만들면서 순서대로 초기화를함
		method(arr);
		
		printArr(arr);//매개변수가 배열이면 배열 변수를 넣는다.
		
		
	}
}
