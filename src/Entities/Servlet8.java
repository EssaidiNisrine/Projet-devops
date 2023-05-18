package Entities;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AccesBD.DAOCompte;
import Metier.Compte;


@WebServlet("/Servlet8")
public class Servlet8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet8() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String username=request.getParameter("username");
		  DAOCompte daoCompte=new DAOCompte();
		  daoCompte.supprimerCompte(username);
	      ArrayList<Compte> listCompte= new ArrayList<Compte>();
	      listCompte=daoCompte.selectAll();
	      request.setAttribute("listcompte",listCompte);
	      RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/GestionCompte.jsp");
	      requestDispatcher .forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
