package post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Topic;
import dao.TopicDao;


/**
 * Servlet implementation class VotePost
 */
public class VotePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     *  HttpServlet#HttpServlet()
     */
    public VotePost() {
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
		String s=request.getParameter("id");
		int id=Integer.parseInt(s);
		TopicDao topicdao=new TopicDao();
		Topic topic=topicdao.query(id);
		HttpSession session = request.getSession();
		
		if (session.getAttribute("id")!=null) {
			session.removeAttribute("id");
		}
		session.setAttribute("id", id);
		request.setAttribute("topic", topic);
		System.out.println(session.getAttribute("id")+"////////");
		request.getRequestDispatcher("vote.jsp").forward(request, response);
	}

}
