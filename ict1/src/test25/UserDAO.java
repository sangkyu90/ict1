package test25;

import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDAO {
	public static void main(String[] args) {
		String url = "jdbc:mariadb://198.168.0.48:3306/oreo";
		String user = "root";
		String password = "12345678";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
