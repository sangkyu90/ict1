package reCheck2;
//kildong person object로 불리울수있음

//만든 정해져있지않는 데이터 타입은 모두 객체임

public class KilDong extends Person {

	public void checkMyLuckyNum(int luckyNum) {
		System.out.println("행운번호:" + luckyNum);
		if (this.luckyNum == luckyNum) {
			System.out.println("축하");
		}
	}

}
