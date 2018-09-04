package conception;

public class Cons {
	
	public int num;
	
	
	Cons(){//호출시 무조건 실행
		System.out.println("나호출?");
	}
	
	
	Cons(int num){
		this.num = num;
	}
}
