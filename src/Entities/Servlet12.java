package Entities;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet12")
public class Servlet12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet12() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Servlet 12
	      RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/dashboard2.jsp");
	      requestDispatcher .forward(request, response);      
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
