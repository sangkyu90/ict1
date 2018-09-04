package test29;

import java.util.ArrayList;

public class ListTest {
	
	public static String[] split(String str, String seperator) {
		//int size =ArrayList.count(str,seperator);
		String[] strs = new String[size];
	
		for(int i = 0; i<str.length();i++) {
			int idx = str.indexOf(seperator);
			if(idx==-1) {
				strs[i] = str;
				
			}else{
				String s = str.substring(0,idx);
				strs[i] = s;
				str = str.substring(idx+1);
					}
				
			}
		
		return strs;

	}
	
	public static void main(String[] args) {
	 
	 
/*	System.out.println( str.substring(0, 1));
	System.out.println( str.substring(2, 3));
	System.out.println( str.substring(4, 5));
	System.out.println( str.substring(6, 7));
	System.out.println( str.substring(8, 9));*/
	 /*String[] strs = str.split("-");
	 for(int i = 0; i<strs.length;i++) {
		 System.out.println(strs[i]);
	 }*/
	}

}
