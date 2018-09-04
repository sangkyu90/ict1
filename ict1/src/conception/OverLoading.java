package conception;
//같은 이름으로 다른 을 해주고 싶을 때 OverLoading
public class OverLoading {
	
	
	
	public void print() {
		System.out.println("프린트 함수");
	}

	public void print(int a) {
		System.out.println("인트프린트 함수");
	}
	
	public void print(String a) {
		System.out.println("스트링프린트 함수");
	}
	
	public static void main(String[]args) {
		OverLoading mt = new OverLoading();
		mt.print();
		
	

		
	}
}
