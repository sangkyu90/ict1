package test21;

public class Exec {
	public static void start(Drive[] ds) {
		for(Drive d : ds) {
			d.start();
		}		
	}
	
	
	public static void attack(Drive[] ds) {
		for(Drive d : ds) {
			System.out.println(d.attack(30));
		}
	}
	
	public static void stop(Drive[] ds) {
		for(Drive d : ds) {
			d.stop();
		}
	}
	
	public static void main(String[] args) {
		
		Drive[] d = new Drive[3];//생성자, 아니고 방 만드는 것임
		//null로 방3개 생성
		d[0] =  new Lulu("lulu",100,50);
		d[1]=  new Solid("솔리드",80,50);
		d[2]= new TrainingCart("RBRB",50,20);//메모리 넣어줌
		/*// TODO Auto-generated method stub
		Drive lulu = new Lulu("lulu",100,50);
		Cart sol = new Solid("솔리드",80,50); start(lulu);
		start(솔리드);		*/
		
		start(d); attack(d); stop(d);
	}

}
