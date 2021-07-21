package post;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Topic;
import dao.TopicDao;

/**
 * Servlet implementation class DeletePost
 */
public class DeletePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     *  HttpServlet#HttpServlet()
     */
    public DeletePost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 *  HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=request.getParameter("id");
		int id=Integer.parseInt(s);
		System.out.println(id);
		TopicDao topicdao=new TopicDao();
		boolean b=topicdao.delete(id);
		if(b==true){
			TopicDao tp = new TopicDao();
			 List<Topic> list=tp.query();
			 request.getSession().setAttribute("list",list);
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else{
			response.sendRedirect("main.jsp");
		}
	}

}
