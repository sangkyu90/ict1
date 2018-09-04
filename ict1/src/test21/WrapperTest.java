package test21;

public class WrapperTest {
		
	public static void main(String[]args) {
		Integer i = 1;
		Integer i2 = 1;
		System.out.println(i==i2);
		
		Integer a = new Integer(2);//정해지지x 데이터 타입
		Integer a1 = new Integer(2);//
		//System.out.println(a==a1);//주소값이 달라서 false
		
		String s = 1+" ";
		String ab = s.toString();//정해지지x데이터 타입은 나만의 메서드를 다짐
		//객체선언만해도 출력되는것
		System.out.println(ab);//equals로 비교***
		
	}
}
