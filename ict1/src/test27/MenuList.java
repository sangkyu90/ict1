package test27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuList {
	private static ArrayList<HashMap<String,String>> menuList= new ArrayList<HashMap<String,String>>();
	
	public static int insertMenu(HashMap<String,String> menu) {
		int result = 0;
		int uNum = menuList.size()+1;
		try {
			menu.put("uNum", uNum+"");
			menuList.add(menu);
			result = 1;
		}catch(Exception e){
			System.out.println("삐이익");
		}
		return result ;
	}
	
	public static void inputData() {
		HashMap<String,String>	 hm  = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴이름입력");
		String name = scan.nextLine();
		
		System.out.println("가격");
		String price = scan.nextLine();
		
		System.out.println("몇인분?");
		String cnt = scan.nextLine();
		
		hm.put("메뉴이름",name);
		hm.put("가격",price);
		hm.put("몇인분",cnt);
		
		int num =  insertMenu(hm);
		if(num==1) {
			System.out.println("메뉴등록성공");
		}else {
			System.out.println("앙대");
		}
		
		
	}
	public static void selectMenuList() {
		for(HashMap<String, String> food : menuList) {
			System.out.println(food);
		}
	}
	
	public static HashMap<String,String> getMenuList(String name) {
		for(HashMap<String, String> food : menuList) {
			if(food.get("메뉴이름").equals(name)) {
				return food;
			}
		}
		return null;
	
	}
	
	public static int menuIndexOf(String Name) {
		for(HashMap<String,String> menu:menuList) {
			if(menu.get("메뉴이름").equals(Name)) {
				return 1;
			}
		}
		return -1;
	}
	
	public static void removeMenu(int idx) {
		menuList.remove(idx);
	}
	
	
	
	
	public static void main(String[]args) {
		inputData();
		inputData();
		getMenuList("또또또");
		int idx = menuIndexOf("asdf");
		if(idx!= -1) {
			MenuList.removeMenu(idx);
		
		}
		selectMenuList();
	}
}
