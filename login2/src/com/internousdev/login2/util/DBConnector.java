package com.internousdev.login2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
//ドライバとDBアクセス用のユーザー名、パスを定義してDBに接続
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/logindb_numanaka";

	private static String user="root";
	private static String password="mysql";

	public Connection getConnection(){ //インポートしたconnectionクラスのgetterを使う
		Connection con=null;//接続プロセスを初期化

		try{
			Class.forName(driverName);
			con=(Connection)DriverManager.getConnection(url,user,password);

		}catch(ClassNotFoundException e){
			e.printStackTrace();

		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}


}
