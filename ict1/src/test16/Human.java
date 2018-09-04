package test16;

public class Human {
	protected String name;
	protected int age;
	public int num;
	
	public Human() {
		
	}
	
	
	public Human(String name, int age, int num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}
	
	public void printHuman() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("번호:"+num);
	}
	
}
//휴먼클래스 상속받고
//printHuman()함수 실행시 휴먼의 함수가 아니라
//상속받은 클래스의 printHuman()의 무언가를 실행하면서+
//휴먼에 있는 printHuman()도 실행되게 코드를 작성하시오