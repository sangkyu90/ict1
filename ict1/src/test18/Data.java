package test18;

public class Data {
	//클래스안에서는 선안만 가능!!!!!!!!!!!!
	    int a = 3;
	
	public Data() {
		System.out.println("data생성자");
	}//정행지지 않는 데이터 타입을 생성할 때 만드는 것!
	//메소드와 차이:생성자는 리턴타입 아님 메서드인데 데이터 타입
	//클래스명만 같을 뿐 메서드이다. 변수나 메서드 호출 사용가능함 /실행과 메모리 오르는 것은 다르므로
	//모두 다 알고 있음 
	//
	
	public static void main(String[]args) {
		Data d = new Data();//기본생성자 가 눈에 보이지는 않지만 생김
		d.a = 10;
		if(d.a ==10) {
			d.a = 5;
			d = new Data();
		}
		System.out.println(d.a);
	}
}
