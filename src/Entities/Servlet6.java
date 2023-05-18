package Entities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AccesBD.DAOCompte;
import Metier.Compte;

@WebServlet("/Servlet6")
public class Servlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet6() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      DAOCompte daoCompte=new DAOCompte();
      ArrayList<Compte> listCompte= new ArrayList<Compte>();
      listCompte=daoCompte.selectAll();
      request.setAttribute("listcompte",listCompte);
      RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/GestionCompte.jsp");
      requestDispatcher .forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String password="profensa"+String.valueOf(new Random().nextInt(10000));
		  request.setAttribute("password",password);
	      DAOCompte daoCompte=new DAOCompte();
	      ArrayList<Compte> listCompte= new ArrayList<Compte>();
	      listCompte=daoCompte.selectAll();
	      request.setAttribute("listcompte",listCompte);
	      RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/GestionCompte.jsp");
	      requestDispatcher .forward(request, response);
	}

}
