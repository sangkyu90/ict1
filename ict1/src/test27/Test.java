package test27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[]args) {
		Connection con = null;//�ʱ�ȭ�� �ؾ� ��밡�� 
		String url = "jdbc:mariadb://192.168.0.48:3306/oreo";
		String user = "root";
		String password = "12345678";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			
			
			String sql = "select * from user_info where uNum = 2";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String str = rs.getString("uNum")+",";
				str += rs.getString("uName")+",";
				str += rs.getString("uAge")+",";
				str += rs.getString("uAddress")+",";
				System.out.println(str);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			if(con!= null) {
				try{
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
	}

}
