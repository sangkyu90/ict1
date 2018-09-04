package reCheck2;

public class LuckyNum {
	private int luckyNum;

	LuckyNum() {//초기값 생성, 반드시 실행해야할것
		luckyNum = ((int) Math.random() * 10) + 1;

	}

	public void checkLuckyGuy(Person p) {//data type이 person
		/*System.out.println(p instanceof KilDong);
							//instanceof>>p 를 kildong이라고 불러도됨?
					//실제 생성된 데이터 타입이 아니라, 불러도 되는지를 물어보는것임
		//따라서
		System.out.println(p instanceof  Person);//어떤 사람의 이름이든 true
		//datatype이 모두 person이여도 exec에서 메모리생성을 길동으로함
*/
		if(p instanceof KilDong) {
			KilDong kd = (KilDong)p;
			kd.checkMyLuckyNum(luckyNum);
			
		}	else if(p instanceof Eunwoo) {
			Eunwoo e = (Eunwoo)p;
			e.test();
			
		}
		
	}

}
