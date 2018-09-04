package basic;

public class IntegerArray {
	public static void main(String[] arges) {

		int[] arr = new int[6];

		for (int i = 0; i <= 5; i++) {
			arr[i] = (int) (Math.random() * 45)+1;//1-45
			System.out.println(arr[i]);
		}
		
		

		/*
		 * //데이터 타입은 모두 배열로 가능 //IntegerArray[] ai = new IntegerArrary[5]; int size =
		 * 10; int[] arr = new int [size];
		 * 
		 * arr[0]=1;//방의 data type이 int라서 정수 대입 가능// but arr = 2; arr 는 배열이라 정수를 못넣음
		 * 
		 * //int a0 = arr[0]; 둘다 int라 가능
		 * 
		 * double d = Math.random()*10;//data type의 종류가 같으면 크기 비교 가능 //int random =
		 * Math.random()0.0~0.9;<<Math.random()이 소수포함이라 int 하면 오류
		 * 
		 * //형변환 int ran = (int)d+1; //값이 o 나와서 *10 하면 0-9 에서 +1하면 10 ran =
		 * (int)(Math.random()*10)+1;//1-10 *11(0-10) *46(0-45) *45+1(1-45)
		 */

	}

}
