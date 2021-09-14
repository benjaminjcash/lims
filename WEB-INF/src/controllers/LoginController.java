package controllers;
import java.io.IOException;

import domain.CustomerBean;
import managers.LoginManager;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CustomerBean customer = new CustomerBean();
		customer.setUsername(req.getParameter("username"));
		customer.setPassword(req.getParameter("password"));
		customer.setFirstName("Benjamin");
		
		LoginManager manager = new LoginManager();
		if(manager.authenticate(customer)) {
			HttpSession session = req.getSession();
			session.setAttribute("customer", customer);
			req.setAttribute("customer", customer);
			getServletContext().getRequestDispatcher("/home").forward(req, res);
		} else {
			getServletContext().getRequestDispatcher("/error").forward(req, res);
		}
	}
}