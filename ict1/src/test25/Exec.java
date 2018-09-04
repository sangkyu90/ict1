package test25;

import java.util.Scanner;

public class Exec {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("===유저프로그램===");
			System.out.println("1.유저리스트,2.유저생성,3.유저수정,4.유저삭제,q.종료");
			System.out.println("알맞은명령어를 입력");
			String order = "";
			
			Controller c = new Controller();
			
			while(!"q".equals(order)) {//입력값이q가 아닐떄까지 실행
				order = scan.nextLine();
				System.out.println(order);
				c.callOrder(order);
			}
			
			System.out.println("===유저프로그램종료===");
	}
}
