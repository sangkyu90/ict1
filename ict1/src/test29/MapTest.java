package test29;
 interface Act{
	 void test();
 }
 class Main {
	 public static int a = 10;//초기화는 딱한번이라 서  초기화하고 난값으로 계속 나옴!
	 
	/* private int a;
	 private int b;*/
/*	 public int add() {
		return a+b;
	 }
	 */
	 /*implements Act*/
	/* public void test() {
		 
	 }
	 void test() {
		 
	 }//default 라서 안됨! 왜냐하면 범위가 public보다 작은것은 안되기때문이다.******
*/	 
 }
 

public class MapTest extends Main{

	//Main, Object, MapTest,Act
	
	public static void main(String[] args) {
		Main m = new Main();
		m.a = 20;
		Main m1 = new Main();
		System.out.println(m1.a);//초기화는 딱한번이라 서  초기화하고 난값으로 계속 나옴!
		
		int rNum = (int)(Math.random()*25)+1;
		System.out.println(rNum);
		
		String str ="abcdef";
		/*str = str.substring(0, 2);*/
		str.replace("Ab", "");
		System.out.println(str);
		//**String은 무조건 같음!!!!!!왜냐하면 같은곳에 저장하기때문에
		//newString을해도!!
		
	
		String str1 = "a-b-c-d-e";
		 String[] strs = str1.split("c-");
		 
		 System.out.println(strs[0]);
		 System.out.println(strs[1]);
		System.out.println(strs.length);
	}

}
