package basicLogic;
//방의 값이 큰 순서로 정렬
public class NumSort {
	public static void main(String[] args) {
		int[] arrNum = new int[3];
		
		arrNum[0] = 30;
		arrNum[1] = 20;
		arrNum[2] = 10;
		
		int i = 0;
		for(;i<arrNum.length;i++) {
			for(int j = i+1; j<arrNum.length;j++) {
				if(arrNum[i]>arrNum[j]) {
					int tmp = arrNum[i];
					arrNum[i]=arrNum[j];
					arrNum[j]=tmp;
					
				}
			}
		}	
		for( ;i<arrNum.length;i++) {
			System.out.println(arrNum[i]);
		}		
		
		int u = 1;
		System.out.println(u++);
		
		System.out.println(--u);
		//System.out.println(a);
		//System.out.println(s);
		
		long  x = 1024;
		
	/*
		int[] arrNum = new int[3];
		arrNum[0] = 30;
		arrNum[1] = 20;
		arrNum[2] = 10;

		for (int i = 0; i<arrNum.length; i++) {
			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] > arrNum[j]) {
					int tmp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = tmp;
				}
			}
		}
		
		for(int i=0 ;i<arrNum.length;i++) {
			System.out.println(arrNum[i]);
		}*/
	}
}
