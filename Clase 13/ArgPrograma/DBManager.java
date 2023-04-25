package ArgPrograma;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

	private static final String DB_NAME = "blog";
	private static final String DB_URL = "jdbc:mysql://192.168.2.15:33060/" + DB_NAME;
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Unapassword1234!";
	private static DBManager instance = null;

	private DBManager() {
	}

	public static DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}

	public Connection connect() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			connection.setAutoCommit(false);
		} catch (Exception e) {
		}
		return connection;
	}

}