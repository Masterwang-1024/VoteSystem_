package post;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Topic;
import dao.TopicDao;



/**
 * Servlet implementation class UpdatePost
 */
public class UpdatePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * HttpServlet#HttpServlet()
     */
    public UpdatePost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 *  HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			String s=request.getParameter("id");
			int id=Integer.parseInt(s);
			String title=request.getParameter("title");
			String s1=request.getParameter("startTime");
			Date startTime=Date.valueOf(s1);
			String s2=request.getParameter("endTime");
			Date endTime=Date.valueOf(s2);
			String option1=request.getParameter("option1");
			String option2=request.getParameter("option2");
			String option3=request.getParameter("option3");	
			String option4=request.getParameter("option4");
			System.out.println(id);
			TopicDao topicdao=new TopicDao();
			Topic topic=new Topic();
			topic.setTitle(title);
			topic.setStartTime(startTime);
			topic.setEndTime(endTime);
			topic.setOption1(option1);
			topic.setOption2(option2);
			topic.setOption3(option3);
			topic.setOption4(option4);
			boolean b=topicdao.update(topic,id);
			if(b==true){
				//System.out.println(topic.getTitle());
				request.getRequestDispatcher("MainPost").forward(request, response);
			}else{
				response.sendRedirect("main.jsp");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			}
	}

}
