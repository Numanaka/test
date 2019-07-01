package com.internousdev.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private String driverName="com.mysql.jdbc.Driver";//ドライバー名
	private String url="jdbc:mysql://localhost/testdb8";//接続URL
	private String user="root";
	private String password="mysql";

	public Connection getConnection(){
		Connection con=null;

		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

}