package reCheck;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수,로구분");
		String pointstr = scan.nextLine();
		scan.close();

		String[] arrStr = pointstr.split(",");
		int[] arrNum = new int[arrStr.length];
		
		for (int i = 0; i < arrStr.length; i++) {
			arrNum[i] = Integer.parseInt(arrStr[i]);
			
		}
		
		for(int i=0;i<arrNum.length;i++) {
			for(int j = i+1; j<arrNum.length;j++) {
				if(arrNum[i]>arrNum[j]) {
					int tmp = arrNum[i];
					arrNum[i]=arrNum[j];
					arrNum[j]=tmp;
				}
			}
		}
		for(int i = 0; i<arrNum.length;i++) {
			System.out.println(arrNum[i]);
		}
		
		

	}

}
