package reCheck;

import java.util.Scanner;

public class SScanner {

	public static void main(String[] args) {

		// 데이터 타입 String S:입력값, E:입력값 출력
		// 데이터 타입을 int로 바꿔서 입력값을 작은것에서 큰것 순으로 출력

		Scanner scan = new Scanner(System.in);

		System.out.println("시작값");
		String startNum = scan.nextLine();

		System.out.println("종료값");
		String endNum = scan.nextLine();

		System.out.println("Start" + startNum + ",end" + endNum);

		int sNum = Integer.parseInt(startNum);
		int eNum = Integer.parseInt(endNum);

		if (sNum > eNum) {
			int tmp = sNum;
			sNum = eNum;
			eNum = tmp;
		}
		for (int i = sNum; i <= eNum; i++) {
			System.out.println(i);
		}
		scan.close();

	}

}
