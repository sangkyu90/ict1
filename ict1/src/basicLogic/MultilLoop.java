package basicLogic;
//구구단
public class MultilLoop {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println();
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			} // j가 아까 수명을 다해서 다시 int j =1; 부터 한다.
		}
	}

}
