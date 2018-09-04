package test20;
//어떤 인터페이스를 구현받는다~구현한다!
//실제 구현은 이곳에서 함!!!~!!
public class Person implements Action{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("인간 맘마");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("인간 잔다");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("인간 움직임");
	}
	
	
	public void work() {
		System.out.println("인간일함");
	}

}
