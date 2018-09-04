package basic;

//특정한 패턴이 있을 때 - 반복문
public class Loop2 {

	public static void main(String[] args) {
		int i = 1;
		for (int num = 1; num <= 10; num++) {// 처음 선언한것실행 후 끝;비교후 충족 될 시에만 출력!;출력후 동작
			System.out.println(num);// 11까지 확인하고 충족이 안되기에 출력 x 따라서 초기 값을 바깥으로 빼면, 최종갑 확인 가능
		}

		int max = 10;
		for (int e = 1, len = max/* 처음 선언 후 진행되지x */; e <= len; e++) {
			max++;// 20
			System.out.println(e);
		}
		
		// 무한루프
		/*
		 * for (int b = 1; b <= max; b++) {
		 *  max++; 
		 *  System.out.println(b); 
		 *  }
		 */
		
		
		int a = 1;
		for (; a <= 5; a++) {
			System.out.println(a);
		}
		System.out.println(a);// **6

		// 홀수출력
		int ag = 1;
		for (; ag <= 10; ag++) {
			if (ag % 2 != 0) {
				System.out.println("홀>" + ag);
			}
			System.out.println("홀>" + ag);
		}

		int b = 1;
		for (; b <= 10; b++) {
			if (b % 2 == 1) {
				System.out.println(b);
			}
			System.out.println(b);
		}
		
		
		// for문이 끝나면 v는 x 초기화 가능
		for (int v = 1; v <= 10; v++) {
			System.out.println(v);
		}

		int v = 1;
		for (; v < 3; v++) {
			System.out.println(v);
		}
		System.out.println(v);// **v==3

	}
}
