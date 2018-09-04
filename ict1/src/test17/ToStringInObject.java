package test17;

public class ToStringInObject {

	public String toString() {
		return "아빠거 아니고 내 투스트링";
	}
	
	
	public static void print (String someText) {
		String str = someText.toString();
		System.out.println(str);
	}
	
	public static void print(Object someObject) {
		String str = someObject.toString();
		System.out.println(str);
		
		//object클래스를 상속받아서 그러므로 오브젝트 메소드를 오버라이딩 하여서 사용해야함!
		//정해지지x데이터 타입 두가지버전으로 실행됨 string넘김 받을 때랑 > object 넘김받을 때랑 >
												    //디폴트  메모리주소 읽음 
	}
	
	
	public static void main(String[]args) {
		String str = "sksks";
		print( str);
		
		ToStringInObject test = new ToStringInObject();
		print(test.toString());//내 객체를 생성해서	//아빠의 투스트링이 아니라 나의 투스트링이 실행됨!
			///////////기본으로 생략되어있지만 불러온다.
		//오버라이딩으로 toString1()이름을 바꾸면 그 바꾼것으로 부르면됨 toString1();//오버로딩
		Object test1= new Object();
		print(test1.toString());
		//프린트 엘엔이 투스트링을 불러와실행
}
}
