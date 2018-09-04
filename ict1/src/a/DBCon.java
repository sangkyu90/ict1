package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String id = "system";
	private static final String pwd ="12345678";
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static Connection con;
	
	private static void open() {
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, id, pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static Connection getCon() {
		
	}
}
