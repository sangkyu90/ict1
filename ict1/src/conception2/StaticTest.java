package conception2;

/*class Test{
	static int numSt;
}*/


public class StaticTest {
	static int numSt = 10;//우리가 초기화x 이미 메모리 생성 new계속해도 실행x
	int num = 20;
	
	public static void main(String[]args) {
		
		System.out.println(StaticTest.numSt);//생성안해도 
		
		StaticTest st = new StaticTest();//생성 해야만 st.num으로 읽으려고
		st.num = 100;
		
			StaticTest.numSt = 100;
		
		System.out.println(st.num);
		System.out.println(st.numSt);
		
		st= new StaticTest();
		System.out.println(st.num);
		System.out.println(st.numSt);
		
		
			StaticTest.numSt = 200;
		
		
		StaticTest st2 = new StaticTest();
		System.out.println(st2.num);
		System.out.println(st2.numSt);
		
		
		
		/*Test t = new Test();
		t.chNum();//method 호출
		*/
		 
		Test.chNum(30);
		
		System.out.println(StaticTest.numSt);//Test class 다른곳에서 값을 변경해서 변경된20으로 값출력
		
		
		
		//(new)아무리 초기화해도  초기화x static은 다동일
		
		
	
		
		
		
		
		
		
		
	
		
		
		
		
	
	}
}
