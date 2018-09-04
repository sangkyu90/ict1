package reCheck;

public class ThreeSixNine {
	public static void main(String[] args) {
		int ranNum = 100;

		int cnt = 0;

		for (int i = 1; i <= ranNum; i++) {
			String s = i + "";
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.println(s);
				cnt++;
			}
		}
		System.out.println("짝갯수" + cnt);

		for (int i = 1; i <= ranNum; i++) {
			String s = i + "";
			if (s.indexOf("3") != -1 || s.indexOf("6") != -1 || s.indexOf("9") != -1) {
				System.out.println(s);
				cnt++;
			}
		}
		System.out.println("짝갯수" + cnt);

	}
}
