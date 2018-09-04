package test24;

public class FunctionTest {
	public static void test() {
		System.out.println("함수시작");
		try {
			System.out.println("일단시도?");
			return;// 함수가 끝남
		}catch(Exception e) {
			System.out.println("에러");
		}
		System.out.println("함수끝");
	}
	public static void main(String[] args) {
		test();
	}
}
