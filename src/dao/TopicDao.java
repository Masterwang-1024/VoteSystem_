package dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import bean.Topic;



public class TopicDao {
	public List<Topic> query(){
		Connection c=null;   
		List<Topic> list =new ArrayList<Topic>();
		try{
			c=ConnectionManager.getConnection();
			String sql="select * from topic";
			PreparedStatement pst=c.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				Topic topic =new Topic();
				topic.setId(rs.getInt("id"));
				topic.setTitle(rs.getString("title"));
				topic.setOption1(rs.getString("option1"));
				topic.setOption2(rs.getString("option2"));
				topic.setOption3(rs.getString("option3"));
				topic.setOption4(rs.getString("option4"));
				topic.setStartTime(rs.getDate("startTime"));
				topic.setEndTime(rs.getDate("endTime"));
				topic.setCount1(rs.getInt("count1"));
				topic.setCount2(rs.getInt("count2"));
				topic.setCount3(rs.getInt("count3"));
				topic.setCount4(rs.getInt("count4"));
				list.add(topic);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
			
		}finally{
			ConnectionManager.closeConnection(c);
		}
		
	}
	
	public boolean insert(Topic topic){
		Connection c=null ;      ;
		try{
			c=ConnectionManager.getConnection();
			String sql="insert into topic(title,startTime,endTime,isStart,option1,option2,option3,option4,count1,count2,count3,count4) values (?,?,?,0,?,?,?,?,0,0,0,0)";
			PreparedStatement pst=c.prepareStatement(sql);
			pst.setString(1,topic.getTitle());
			pst.setString (2,String.valueOf(topic.getStartTime()));
			pst.setString(3,String.valueOf(topic.getStartTime()));
			pst.setString(4,topic.getOption1());
			pst.setString(5,topic.getOption2());
			pst.setString(6,topic.getOption3());
			pst.setString(7,topic.getOption4());
			//pst.setString(8,topic.getOption5());
			pst.execute();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			ConnectionManager.closeConnection(c);
		}
		
	}

	
	public Topic query(int id){
		Connection c=null ;      ;
		try{
			c=ConnectionManager.getConnection();
			String sql="select * from topic where id=?";
			PreparedStatement pst=c.prepareStatement(sql);
			pst.setInt(1,id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				Topic topic=new Topic();
				topic.setId(rs.getInt("id"));
				topic.setTitle(rs.getString("title"));
				topic.setStartTime(rs.getDate("startTime"));
				topic.setEndTime(rs.getDate("endTime"));
				topic.setIsStart(rs.getInt("isStart"));
				topic.setOption1(rs.getString("option1"));
				topic.setOption2(rs.getString("option2"));
				topic.setOption3(rs.getString("option3"));
				topic.setOption4(rs.getString("option4"));
				topic.setCount1(rs.getInt("count1"));
				topic.setCount2(rs.getInt("count2"));
				topic.setCount3(rs.getInt("count3"));
				topic.setCount4(rs.getInt("count4"));
				return topic;
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null; 
		}finally{
			ConnectionManager.closeConnection(c);
		}
		
	}
	public boolean vote(int id,int option){
		Connection c=null;
		try{
			c=ConnectionManager.getConnection();
			String sql="";
			if(option==1){
				sql="update topic set count1=count1+1 where id=?";
			}else if(option==2){
				sql="update topic set count2=count2+1 where id=?";
			}else if(option==3){
				sql="update topic set count3=count3+1 where id=?";
			}else if(option==4){
				sql="update topic set count4=count4+1 where id=?";
			}
			PreparedStatement pst=c.prepareStatement(sql);
			pst.setInt(1, id);
			pst.execute();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			ConnectionManager.closeConnection(c);
		}	
	}
	public boolean delete(int id){
		Connection c=null;
		try{
			c=ConnectionManager.getConnection();
			String sql="delete from topic where id=?";
			PreparedStatement pst=c.prepareStatement(sql);
			pst.setInt(1,id);
			pst.execute();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			ConnectionManager.closeConnection(c);
		}
	}
	public boolean update(Topic topic,int id){
		 	Connection c=null;
		 	try{
		 		c=ConnectionManager.getConnection();
				String sql="update topic set title=?,startTime=?,endTime=?,option1=?,option2=?,option3=?,option4=? where id=?";
				PreparedStatement pst=c.prepareStatement(sql);
				pst.setString(1, topic.getTitle());
				pst.setDate(2, topic.getStartTime());
				pst.setDate(3, topic.getEndTime());
				pst.setString(4, topic.getOption1());
				pst.setString(5, topic.getOption2());
				pst.setString(6, topic.getOption3());
				pst.setString(7, topic.getOption4());
				//System.out.println(topic.getCount1()+"  "+topic.getOption1()+"   "+topic.getTitle()+" id is:  "+id);
				pst.setInt(8,id);
				pst.execute();
				
				return true;
		 	
		 	}catch(Exception e){
		 		e.printStackTrace();
		 		return false;
		 	}finally{
		 		ConnectionManager.closeConnection(c);
		 	}
	}
	
	
		public static void main(String args[]){
		TopicDao topicdao=new TopicDao();
		//List<Topic> list=topicdao.query();
		//System.out.println(""+list.size());
		//TopicDao topicdao=new TopicDao();
		Topic topic =new Topic();
		topic.setTitle("");
		topic.setStartTime(new Date(2017-1-6));
		topic.setEndTime(new Date(2017-2-6));
		topic.setOption1("1");
		topic.setOption2("2");
		topic.setOption3("sadfadfsux2");
		topic.setOption4("lad");
		//boolean b=topicdao.update(topic,11);
		boolean b=topicdao.insert(topic);
		//System.out.println("update  "+b);*/
		//Topic topic=topicdao.query(1);
		//boolean c=topicdao.vote(1, 3);
		//boolean c=topicdao.update(topic, 17);
		
		//boolean c=topicdao.delete(10);
		System.out.print(b);
	
	}
}
