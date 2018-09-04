package conception;

public class Excutor {

	public static void main(String[] args) {
		
		Person1 p = new Person1();
		//p.name = "eunwoo";<<private이라 불가능
		p.setName("eunwoocha");
		p.getAge(22);
		p.setAddress("seoul");
		System.out.println(p.toString());//System.out.println(p);
		
		String name0fp = p.getName1();
		System.out.println(p.getName1());
		
		
		
		Obj o = new Obj(); //객체생성 후 사용가능
		System.out.println(o.num);
		o.num = 4;
		System.out.println(o.num);
		
		
		int a = o.getNum();//method 데이터 타입이 int 라서 error x
		String str = o.getStr();
		System.out.println(str);
		System.out.println(o.getStr());
		//데이터 타입이 void 넘기지 않아서  ->오류 System.out.println(o.test());
		
		
		System.out.println(str.length());
		System.out.println(o.getStr().length());//o라는 주인이 죽지 않아서 가능
		
		
		int num = o.getNum();
		System.out.println(num);
		
	}

}
