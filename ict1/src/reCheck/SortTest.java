package reCheck;

import java.util.Scanner;

public class SortTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를,로구분하여 입력");
		String str = scan.nextLine();	//str.length();가능
									//문자열의 길이를 알때
		
		//arrStr[1]<<이거 String 변수이므로 method호출가능     
		String[] arrStr = new String[5];//정해져있는 datatype이므로 class처럼 메서드를 가질 수 없음
		                       // 속성값만 가지고 있음
		
			arrStr = str.split(",");//String배열이지 String이 아님
			
			//arrStr.length();없음 arrStr.length;배열의 길이를 알때 길이 값
			int[] arrNum = new int[arrStr.length];//방길이 같음
		for(int i = 0; i<arrStr.length;i++) {
			arrNum[i]=Integer.parseInt(arrStr[i]);
		}
		
		
		
		for(int i = 0; i<arrNum.length;i++) {			
			for(int j = i+1;j<arrNum.length;j++) {
				if(arrNum[i]<arrNum[j]) {
					int tmp = arrNum[i];
					arrNum[i]=arrNum[j];
					arrNum[j]=tmp;					
				}
			
			}
		}
		
	
		for(int i = 0 ; i<arrNum.length;i++) {
			if(i<arrNum.length) {
				System.out.print(arrNum[i]+",");
			}else {
				System.out.print(arrNum[i]);
			}
			
		}
		/*String[] arrStr = str.split(",");
		 int[]arrNum = new int[arr.length];
		 for(int i = 0l)*/
		
		
		
		

	
	
	}
}
