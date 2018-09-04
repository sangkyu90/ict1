package conception;
/*
class Test {// <<<!!!!기본생성자 constructer!!!!>>>>
	int num =3;
	Test() {// 생략이 가능할 뿐 없는 것이 아님!!!!!!!
		System.out.println(thi.snum);
		this.test();
	}
	voidtest(){System.out.println("g")}
	*/

public  class Exec {

		public static void main(String[] args) {
			// carclass가있어서 데이터타입이라 배열마늘수있음

			Cons c = new Cons();
			System.out.println(c.num);//초기값0
			c=new Cons(10);//int를 가지고 있는 것을 호출
			System.out.println(c.num);
			// 호출시 무조건 실행
			
			//Test t = new Test();// 함수호출! class없어도 가능
			// 기본생성자!!!생성만 가능하지t.은 안됨, overLoading가능 
			//오버라이딩은안됨, 초기값생성, 반드시 무언가를 해야할때 **제일 먼저 실행하는것
			//생성자에서Test호출 , 
		
		
		
		
		
		}
		
	}

