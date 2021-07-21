package dao;
import java.sql.*;

import bean.User;
public class UserDao {
	public void insert(User user) {
		Connection con=null;	
		try {
			con=ConnectionManager.getConnection();
			String sql="insert into user(username,password) values (?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.execute();
			System.out.println("»¶Ó­Ç°À´Í¶Æ±");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public User findUser(String username){
		Connection c=null;
		try{
			c=ConnectionManager.getConnection();
			String sql="select * from user where username=?";
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
	public static void main(String args[]){
			UserDao userdao=new UserDao();
			User user=userdao.findUser("admin");
			User u=new User();
			u.setUsername("lqz");
			u.setPassword("777");
			userdao.insert(u);
			System.out.println(user.getPassword());
					
	}
}
