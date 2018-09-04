package test28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test28.impl.UserDAOImpl;

public class Exec {
	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		HashMap<String, String> userInfo = new HashMap<String, String>();
		
		//////////////////////////////////////////////////////////////////////////////
		 ArrayList<HashMap<String, String>> userList = udao.selectUserInfoList(userInfo);
			
		 userInfo.put("uiEtc","1");
		userInfo.put("uiName","하하");
		
		
		
		
		
		
		 if(udao.updatetUserInfo(userInfo)==1) {
				System.out.println("ok");	
				}else {
					System.out.println();
				}
		 
		 if(udao.deletetUserInfo(userInfo)==1) {
			System.out.println("ok");	
			}else {
				System.out.println();
			}
		
		 
	
		 
		 
		 for(HashMap<String,String> user :userList) {
			 System.out.println(user);
		
		 }
		 
		 for(int i = 0; i<userList.size();i++) {
			 System.out.println(userList.get(i));
		 }//해시맵에 하나하나
	 
		
		
		 System.out.print(userList);
		 
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("몇명등록?");

		int max = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < max; i++) {
			System.out.println("name");
			String name = scan.nextLine();
			System.out.println("age");
			String age = scan.nextLine();
			System.out.println("etc");
			String etc = scan.nextLine();

			userInfo.put("uiName", name);
			userInfo.put("uiAge", age);
			userInfo.put("uiEtc", etc);

			if (udao.insertUserInfo(userInfo) == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			
		
		}

	}
}
