package test18;

public class Dog {
	public int rank;
	public String name;
	
	public Dog(String name, int rank) {
		this.rank = rank;
		this.name = name;
	}
	
	public static void init(Dog[] d) {
		for(int i = 0; i<d.length;i++) {
		
			
			int rank = (int)(Math.random()*10)+1;
		
			
			
			d[i] = new Dog(i+"번째 개", rank);
		}
	}
	
	
	public static void asc(Dog[] d) {
		for(int i = 0; i<d.length;i++) {
			for(int j = i +1;j<d.length;j++) {
				if(d[i].rank<d[j].rank) {
					int tmp = d[i].rank;
					d[i].rank = d[j].rank;
					d[j].rank = d[i].rank;
					
				}
			}
		}
	}

	public static void des(Dog[] d) {
		for(int i = 0; i<d.length;i++) {
			for(int j = i +1;j<d.length;j++) {
				if(d[i].rank>d[j].rank) {
					int tmp = d[i].rank;
					d[i].rank = d[j].rank;
					d[j].rank = d[i].rank;
					
				}
			}
		}
	}
	
	
	public static void print(Dog[] d) {
		for(int i = 0; i<d.length;i++) {
			System.out.println(d[i]);
		}
		
	}
	
	public static void main(String[]args) {
		
		Dog[] d = new Dog[10];
		init(d);  asc(d); print(d); des(d);print(d);
	}


}

