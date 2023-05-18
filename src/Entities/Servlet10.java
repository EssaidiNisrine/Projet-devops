package Entities;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet10")
public class Servlet10 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet10() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/ElemProf.jsp");
         requestDispatcher .forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
