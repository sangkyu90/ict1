package basicLogic;
//배열의 방에 로또로 수 넣기
public class Lotto {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			double d = Math.random() * 10;// int로 변환하기전에 *10, 변환하고 *10은 0// int a = (int)(Math.random()*10;=>0-9
			int r = (int) d + 1;// int형태로 잘라주는데 소숫점은 무시

			int num = 4;
			int[] ary = new int[num];

			ary[i] = r;

			System.out.print(ary[i] + ",");
		}

		int[] arr = new int[6];

		for (int i = 0; i <= 5; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;// 1-45
			System.out.println(arr[i]);
		}

	}

}
