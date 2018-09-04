package test28;

import java.util.ArrayList;
import java.util.HashMap;

//인터페이스는 퍼블릭밖에 못쓰고, 기본값은 디폴트아니고 퍼블릭
//사용할메소드만 구현
public interface UserDAO {

	public int insertUserInfo(HashMap<String,String> userInfo);
	public int deletetUserInfo(HashMap<String,String> userInfo);
	public int updatetUserInfo(HashMap<String,String> userInfo);
	public ArrayList<HashMap<String,String>> selectUserInfoList (HashMap<String,String> userInfo);
	
}
