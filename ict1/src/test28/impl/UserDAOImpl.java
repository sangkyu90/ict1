package test28.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//db로 무언가를 하는것만 넣음, crud , 전화기 con을 호출하는 용도
import java.util.ArrayList;
import java.util.HashMap;

import test28.DBCon;
import test28.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection con;
	int result = 0;

	public UserDAOImpl() {// 서비스에서 롤백 커밋 호출한데서 끊으면 됨
		// 원래는 연결하고 끊고 계속해야함/
		// this.con = DBCon.getCon();
	}

	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
		this.con = DBCon.getCon();// 생성자에서 했던것을 이곳에서 실행왜냐하면 전화를 끊어서 다시 호출해서 실행해야하니까 생성자에서
		// 이곳으로 옮김
		String sql = "insert into User_info(uiName, uiAge, uiCredat,uicretim,uiEtc,uiDelete) "
				+ "values(?,?,date_format(now(),'%Y%m%d'), date_format(now(), '%H%i%s'),?,'0')";
		// ?랑 디폴트가 앞에 갯수 6개와 동일해야함디폴트값이 0이고
		// 물음표있는거는 statement못쓰고 preparedStatement사용
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);// 파싱 바인딩 실행
			ps.setString(1, userInfo.get("uiName"));// 첫번째 물음표 해쉬맵에서 꺼내온 것을 바인딩
			ps.setString(2, userInfo.get("uiAge"));// 두번째물음표
			ps.setString(3, userInfo.get("uiCredat"));

			// return ps.executeUpdate();
			result = ps.executeUpdate();
			this.con.commit();// 저장
		} catch (SQLException e) {
			try {
				this.con.rollback();//
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			DBCon.closeCon();// 반드시 전화끊어줘야함
		}
		return result;

		// return 1;
	}

	@Override
	public int updatetUserInfo(HashMap<String, String> userInfo) {// where조건문이어야함
		
		this.con = DBCon.getCon();
		String sql = "update user_info";
		if(userInfo!=null) {
			if(userInfo.get("uiName")!=null) {
				sql += " set uiEtc=? where uiName=?";
			}
		}
		try{
			PreparedStatement ps = this.con.prepareStatement(sql);
			if(userInfo!=null) {
				if(userInfo.get("uiName")!=null) {
					ps.setString(1, userInfo.get("uiEtc"));
					ps.setString(2, userInfo.get("uiName"));
					}
				}
			
				result= ps.executeUpdate();
				this.con.commit();
		} catch (SQLException e) {
			try {
				this.con.rollback();//
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			DBCon.closeCon();// 반드시 전화끊어줘야함
		}
		return  result;
	}

	@Override
	public int deletetUserInfo(HashMap<String, String> userInfo) {//db에 있는것을 지워야함, 반드시 where조건문이있어야함
		
		this.con = DBCon.getCon();
		String sql = "delete from user_info";
		if(userInfo!=null) {
			if(userInfo.get("uiName")!=null) {
				sql += " where uiName=?";
			}
		}
		try{
			PreparedStatement ps = this.con.prepareStatement(sql);
			if(userInfo!=null) {
				if(userInfo.get("uiName")!=null) {
			
					ps.setString(1, userInfo.get("uiName"));
					}
				}
			
				result= ps.executeUpdate();
				this.con.commit();
		} catch (SQLException e) {
			try {
				this.con.rollback();//
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			DBCon.closeCon();// 반드시 전화끊어줘야함
		}
		return  result;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserInfoList(HashMap<String, String> userInfo) {
		ArrayList<HashMap<String, String>> userInfoList = new ArrayList<HashMap<String, String>>();
		this.con = DBCon.getCon();

		String sql = "select *from user_info";/// *uiNum, uiName, uiAge,uiCredat,uiCretim,uiDelete,uiEtc */ㄴ

		if (userInfo != null) {
			if (userInfo.get("uiName") != null) {
				sql += " where uiName=?";// "한칸 띄어야 함 ?로 하면 모름 파싱 물음표에 데이터 바인딩
			}
		}
		try {

			PreparedStatement ps = this.con.prepareStatement(sql);
			if (userInfo != null) {
				if (userInfo.get("uiName") != null) {
					sql += " where uiName=?";// "한칸 띄어야 함 ?로 하면 모름 파싱 물음표에 데이터 바인딩
					ps.setString(1, userInfo.get("uiName"));
				}
			}//반영값 받는것==>쿼리일떄
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {// 찾았는데 뒤에[ 없으면 뽈수
				HashMap<String, String> user = new HashMap<String, String>();
				user.put("uiNum", rs.getString("uiNum"));
				user.put("uiName", rs.getString("uiName"));
				user.put("uiAge", rs.getString("uiAge"));
				user.put("uiCredat", rs.getString("uiCredat"));
				user.put("uiCretim", rs.getString("uiCretim"));
				user.put("uiDelete", rs.getString("uiDelete"));
				user.put("uiEtc", rs.getString("uiEtc"));
				userInfoList.add(user);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBCon.closeCon();
		}
		return userInfoList;// 아까남았던 해쉬맵출력

	}
}
