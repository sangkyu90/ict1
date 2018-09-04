  package test23;

import java.util.ArrayList;
import java.util.HashMap;

public class ListTest2 {
	public static void main(String[] args) {
		// <<정해져있는 것은 못씀>>ArrayList<int> al = new ArrayList<int>();
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {
			int rNum = (int) (Math.random() * 10) + 1;
			al.add(rNum);

		}
		for(int i = 0; i<6;i++) {
			System.out.println(al.get(i));//오번방까지 나오고 에러
		}
		for (int num : al) {
			System.out.println(num);
		}
		ArrayList[] arrList = new ArrayList[3];//배열에 담아서
		ArrayList<ArrayList<String>> arrList2 = new ArrayList<ArrayList<String>>();
		ArrayList<HashMap<String,String>> arrList3 = new
				ArrayList<HashMap<String,String>>();
	}
}
