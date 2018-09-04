package test19;

//등수 순서로 출력!!!!
import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Person[] p = new Person[5];

		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();
			p[i].name = (i + 1) + "번째 사람";
			System.out.println(i + 1 + "번째 사람의 점수 입력하시오");
			p[i].point = Integer.parseInt(scan.nextLine());
			p[i].rank = 1;
		}
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length; j++) {
				if (p[i].point < p[j].point) {
					p[i].rank++;
				}
			}
		}

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].name + "님의 점수는" + p[i].point + "입니다.");
			System.out.println(p[i].name + "님의 등수는" + p[i].rank + "등입니다.");
			System.out.println();
		}
	}

}
