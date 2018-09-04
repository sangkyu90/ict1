package conception2;

public class FuncTest {

	public void add(int a, int b) {
		System.out.println("인트 더하기:"+(a+b));
	}
	public void add(long a, long b) {
		System.out.println("롱더하기:"+a+b);
	}
	public static void main(String[]args) {
		FuncTest ft = new FuncTest(); //위의 method들은 static이 아니기 때문에 메모리를 생성해서 호출
										//functest클래스 안에 있는 것 ,초기화, 모든것을 읽어서 호출 해준다.
									//FuncTest ft; ft = new FuncTest();	
		
		ft.add(1, 2);
		ft.add(12345678910l, 123456789102l);
		
		long a = 12345678910l;
		long b = 1234567895010l;
		
		System.out.println(a+b);
		
		
	}
}
