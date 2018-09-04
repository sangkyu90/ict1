package conception;

public class FunctionTest {

	static void print(String str) {
		System.out.println(str);
	}
/**/
	static void print1() {
		
		
	}
	
	static void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	static int getNum() {
		return 0 ;//값은 상관없지만 int 데이터 타입으로
	}
	
	public static void main(String[] args) {
		print("aaaa");//static이라서 , 값의 데이터타입은 string!으로, method 데이터 타입은 void 값저장X
		//cf> error- print1("dd")
				
		sum(2,3);//데이터 타입이void 라 리턴 x
		
		int num = getNum();//int형 datatype으로 저장 가능!//static int geNum(){}
		
		String str = getNum()+"";
	
	}

}
