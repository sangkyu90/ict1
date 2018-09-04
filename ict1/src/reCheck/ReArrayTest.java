package reCheck;

import java.util.Scanner;

//유효성 검사
public class ReArrayTest {

	public static boolean isDuple(int[] numArr, int num) {
		for (int n : numArr/*numArr[i]==num*/) {
			if (n == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] numArr = new int[5];

		for (int i = 0; i < numArr.length; i++) {
			System.out.println("숫자를 1부터 5까지 중 1개를 입력");
			String numStr = scan.nextLine();
			int num = Integer.parseInt(numStr);
			if (isDuple(numArr, num)) {
				i--;
				System.out.println("중복x");
				continue;

			}
			numArr[i] = num;

		}
		scan.close();

		/*
		 * if(num==1) { System.out.println("나서기좋아하냐"); }else if(num==2) {
		 * System.out.println("뀨뀨"); }else if(num==3) { System.out.println("바봉"); }else
		 * if(num==4) { System.out.println("데헷"); }else if(num==5) {
		 * System.out.println("우하하"); }else { System.out.println("error"); }
		 * 
		 * 
		 * System.out.println("입력수:"+numStr);
		 */
	}
}
