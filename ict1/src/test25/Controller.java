package test25;

public class Controller {
	
	public void callOrder(String order) {
		if("1".equals(order)) {
			System.out.println("유저리스트를 보고싶다.");
			
		}else if("2".equals(order)) {
			System.out.println("유저추가하고팡");
			
		}else if("3".equals(order)) {
			System.out.println("유저수정하고팡");
			
		}else if("4".equals(order)) {
			System.out.println("유저삭제하고팡");
			
		}else if("q".equals(order)) {
			System.out.println("종료하고팡");
			System.exit(0);//강제종료
			
		}else {
			System.out.println("존재하지않음");
		}
	}
}
