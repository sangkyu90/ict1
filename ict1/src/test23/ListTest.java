package test23;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public int indexOf(String[]strList, String s) {
		ArrayList<String> strList1  = new ArrayList<String>();
	
		strList1.add("정국이");
		strList1.add("보거미");
		strList1.add("은우");
		
		int idx4 = strList1.indexOf("보거미");
	
		return 0;
	}

	public static void main(String[] args) {
		
		
		System.out.println();
		
		
		
		
		
		
		ArrayList<String> strList  = new ArrayList<String>();
		//System.out.println(strList.size());
		strList.add("정국이");
		strList.add("보거미");
		strList.add("은우");
		//strList.remove("은우");
		//System.out.println(strList.size());//배열의 길이가 유동적임!
		int idx4 = strList.indexOf("보거미");
		System.out.println(idx4);
		
		
		
		
		
		
		//데이터 타입 반드시 스트링으로 제약사항 함 strList.add(1/true/1.1/new String[2]);x
	/*
		strList.add(1+"");
		strList.add(1.1+"");
		strList.add(true+"");
		strList.add(new String[2]+"");
		//데이터 타입이 스트링이라 출력이 가능한것임
		
		for( String str2 : strList) {//리스트를 스트링 배열처럼 쓸 수 있다.
			System.out.println(str2);
		}
		
		*/
		
		
		
	/*	 List<String> al = new ArrayList<String>();
		 //인터페이스 를 가지고 있음!!
		//<데이터타입> 변수명 //클래스생성후 넘겨도되는 것임 왜냐하면 리스트가 인터페이스라
		 //list, map, set//구현받고 있는 것은 많지만 컬렉션은 대표적3
		 //인터페이스라 뉴랑 셋이 안됨<List<String> al = new List<String>();>
		 
		 al = new LinkedList<String>();//모두다 인터페이스 리스트구현 받아서 가능
*/
		
	
		/*ArrayList strList1  = new ArrayList<String>();
		//오브젝트로 포이치문 가능
		strList1.add(1);
		strList1.add(1.1);
		strList1.add(true);
		strList1.add(new String[2]);
		*/
		/*String str = "12345";
		int idx = str.indexOf("6");//2라는 글자의 인덱스가뭐양? 그러면 주의 영부터 방번호시작되므로 3!!
		System.out.println(idx);//-1은 나올수 없는 값이므로 -1출력!!!!
		int idx1 = str.indexOf("345");//이글자가 시작되는 위치이므로 3 은 2~
		*/
		
	
	}

}
