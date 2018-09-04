package test20;

public class Exec {
	
	public static void eat(Action p) {//공통메서드 만들때, 액션으로 부를 수 있는 것만 들어갈 수 있다.!!
		p.eat();
	}
	
	public static void main(String[]args) {
		//Object o = new Animal();
		//Animal a = new Animal();
		Action act = new Animal();//메모리생성 애니멀, 액션이가지고 있는 메서드!!로만! 애니멀 매서드는 안됨
		//오토 캐스팅, 업캐스팅
		
		act = new Person();
		eat(act);//eat의 매개 변수가 Peson p면 에러남~
		eat(new Animal());
		eat(new Person());
		
		/*//액션에 따로 구현한 메서드가 없어서 알수가 없기 때문에 캐스팅을 한다. 다운 캐스팅!!
		Animal ani = (Animal) act;
		ani.hunt();
		
		act.eat();act.move();
		//act = new Action();//인터페이스 생성자 없어서 안됨
		
		act = new Person();//임프리먼츠로 구현 받아서 가능 ! 
		act.eat();
		
		//액션에 따로 구현한 메서드가 없어서 알수가 없기 때문에 캐스팅을 한다. 다운 캐스팅!!
		Person per = (Person) act;
		per.work();*/
	}
	//관련없는 것을 묶을 수 가 있음
	//사람과 동물이 다른데 어떤 것이 다른지를 우선은 행동으로 묶어 놓고 정의는 각각ㅉ
}
