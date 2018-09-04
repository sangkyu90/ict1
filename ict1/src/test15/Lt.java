package test15;

import java.util.Scanner;

public class Lt {
	public String[] arrStr;
	//string배열 변수 선언;
	private int idx = 0;//초기값 고정
	
	Lt(int length){
		//기본생성자 매개변수는 int 길이
		
		arrStr = new String[length];
		//arrStr 에 받아온 길이만큼 String배열생성		
	}
	
	public boolean add(String str) {
		//참거짓을 받는 매서드 add/ 매개변수는 스트링
		if(idx==arrStr.length) {
			//만약  숫자가  스트링 배열의 길이와 같으면
			System.out.println("초과");//초과가 나오고
			return false;//트루값을 리턴한다.
		}
		this.arrStr[idx]= str;//스트링배열[i]에   받아온 str 을 넣는다.
		idx++; //그리고 idx의 수를 1 늘려준다.
		return true;//거짓값을 리턴
	}
	

	public int indexOf(String str) {
		//int 매서드 의 매개변수는 스트링!
		for(int i = 0; i<this.arrStr.length;i++) {
			//선언된 스트링 함수의 길이 전까지 돌리는 포문
			if(this.arrStr[i].equals(str)) {
				//만약에 스트링 배열의 i번째의 값이 indexOf함수에 입력된 매개변수와 같다면
				return i; //포문을 멈추고 스트링 배열의 방 번호를 던져준다.
			}
		}
		return -1; //그렇지 않으면 -1 을 던져준다.		
	}
	
	public boolean remove(int idx) {
		//참거짓 데이터 리무브 매개변수는 idx
		this.arrStr[idx] = null;
		//스트링함수[받아온 값]에 null값을 넣어준다.
		return true;//실행을 멈추고 트루값을 리턴한다.
		
	}
	
	
	public int size() {
		//사이즈() 매서드는 숫자로 리턴 한다.
		
		return this.arrStr.length;//스트링 배열의 길이를 리턴
	}
	
	
	
	public static void main(String[] args) {
		Lt lt = new Lt(5);//생성자 값 안에 숫자 를 5 넣어준다.
		//스트링 배열에 5만큼 넣어 새로 생성한다(초기화)
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<lt.size();i++){
				//스트링길이만큼 포문	{}안의 것을 5회 반복
			System.out.println("리스트 문자 입력");
			String str = scan.nextLine();
			//str이라는 스트링 변수에 사용자가 입력한 값을 넣어준다.
			lt.add(str);
			//lt의 함수 add 에 받아온 str을 넣어준다.
			//스트링함수[0] = 받아온 str 값을 넣어준다.
			//[0]에 +1 을 해주고 리턴값은 트루
			
		}
		System.out.println("찾은 것 입력");
		String str = scan.nextLine();		
		int idx = lt.indexOf(str);
		if(idx==-1) {
			System.out.println(str+"x");
		}else {
			System.out.println(str+"은"+idx+"방에");
		}
		
		
		
		}
	
	
	
	
	
	
	
}
