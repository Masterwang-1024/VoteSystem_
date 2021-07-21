package post;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Topic;
import dao.TopicDao;



/**
 * Servlet implementation class IndexPost
 */
public class IndexPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * HttpServlet#HttpServlet()
     */
    public IndexPost() {
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
	 * HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String option = request.getParameter("option");
		HttpSession session = request.getSession();
		Integer id =(Integer) session.getAttribute("id");
		
		TopicDao topicDao = new TopicDao();
		
		if (option!=null&&id!=null) {
			topicDao.vote(id, Integer.valueOf(option));
		}
		List<Topic> list = topicDao.query();

		request.setAttribute("list", list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

}
