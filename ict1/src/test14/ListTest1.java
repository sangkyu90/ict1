package test14;
//배열을 리스트처럼
import java.util.Scanner;

	public class ListTest1 {
		public String[] arrStr;
		private int idx = 0;

		ListTest1() {
			arrStr = new String[0];//0개의 방 새로운 객체생성

		}

		public void copyArr() {
		//복사배열
			String[] tmpArr = arrStr;
			//tmpArr이라는 arrStr배열을 넣어줌
			arrStr = new String[arrStr.length+1];
			//arrStr에 새로운 스트링[기본+1]을 생성해준다.
			for(int i=0;i<tmpArr.length;i++) {
				arrStr[i] = tmpArr[i];//
			}
		}
		
		public boolean add(String str) {
			copyArr();
			this.arrStr[idx]= str;
			idx++;
			return false;
		}
		
		

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
			ListTest1 lt = new ListTest1();
			System.out.println(lt.size());
			lt.add("abc");
			lt.add("abc");
			lt.add("abc");
			lt.add("abc");
			lt.add("abc");
			
			System.out.println(lt.size());
			
		}
	}

