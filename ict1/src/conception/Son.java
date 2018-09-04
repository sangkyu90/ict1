package conception;

//상속, father의 메서드 변수 모두 가능하지만 private는 상속 불가
 //내가원하는 class를 넣어줌

//접근제어자가 상속받은 아빠의 것보다 더 커야 가능 함! public<protected<default<private//아빠가 default 인데 아들이 private이면 안됨
//아빠가 void이면 아들도 void여야함! 같은 함수!!
public class Son extends Father {
	
	public void test() {
		System.out.println("아들의 테스트 함수");
		this.run();//아들의 class에 run method없기 때문에 아빠의 super.run()을 가리킴
		//this.test(); 자기 자신은 error
		super.test();
		
	}
	public void work() {
		System.out.println("암 ~그룻");
	}
	String work(String a) {//return개념 
		return "abc";
	}

	public void work(int a) {//이건 OverLoading이므로 다른 함수
		System.out.println("암 ~그룻");
	}
	
	
	

	public static void main(String[] args) {
		
			Son s = new Son(); //메모리 생성해도 아빠변수와 메서드를 먼저 읽고 son에 가져오면 super
							
			s.test();//super.test();도 있지만 아들의 class에 있는 this.test();를 읽음
			         //그래서 아들의test()안에 있는 것이 출력됨 그렇다고 super가 없어지는 것은 아님
			
			s.work(1);
			
			s.work("d");
			System.out.println(s.work("d"));//<<data type이 String이라 가능
			
	}
}
