package conception;

public class Obj {// static으로 생성 , 선언 밖에 안됨!!ex>System.out.println("ab");, if, while
	int num = 3;
	boolean bl = true;

	// 감추는 용도
	private class Test {

	}

	void test2() {
		System.out.println(num);// 3
		int num = 10;
		System.out.println(num);// 10

		System.out.println(bl);
		test(); // 함수호출 하려면 선언한것이 있어야함//순서 상관x 호출 가능
	}

	void test() { // method 데이터 타입O >> void:아무것도 넘기지 x
		int num = 10;
		// 이거는 생성 했을 때 System.out.println(O.num);
		System.out.println(this.num);// class에선언된 3
	}

	// 함수의 선언 할때도 반드시 앞에 데이터 타입 선언 데이터 타입 >>int
	int getNum() {
		return 1; // 정해져있지 않은 데이터 타입의 초기화 값= null따라서 return null; 도가능

	}

	String getStr() {// 아무것도 접근제어자 선언되지 않을 시 default(다른pkg에서는 실행x)
		return "Abc";
	}

	Obj getObj() {
		return this;
	}

	// test();호출이 가능해야하지만 static void test(){}이 아니면 불가능, void 함수나갈때 return;
	public static void main(String[] args) {// 공공의 아무것도 저장x
		int num = 3;// class obj int num  3; 있지만 선언 가능, O.num으로 구분

		Obj o = new Obj();// static이 아닌 영역 호출이 불가능 했지만 객체 생성을 통해 ㅇ.무엇으로 호출가능
		o.num = 3;// 함수의 호출
		
		o.test();// o.test().num = 3; 같은 클래스 안에 있지만 test(){} 영역에 있는 선언된 num에는 접근 x

		
		
		Person[] ps = new Person[26];
		ps[0] = new Person(); // 정해져 있지 않는 데이터 타입이라 자동으로 null로 초기화/ 초기화 안하면 사용x
														// 같은 PKG안에 있으면 import 안해줘도 됨
		for (int a = 0; a < ps.length; a++) {
			ps[a] = new Person();
		}

		// 속성
		ps[0].name = "eunwoo";
		ps[0].age = 22;
		ps[0].address = "Seoul";

		// 행동-method
		ps[0].run();
		ps[0].eat();
		ps[0].sleep();

		ps[1] = new Person();
		ps[1].name = "jeongkuk";

		ps[2].name = "jimin";
		ps[2].sleep();

		// import 안하고 사용하는 법
		java.util.Scanner scan = new java.util.Scanner(System.in);

		String a = "a";
		String c = new String("a");
		System.out.println(a);
		System.out.println(c);   //c의 주소가 새로 생성되어서 값이 같아도 저장되는 주소 값이 다름

	}
}
