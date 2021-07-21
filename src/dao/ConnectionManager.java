package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/u1?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	private static final String USER="root";
	private static final String PW="123456";
	public static Connection getConnection(){
			Connection c=null;
			try{
				try {
					Class.forName(DRIVER);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				c=DriverManager.getConnection(URL,USER,PW);
				return c;
				
			}catch(SQLException e){
				e.printStackTrace();
			
				return null;
			}
	}
	public static void closeConnection(Connection c){
		try{
			if (c!=null) {
				c.close();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	 public static void main(String args[])
	 {
		 ConnectionManager connectionmanager=new ConnectionManager();
		  Connection c=connectionmanager.getConnection();
		System.out.print(c);
		 // ConnectionManager.getConnection(); 
		}

}
