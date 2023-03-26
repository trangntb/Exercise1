package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/javacore32023";//database nam o may A hay may B hay local hay hosting
	private static final String USER = "root";
	private static final String PASS = "1234";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); //load Driver
			//Tao ket noi
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException | ClassNotFoundException e) {//loi khi ko tim thay MySQL Driver hoac ko ket noi dc vi DB_URL, hoac USER, hoac PASS sai
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
