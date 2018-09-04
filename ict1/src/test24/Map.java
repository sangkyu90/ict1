package test24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Map {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		//정해져있는 데이터 타입은 쓸 수 없다. key값,valus값 모두 String
		hm.put("이름","차은우");
		hm.put("이름","차은우1");
		hm.put("주소","서울");
		hm.put("나이","22");
		
		
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String str = "key"+key+",value="+hm.get(key)   ;
			System.out.println(str);
			
		}
		String name = hm.get("이름");
		System.out.println(name);
		
		
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("은우");
		aList.add("seoul");
		aList.add("동동이");
		System.out.println(aList);
	}
	
}
