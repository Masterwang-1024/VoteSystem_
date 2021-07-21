package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class UserDao2 {
	
	public User findUser(String username){
		Connection c=null;
		try{
			c=ConnectionManager.getConnection();
			String sql="select * from mguser where username=?";
			System.out.println(c);
			PreparedStatement pst=c.prepareStatement(sql);
			
			pst.setString(1, username);
			ResultSet rs=pst.executeQuery();
			if(rs.next()==false){
				return null;
			}else{
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				return user;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			ConnectionManager.closeConnection(c);
		}
	}

}
