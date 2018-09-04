package basic;

public class SortTest2 {
	public static void main(String[]args) {
		String[] arrStr = new String[5]; //string 저장 공간5개 들어가는 초기값은 null
		String s = arrStr[0]; 
		arrStr[5] = "abs";//compiled은 되만 실행x 번역은 했지만 실행x
		System.out.println(arrStr[0]);//null
		System.out.println(arrStr[0].length());//null
		System.out.println(s.length());
		System.out.println(arrStr.length);//0-4string 맞
		
		String[] arrStr1 = new String[5];
		arrStr1[0] ="a";
		arrStr1[1] ="b";
		arrStr1[2] ="c";
		arrStr1[3] ="d";
		arrStr1[4] ="e";
		
		for(int i=0;i<arrStr1.length;i++) {
			System.out.println(arrStr1[i]);
		}
		
	}
}
