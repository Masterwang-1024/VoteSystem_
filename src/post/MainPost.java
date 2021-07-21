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
 * Servlet implementation class MainPost
 */
public class MainPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     *  HttpServlet#HttpServlet()
     */
    public MainPost() {
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
	 *  HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		TopicDao topicdao=new TopicDao();
		List<Topic> list=topicdao.query();
		request.setAttribute("list", list);
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
