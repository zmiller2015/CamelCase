package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSelection {

	public static void main(String... strings){
		final String DB_name = "Local instance MySQL57";
		final String MYSQL_USERNAME = "root";
		final String MYSQL_PASSWORD = "";
		final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_name;
	
		Connection con = null;
		PreparedStatement prepStmnt = null;
		ResultSet dataset = null;
		
	try{
		Class.forName("com.mysql.jdbc.Driver");
		String unicode = "?useUnicode=yes&characterEncoding=UTF-8";
		con = (Connection) DriverManager.getConnection(DB_URL + unicode, MYSQL_USERNAME, MYSQL_PASSWORD);
		String query = "SELECT * FROM Film";
		prepStmnt = con.prepareStatement(query);
		dataset = prepStmnt.executeQuery();
		while(dataset.next()){
			System.out.println(dataset.getString("_name"));
		}
	} catch (SQLException se){
		System.out.println("Database error!");
	}catch (ClassNotFoundException ce){
		System.out.println("Driver error!");
	}finally{
		try {
			if (dataset != null){
				dataset.close();
			}
		}catch (SQLException e){
			
		}
	}
	
	}
	
	
}
