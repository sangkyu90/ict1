package test18;

import java.util.Scanner;

public class Exec {
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		Person[] p =  new Person[5];
		int[] rank = new int[p.length];//메모리 생성x
	
		for(int i = 0; i<p.length;i++) {
		
			p[i]= new Person();
			p[i].name = (i+1)+"번째 사람";
			System.out.println(i+1+"번째 사람의 점수를 입력하시오");
			p[i].point = Integer.parseInt(scan.nextLine());	
			rank[i]= p[i].point;
			
			
		}
		
		//포인트 정렬
		for(int i = 0; i<rank.length;i++) {
			for(int j = i+1; j<rank.length;j++) {
				if(p[i].point<p[j].point) {
					int tmp = p[i].point;
					p[i].point = p[j].point;
					p[j].point = tmp;
				}
			}
		}
		
		//
		for(int i = 0; i<rank.length;i++) {
			for(int j =0; j<p.length;j++) {
				if(rank[i]==p[j].point) {
					p[j].rank = i+1;
				}
			}
		}
		
		
		for(int i = 0; i<p.length;i++) {
			System.out.println(p[i].name+"님의 점수는"+p[i].point+"입니다.");
			System.out.println(p[i].name+"님의 등수는"+p[i].rank+"등 입니다.");
			
			System.out.println();
		}
		
		
	}

}
