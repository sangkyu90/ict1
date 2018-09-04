package conception2;

public class WrapDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정해져있는 데이터 타입은 값만 바라보지 소유 하지 않음
		int i = 10;
		
		//wrapper 정해져있는 데이터 타입을 감싸고 그외 기능도 수행함
		//String 처럼 값을 소유 가능 함 클래스 기능 +값도 소유 Integer.
		Integer integer = new Integer( 10);
		Integer i1 = 10;
		Integer i2 = 10;
		System.out.println(i1==i2);//new 아니면 같음
		
		String s1 = "1";
		String s2 = "1";
		System.out.println(s1==s2);
		//String .equals
		
		
		
		String s = integer.toString(); //s=10;은 안되지만
		System.out.println(s);//하면 10이나옴 이건 숫자가 아님!
		
		char c = 'q';
		Character ch = 'a';
		
		//정해져있지 않은 데이터 타입이라 구분위해 대문자
		long l = 10l;
		Long lon = 10l;
		Boolean bl = true;
		Double db = 10.2;
		Float fl = 1.2f;
		Byte b = 1;
		Short sc = 3;

	}

}
