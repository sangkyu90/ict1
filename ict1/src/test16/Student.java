package test16;

public class Student {
	public String name;
	public int point;

	public Student(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public String toString() {
		return "학생:"+name+"point"+point;
	}

	public static void main(String[] args) {

		Student[] sts = new Student[3];
		//기본데이터 타입의 배열에는 원래 문자를 넣을 수 없지만
		//Students라는 정해지지 않는 데이터 타입의 배열엔 문자를 넣을 수 있다.
		
		sts[0] = new Student("전정국", 100);
		sts[1] = new Student("박뽀검", 120);
		sts[2] = new Student("차은우", 10000);

		for (int i = 0; i < sts.length; i++) {

			for (int j = i + 1; j < sts.length; j++) {
				if(sts[i].point<sts[j].point) {
					Student st = sts[i];
					sts[i] = sts[j];
					sts[j] = st;
				}
			}
		}
		for(int i = 0; i<sts.length;i++) {
			System.out.println(sts[i]);
		}
	}

}
