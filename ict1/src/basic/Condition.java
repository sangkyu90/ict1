package basic;

public class Condition {

	public static void main(String[] args) {
		boolean bl = 1 != 1;

		if (bl/* =true, bl, 1==1, 결과갑의 데이터 타입이 boolean이면 ok */) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
 
		int age = 33;
		if (age >= 40) {
			System.out.println("40대");
		} else if (age >= 30) {
			System.out.println("30대");
		} else if (age >= 20) {
			System.out.println("20대");
		} else if (age >= 20) {
			System.out.println("10대");
		} else {
			System.out.println("애기");
		}
		
		//구문실행 >순차적으로 이루어짐 따라서 조건 첫번째것이 실행하면 나머지는 조건이 같아도 실행하지 않음
		//else는 제일 마지막에 적기
	}

}
