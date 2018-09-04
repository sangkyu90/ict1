package test27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {

	public static ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();

	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);

		System.out.println("이름입력");
		String name = scan.nextLine();

		System.out.println("나이입력");
		String age = scan.nextLine();

		hm.put("uName", name);
		hm.put("uAge", age);

		int cnt = insertUser(hm);// return 값 받아옴
		if (cnt == 1) {
			System.out.println("우저등록성공");
		} else {
			System.out.println("에러");
		}
	}

	public static int insertUser(HashMap<String, String> user) {
		int result = 0;
		int uNum = userList.size() + 1;

		try {
			user.put("uNum", uNum + "");

			userList.add(user);
			result = 1;
		} catch (Exception e) {
			System.out.println("지금코드로 내가 출력안됨");
		}
		return result;
	}

	public static void selectUserList() {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			System.out.println(i + 1 + "번째 유저정보 +" + user);

		}

	}
	

	public static void removeUserList(HashMap<String, String> user) {
		userList.remove(user);

	}

	public static void removeUser(int idx) {
		userList.remove(idx);
	}

	/*
	 * public static HashMap<String, String> removeUser(String uName){
	 * for(HashMap<String,String> user:userList) {
	 * if(user.get("uName").equals(uName)) { userList.remove("uName");
	 * System.out.println("삭제완료"); return user; }else { return null; }
	 * 
	 * }
	 */

	public static HashMap<String, String> getUser(String uName) {
		 for(int i = 0; i<userList.size();i++) {
			 HashMap<String,String> user =userList.get(i); 
			 if(user.get("uName").equals(uName)) {
				 return user;
			 }
		 }
		return null;
	}
		 
/*
		for (HashMap<String, String> user : userList) {
			if (user.get("uName").equals(uName)) {

				return user;
			}
		}

		return null;
	}*/
	/*public static HashMap<String,String>  update(String uName) {
		for(int i=0;i<userList.size();i++) {
			HashMap<String,String> user = userList.get(i);
		String name = user.get("name");
		
		if(name.equals(uName)) {
				System.out.println("홍길동님은 " + i + "번 위치에 있음!");
				userList.remove(i);
				
			}
		}
		
		return user;
	}
	*/
		
	

	public static void main(String[] args) {

		inputUser();
		inputUser();
		inputUser();

		getUser("꾸꾸");

		HashMap<String, String> searchUser = getUser("콩길동");

		System.out.println("겁색된유저" + searchUser);

		selectUserList();
	}

}





/*
 * // HashMap<String,String> hm = new HashMap<String,String>();
 * hm.put("uNum","1"); hm.put("uName","꾸꾸"); hm.put("uAge","22");
 * hm.put("uAddress","서울"); hm.put("uEtc","꾸꾸까깎?");
 * 
 * userList.add(hm); hm = new HashMap<String,String>(); hm.put("uNum","2");
 * hm.put("uName","꾸꾸"); hm.put("uAge","22"); hm.put("uAddress","서울");
 * hm.put("uEtc","꾸꾸까깎?"); userList.add(hm);
 * 
 * for(HashMap<String,String> user: userList) { String str =
 * user.get("uNum")+","; str +=user.get("uName")+","; str
 * +=user.get("uAge"+","); str +=user.get("uAddress"+","); str
 * +=user.get("uEtc"); System.out.println(str);
 * 
 * }
 * 
 * 
 * System.out.println(hm);//배열 arr은 주소값이 나오지만 요거는 값이 나오므로 toString을 오버라이딩함
 * //HashMap List도 System.out.println(hm.get("uNum"));
 * System.out.println(hm.get("uName")); System.out.println(hm.get("uAge"));
 */

/*
 * userList.add(hm);
 * 
 * hm = new HashMap<String, String>(); hm.put("uNum", "1"); hm.put("uName",
 * "까3"); hm.put("uAge", "11"); userList.add(hm);
 * System.out.println(userList);//// 두번째 바뀐 값으로 나옴!!! // hm = new
 * HashMap<String,String>();영번째방값 유지 그러고 첫번째 방값이 새로 바뀌어 나옴!!
 * 
 * userList.add(hm); userList.add(hm); userList.add(hm); userList.add(hm);
 * 
 * System.out.println(userList.size()); // 중복값 상관없음!!
 */