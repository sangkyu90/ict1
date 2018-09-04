package test21;

public class Solid extends Cart {

	public Solid(String name, int speed, int damage) {
		super(name, speed, damage);
		// TODO Auto-generated constructor stub
	}
	
	
	public String attack(int damage) {
		return this.damage+damage+"만큼공경!";
	}

	
	
}
