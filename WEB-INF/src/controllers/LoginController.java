package controllers;
import java.io.IOException;
import java.io.PrintWriter;

import domain.LoginBean;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		LoginBean login = new LoginBean();
		login.setUsername(req.getParameter("username"));
		login.setPassword(req.getParameter("password"));
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Login</title></head>");
		out.print("<body>");
		if(authenticate(login)) {
			out.print("<p>You are successfully logged in!</p>");
		} else {
			out.print("<p>The credentials you provided are invalid..</p>");
		}
		out.print("</body>");
		out.print("</html>");
	}
	
	private Boolean authenticate(LoginBean login) {
		Boolean success = false;
		if(login.getPassword().length() > 0 && login.getPassword().length() > 0) {
			success = true;
		}
		return success;
	}
}