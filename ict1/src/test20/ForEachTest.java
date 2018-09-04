package test20;

import java.awt.List;
import java.util.ArrayList;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrStr = new String[4];
		
		for(int i = 0;i<arrStr.length;i++) {//string이여야만 가능
			arrStr[i] = "test"+i;
		}
		
		for(String str:arrStr) {
		System.out.println(str);
		}
		
		String[] arr = {"보검","정국","은우"};//방번호와 초기화 동시
		System.out.println(arr[1]);
		
		String[][] multiArr = {{"1","2","3"},{"4"},{"5","6","7"}};
		System.out.println(multiArr[0][2]);
		
			for(String[] strs: multiArr) {
			for(String str : strs) {
				System.out.println(str);
			}
		}
		
		
		
		
		
		
		ArrayList<String> strList = new ArrayList<String>();
		
		for(int i = 0;i<arrStr.length;i++) {
			strList.add( "test"+i);
		}
		
		for(String str:arrStr) {
			System.out.println(str);
			}
	}

}
