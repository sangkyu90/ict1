package conception2;

public class Calc2 {

	private void add(int a, int b) {
		System.out.println(a + b);
	}

	private void minus(int a, int b) {
		if (a >= b) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}

	}

	private void multiple(int a, int b) {
		System.out.println(a * b);
	}

	private void divide(double a, double b) {
		if (a >= b) {
			System.out.println(a / b);
		} else {
			System.out.println(b / a);
		}
	}

	public void calc2(String op, int num1, int num2 ) {
		if(op.equals("+")) {
			add(num1, num2);
		}else if(op.equals("-")) {
			minus(num1,num2);
		}else if(op.equals("*")) {
			multiple(num1,num2);
		}else if(op.equals("/")) {
			divide(num1,   num2);
			
		}
		
	}

}
