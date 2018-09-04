package reCheck;
//오버로딩은 같은 함수를 쓴것
//상속 오버라이딩 --함수명 동일!

public class PrintObject {
	String str = "poStr";

	public String toString() {
		return "이 클래스의 str이란 변수는" + str + "이라는 값을 가지고 있죠";
	}

	public static void main(String[] args) {

		String str = new String("str");
		System.out.println(str);

		PrintObject po = new PrintObject();
		System.out.println(po);

		/*
		 * String str = "Abc"; System.out.println(str);
		 * 
		 * PrintObject po = new PrintObject(); System.out.println(po.str);
		 * System.out.println(po.toString()); System.out.println(po);
		 * 
		 * 
		 * 
		 * String str1 = new String("Abc"); System.out.println(str1);
		 * 
		 * PrintObject po1 = new PrintObject(); System.out.println(po1.str);
		 * System.out.println(po1.toString()); System.out.println(po1);
		 */

	}
}
