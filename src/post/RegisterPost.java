package post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserDao;


/**
 * Servlet implementation class RegisterPost
 */
public class RegisterPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     *  HttpServlet#HttpServlet()
     */
    public RegisterPost() {
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
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");
		User user=new User();
		
		user.setUsername(uname);
		user.setPassword(pwd);
		UserDao userDao=new UserDao();
		userDao.insert(user);
		System.out.println("ok");
		
		request.getRequestDispatcher("IndexPost").forward(request, response);
		
	}

}
