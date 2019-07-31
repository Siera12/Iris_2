package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.setAttribute("name","Mrinmoy Das");
		
		ServletContext context=getServletContext();
		context.setAttribute("designation","Developer");
		
		HttpSession session=request.getSession();
		session.setAttribute("employerName","Iris Software");
		
		Cookie c=new Cookie("Thekuya","Bikas ka Thekuya");
		response.addCookie(c);
		
		RequestDispatcher rd=request.getRequestDispatcher("MyForm.jsp");
		rd.forward(request, response);
		
	}

}
