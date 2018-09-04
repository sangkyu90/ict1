package test16;

public class BoGum extends Human {

   BoGum(){
		
		super("뽀검",26,1);
		
	}
	
	/*BoGum(String name, int age, int num){
		
		super(name,age,num);
		
	}*/
	
	public void printHuman() {
		System.out.println("내가 바로 뽀거미");
		super.printHuman();
		/*if(h instanceof BoGum) {
			BoGum bg = (BoGum)h;
		Human h
		}*/
	}
	
	public static void main(String[]args) {
		BoGum h1 = new BoGum();
		h1.printHuman();
	}
	
}
