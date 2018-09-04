package reCheck2;
//정해져있지 않는 데이터 타입은 반드시 초기화!
public class Exec {
	public static void main(String[]args) {
		
		Person p = new KilDong();//Pesron p = new Person();는false
		Object o = new Person();
		o=p;
		
		LuckyNum ln = new LuckyNum();
		ln.checkLuckyGuy(p);
		
		Person p2 = new Eunwoo();
		ln.checkLuckyGuy(p2);
		
		/*Robot r = new Robot();
		r.w = new Weapon();//메모리생성~!,의존성 주입을 여기서 했다.
		System.out.println(r.w.power);//w를 메모리생성안하면, null이여서 error
		r.w.power = 10;
		
		System.out.println(r.w.power);//power 없애기>>r.w=null;, r=null;//주종관계
				//power은 weapon것, robot것이 아님!!!!!
		*/
		
	
	}
}
