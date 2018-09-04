package test19;

public class Arr {
//방을만들지 않고서는 누구의. 쩜을 사용할수 없다.
	public static void main(String[] args) {
		
		
		int[][] arr = new int[2][];
		arr[0] = new int[2];// 0번째 방에 인트배열이 들어감
		arr[1] = new int[3];
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
			}
			
		}
		
		System.out.println(arr[0][1]);
		
			

	System.out.println(arr.length);
	System.out.println(arr[0].length);
	System.out.println(arr[1].length);
	

		//i번째 층의 방갯수 System.out.println(i+"번째 층의 방 갯수 :"+arr[i].length);
		for(int i = 0 ;i<arr.length;i++) {
			//int[] tmpArr = arr[i];//int형 배열에 넣는다. 인트형배열을
				for(int j = 0; j<arr[i].length;j++) {
					arr[i][j] =(int)(Math.random()*10)+1;
				
			}
				
				
			
		}
		
		
		
		
		
	}

}
