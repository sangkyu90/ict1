package basic;

public class Area {

	public static void main(String[] args) {
		int a = 3;

		if (a == 3) {// if(boolean타입 / 변수의 선언x)
			int b = 10;
			if (b != 10/* b==10 이면 a값은 20! */) {
				a = 20;
			}
		}
		System.out.println(a);

		int c = 4;
		if (c == 4) {
			c = 10;
			if (c == 4) {
				c = 5;
			} else {
				int d = 30;
				c = d;
			}
		}
		System.out.println(c);
	}

}
