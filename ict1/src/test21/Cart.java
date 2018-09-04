package test21;
//Drive Cart Solid
//Cart는 드리이브로 불릴 수 있고, 솔리드는 카트로 불리울 수 있따.
public class Cart implements Drive {
	protected String name;
	protected int speed;	
	protected int damage;	
	
	public Cart(String name, int speed, int damage) {
		this.name = name;
		this.speed = speed;
		this.damage = damage;
	}
	
	@Override
	public String attack(int damage) {
		// TODO Auto-generated method stub
		return damage +"로 공격 합니다.";
	}
	
	@Override
	public void stop() {
		System.out.println("정지합니다.");
		
	}
	@Override
	public void start() {
		System.out.println(speed+"로 달립니다");
		
	}

	
	
}
