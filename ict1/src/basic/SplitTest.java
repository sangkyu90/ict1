package basic;

import java.util.Scanner;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("학생들의 점수를 ,로 구분하여 입력하시오.");

		String pointStr = scan.nextLine();
		System.out.println(pointStr);
		String[] arrStr = pointStr.split(","); // 배열가능은length확인가능 , 방을 생성하면서 값을 넣어줌, 길이가 사용자 입력값에 따라 동적으로
		
		
		for (int i = 0; i < arrStr.length; i++) {
			String str = (i + 1) + "번째 학생 :" + arrStr[i];
			System.out.println(str);
			
		}

	}

}
