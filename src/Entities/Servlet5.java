package Entities;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AccesBD.DAOElement;
import Metier.Element;
import Metier.ModaliteElem;

@WebServlet("/Servlet5")
public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet5() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      DAOElement daoElem=new DAOElement();
      ArrayList<Element> listElem= new ArrayList<Element>();
      listElem=daoElem.selectAll();
      request.setAttribute("listElem",listElem);
      RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/ListModaliteElem.jsp");
      requestDispatcher .forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
