package post;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserDao;
import dao.UserDao2;



/**
 * Servlet implementation class LoginPost
 */
public class LoginPost2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     *HttpServlet#HttpServlet()
     **/
    public LoginPost2() {
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
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserDao userdao=new UserDao();
		
		User user=userdao.findUser(username);
		
		if(user==null){
			request.getSession().setAttribute("result", "-1");
			response.sendRedirect("login.jsp");
		}else if(!user.getPassword().equals(password)){
			request.getSession().setAttribute("result", "-2");
			response.sendRedirect("login.jsp");
		}else{
		
			request.getSession().removeAttribute("result");
			request.getSession().setAttribute("user", user);
			response.sendRedirect("IndexPost");
			
		}
	}

}
