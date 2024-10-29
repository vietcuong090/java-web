package cuong.dev.data.driver;

import java.sql.Connection;
import java.sql.DriverManager;

import static cuong.dev.util.Constants.*;

public class MySQLDriver {
	private static MySQLDriver instance;
	private MySQLDriver() {
		
	}
	public static MySQLDriver getIntance() {
		if(instance == null) instance = new MySQLDriver();
		return instance;
	}
	public Connection getConnection() {
		// TODO Auto-generated method stub
		
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}


}
