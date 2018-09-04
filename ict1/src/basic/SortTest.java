package basic;

import java.util.Scanner;

public class SortTest {
	public static void main(String[] args) {//함수명 main{메서드 선언}

		int[] arr = new int[3];// int 저장공간 3개 생성후 주소값 arr 생성 후 대입

		// arr= 30;<<오류 int 형배열을 넣어야함 1)방을 만들어주고 넣음2)방을 만든동시에초기화
		// new로 방 새로 생성 후 주소에 넣은것 이라 호출 시 가지고 있는 것이 나오는 것이 아니라 주소값이 나옴

		// 정렬

		int[] arrNum = new int[5];
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 70;
		arrNum[3] = 50;
		arrNum[4] = 40;

		
		// * for (int i = 1; i <= 5; i++) { System.out.println(arrNum[i]); }//5가찍혀서 없는방이라
		// * 에러
		 

		for (int i = 0; i < 5; i++) {
			System.out.println(arrNum[i]);
		}

		// 동적으로 방갯수 생성 int size = 10; int[] arrNum = new int[size];<<방갯수 10
		// 사용자가 입력값으로 했을 때>>size를 max값으로 대입하거나, 직접 방갯수를 물어봄
		int size = 10;
		int[] arrNum3 = new int[size];
		arrNum3[0] = 10;
		arrNum3[1] = 20;
		arrNum3[2] = 70;
		arrNum3[3] = 50;
		arrNum3[4] = 40;

		for (int i = 0; i < arrNum3.length; i++) {//방갯수를 알려주는 것
			// System.out.println(arrNum3[i]);

			if (arrNum3[i] % 20 == 0 && arrNum3[i] != 0) {

				System.out.print(arrNum3[i]);
				System.out.println();
			}
		/*	String str = "abx";
					System.out.println(str.length());//length()>>호출
			
			String[] arrStr = new String[5];
			System.out.println(arrStr[0]);
			
			Scanner scan = new Scanner(System.in);//null;가지고 있는것이 x 오류//
			String str1 = scan.nextLine();
			System.out.println(str);
			
			*/
			
			
			
			
			
			
			
		/*	Scanner scan = null;
			System.out.println(scan);/초기화 해주어서 오류.x
			
			
			//String str1 ="";빈문자열 값 /String str2 = null;>>아무것도 없는 값 cf> null로 초기화된 방이 5개
		}

	/*	System.out.println(arrNum[0]);// arrNum에 넣은것이 아니라 arrNum0번째 방에 넣음

		int[] arrNum1 = new int[5]; // int data방을 5개 새로 만들어줘
		arrNum1[0] = 10;
		arrNum1[1] = 20;
		System.out.println(arrNum1[1]);// 값이 0이 아니라 초기화가 된것임!!**
		// cf> int a ; System.out.println(a); 했을시 0이아니라 오류
*/
	}
}
}
