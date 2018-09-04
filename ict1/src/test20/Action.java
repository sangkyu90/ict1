package test20;
//interface
//1.몸통이 없음. 메서드 선언할 때 {}무슨일 할지 정의내리지 x, 어떤것을 할거야ㅑ! 
//2.생성자 ㅇ나됨
public interface Action {
	public void eat();//이거는 자동 퍼블릭!
	public void sleep();
	public void move();
	public static void tset() {
		System.out.println("나는 1.8부터 됨!");
	}
}