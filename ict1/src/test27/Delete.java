package test27;

import java.util.ArrayList;

public class Delete {
 public static void main(String[]args) {
	 ArrayList<String> strList = new ArrayList<String>();
	 strList.add("abc1");
	 strList.add("abc2");
	 strList.add("abc3");
	 strList.add("abc4");
	 
	 int idx = -1;
	 for(int i = 0; i<strList.size();i++) {
		 String str = strList.get(i);
		 if(str.equals("abc1")) {
			 idx = i;
		 }
	 }
	 System.out.println("전"+strList);
	 if(idx!= -1) {
		 strList.remove(idx);
		 
	 }
	 System.out.println("후"+strList);
	 
	 
 }
}
