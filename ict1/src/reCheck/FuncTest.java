package reCheck;

public class FuncTest {

	public void printLoop(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}

	public void printLoopReverse (int start,int end) {
		for(int i=end;i>=start;i--) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
			FuncTest ft = new FuncTest();
			
			ft.printLoopReverse(1, 50);
			
	}
	


	

	}


