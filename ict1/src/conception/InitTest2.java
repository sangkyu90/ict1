package conception;
//Q
public class InitTest2 {

	String str = "abc";
	int n = 10;
	
	int getInt() {
		return this.n;
	}
	public static void main(String[]args) {
		InitTest2 it = new InitTest2();
		
		it.n = 30;
		System.out.println(it.getInt());
		
		it = new InitTest2();
		System.out.println(it.getInt());
		
		
		
		
		//InitTest it = new InitTest();
		InitTest2 it2 = new InitTest2();
		//위의 두개 주소의 값은 다르나, string의 특수성으로 값만 비교해서 동일
		System.out.println(it.str==it2.str);
		System.out.println(it.str.equals(it2.str));
		
		
		
		String str = "abc";
		System.out.println(str.equals(it2.str));//value값만 비교!! 같을 때 True 값
		
		
		
	}
}
