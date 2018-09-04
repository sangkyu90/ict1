package conception2;

public class ClassTest {//애초에 Static 선언x
	int num;//멤버변수
	String str;
	
	public void test() {
		System.out.println("나는 누구겄?");
	}
	public static void main(String[]args) {
		ClassTest classTest = new ClassTest();//static이라서 가능, ct.test();메모리 생성할 때 자동으로 0으로 초기화 해줘서 초기화안해도 0으로 출력
															int num;//초기화 x 출력  x
		//static method면 test();그냥 호출 가능 하지만
		//static이 아니기때문에 classTest(누구의 것인지알려주구) .test(); 호출
															
		classTest.num = 10;
		classTest.test();
		
		(new ClassTest()).num = 10;
		(new ClassTest()).test();//0
		
		
	}
}
