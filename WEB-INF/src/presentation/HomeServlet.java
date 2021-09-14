package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerBean;

public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		CustomerBean customer = (CustomerBean)req.getAttribute("customer");
		out.println("<html><head><title>Welcome</title></head");
		out.println("<body><h1>");
		out.println("Hello " + customer.getFirstName());
		out.println("</h1></body></html>");
	}

}
