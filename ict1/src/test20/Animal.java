package test20;

public class Animal implements Action {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("동물 맘마");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("동물 잔다");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("동물 움직임");
	}
	public void hunt() {//오버라이딩x
		System.out.println("동물사냥");
	}
}
