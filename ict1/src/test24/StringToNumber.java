package test24;

import java.util.Scanner;

public class StringToNumber {
	
	static Scanner scan = new Scanner(System.in);
	static int num = 0;
	
	public static boolean parseInt() {
		String str = "";
		try {
			System.out.println("숫자를 입력하시오");
			str = scan.nextLine();
			num = Integer.parseInt(str);
			 return true;//위에 에러가 없어야지 실행
		} catch (NumberFormatException nfe) {
			System.out.println("너가 입력한 숫자는" + str+ "이구나");
			System.out.println("입력하라는거 왜 입력 안하나");
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("숫자변환프로그램시작");
		
		boolean isOk = true;
		while (isOk) {
			isOk = parseInt();
			
		}

		System.out.println("너가 입력한 숫자는" + num+ "이구나");
		System.out.println("프로그램이 정상 종료됨!");

		scan.close();

	}
}
