package test26;
//Db에서 값을 select mybatis
//MetaData와 rowData(실제 데이터)가있음
//미지의 데이터를 검색하여 원하는 것을 겟하면 정보

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
//sql은 인터프리터라(바로실행하기떄문에) 실행을해봐야 오류를 알아서 오타난 것을 알 수 없다.
//반대로 자바는 원시코드를  번역하는 과정을 거쳐서( 컴파일)을 해서 오타난것을 알수있어
import java.util.ArrayList;
import java.util.List;

//scan.close()
public class DBCon {
	public static void main(String[]args) {
		Connection con= null;
		String url = "jdbc:mariadb://192.168.0.48:3306/oreo";//전화번호
		String id = "root";
		String pwd = "12345678";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");//exception강제,[ 오타나거나, maria db client없으면 에러남]
						//패킺.패키지.대문자면 클래스나 인터페이스 여기서는 클래스
			//클래스명.static
			con = DriverManager.getConnection(url, id,pwd);//데이터 베이스에 전화건다. 포트번호 //같은 컴퓨터라도 마리아디비 서버 로긴해서 파일창 띄운것
			//class.static.매서드 exception 강요									//공항이 같아도 도착지가 다름
			
			Statement stmt = con.createStatement();//쿼리 창 띄움
					//명령문입력 //프리페어statement를 사용
			
			//물음표 바인딩 
			//String sql = "select * from user_info";//쿼리언어입력
			
			String sql ="delete from user_info where uNum=1";//1번삭제되면 자동저장이라 와일문에서 데이터 1번이 출력되지 않는다.
			int cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("삭제");
			}else {
				System.out.println("1번없엉삭제 가안됨");
			}
			
			sql = "insert into user_info(uName,uAge,uAddress,uEtc)";
			sql += "Values('홍길동',22,'서울','테스트')";//두줄로씀
							//자동형변환, 숫자만 가능
			cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("등록이잘됐어요");
			}else {
				System.out.println("등록안됨");
			}
					
			
			sql = "select * from user_info";
			
			sql = "update user_info set uEtc = '테스트' where uNum=4 and uNum=1";
			//and 와 or
			cnt = stmt.executeUpdate(sql);//이클립스에서 하는게 아니고 데이터 베이스에서 하는 것이라 전화를 걸어줌
			if(cnt==1) {
				//있다!
				System.out.println("수정이잘됐어요");
			}else {
				System.out.println("수정안됨");
			}
			sql = "select * from user_info";
			ResultSet rs = stmt.executeQuery(sql);//쿼리창에 sql 입력실행////select는 MetaData와 RowData두개 이고 
			//모두다 들고 있다. 두가지 종류 데이터 다 가지고 있다. 
			//아래참고
			ResultSetMetaData rsmd = rs.getMetaData();
			int colSize = rsmd.getColumnCount();
			/*ArrayList<String> colList = new ArrayList<String>();
			
			
			for(int i = 0;i<=colSize;i++) {
				//colList.add(rsmd.getColumnLabel(i));
				String colName = rsmd.getColumnLabel(i);
				System.out.println(colName);
			}
			while(rs.next()){
			for(String col:colList){
			System.out.print(rs.getString(col)+",");
			} 
				System.out.println();
				}*/
			
			
			
			
			//결과set --메모리중복없음, c+S+o
			while(rs.next()) {
				//데이터 확인후 있으면 = true> ,일때 동작  정보 없으면return false while문 종료
				//넥스트 안하면 몇번 호출해도 커서 위치에 있는 것을 호출
			/*int uNum = rs.getInt("uNum");//앞번호
			String uName = rs.getString("uName");
			int  uAge = rs.getInt("uAge");
			String uAddress = rs.getString("uAddress");
			*/
				
				String str = rs.getInt("uNum")+","+rs.getString("uName");
							//=getString("uNum")
				str += ","+ rs.getInt("uAge")+","+rs.getString("uAddress");
				str += ","+ rs.getString("uEtc");
				System.out.println(str);
			//System.out.println(uNum+","+uName+","+uAge+","+uAddress);
			
				
			}
			
			System.out.println("연결성공");
				
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가없당");
			e.printStackTrace();
			
		} catch (SQLException e) {
			//con = DriverManager.getConnection(url, id,pwd);이것에 대한 exception
			//my-sql 던져주는 에러 받는것
			e.printStackTrace();
		}
		System.out.println("종료");
		
	}
}


			
		
	
		
		