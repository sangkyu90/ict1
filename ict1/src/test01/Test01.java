package test01;

public class Test01 {
	
	public static void main(String[] args) {
		int c =4;
		if(c==4) {
			c=10;
			if(c==4) {
				c=5;
			}else {
				int d =30;
				c=d;
			}
		}
	System.out.println(c);	
	
	}	

}
