package computer;

public class Exec2 {
//object생략 모든 클래스는object!를 extends함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object c = new Pc();
	((Pc)c).res="abs";
		
	//obj 상속받으므로 모두 obj라고 불리울수 있음
	Object[] arrObj = new Object[4];
	arrObj[0]=1;
	arrObj[1]=new Boolean(true);
	
	
	
	
		/*Computer c = new Computer();
		c.printInfo("inter8", 50, "뀨j");*/
		
		
	}

}
