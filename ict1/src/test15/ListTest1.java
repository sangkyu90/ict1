package test15;

import java.util.Scanner;

public class ListTest1 {
	public String[] arrStr;
	private int idx = 0;

	ListTest1(int length) {
		arrStr = new String[length];

	}

	
	public boolean add(String str) {
		if(idx==arrStr.length) {
			//초기값 0이랑 입력한 스트링 배열의 길이 5가 다르므로
			System.out.println("초과");
			return false;
		}
		this.arrStr[idx]= str;//초기값 0에 받아온 문자를 넣는다.
		idx++;//초기값 1상승후 
		return true; // 실행을 멈추고 리턴값 트루를 던진다.
	}
	
	/*public boolean add(String str) {
		
		 * if (idx == arrStr.length) { System.out.println("에러"); return false; }
		 
		this.arrStr[idx] = str;
		idx++;
		return true;
	}*/

	public int indexOf(String str) {
		for (int i = 0; i < this.arrStr.length; i++) {
			if (this.arrStr[i].equals(str)) {
				return i;
			}
		}
		return -1;//절대 나올수 없음
	}

	public boolean remove(int idx) {
		this.arrStr[idx] = null;
		return true;
	}

	public int size() {
		return this.arrStr.length;
	}

	public static void main(String[] args) {
		ListTest1 lt = new ListTest1(5);

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < lt.size(); i++) {
			System.out.print("리스트 저장할 문자 입력하시오");
			String str = scan.nextLine();
			lt.add(str);//return true 받음
		}
		System.out.println("저장한 문자중 찾을 것을 입력하시오");
		String str = scan.nextLine();
		int idx = lt.indexOf(str);
		if(idx==-1) {
			System.out.println(str+"저장한 문자중 없음");
		}else {
			System.out.println(str+"은"+idx+"방에있더라구요");
		}
		
	}
}
