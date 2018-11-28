package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfigurationSol2 {
	
	private JDBCConfigurationSol2 (){
		
	}
	private static final String DB_Driver = "com.mysql.jdbc.Driver";
	private static final String DB_Connection ="jdbc:mysql://127.0.0.1/ville?user=root&password=&serverTimezone=UTC";
	
	static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException {

		try {
			Class.forName(DB_Driver);
			if(connection == null) {
				connection = DriverManager.getConnection(DB_Connection);
				return connection;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}

}
