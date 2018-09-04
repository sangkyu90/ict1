package test20;

public class StaticTest {
	static int a = 10;//static영역은 자바가 먼저 읽음!
	static final int b = 20;//상수, 값 못바꿈, 클래스 메소드에 파이널을 넣을 수 있다.	
						//파이널 클래스는 상속! 불가!!!--마지막이라 수정 불가
						//파이널 메소드는 오버라이딩, 재정의가 안됨!!!!!!!
	public static void main(String[]args) {
		StaticTest.a = 12;//메모리생성 안해도 가능
		//StaticTest.b = 12;//절대 네버 못바꿈!!!!!!!!!!
		System.out.println(a);
		StaticTest st = new StaticTest();
		System.out.println(st.a);//초기화 되지 않음 위에서 변경했기때문에 변경값으로 출력
		
		
	}

}
