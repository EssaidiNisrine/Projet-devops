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
import javax.servlet.http.HttpSession;

import AccesBD.DAOCompte;
import Metier.Compte;


@WebServlet("/Servlet9")
public class Servlet9 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet9() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   DAOCompte daoCompte=new DAOCompte();
		   HttpSession session=request.getSession();
		   String username= request.getParameter("username");
		   session.setAttribute("username", username);
		   session.setAttribute("passwordd",request.getParameter("password"));
	       
		   request.setAttribute("username", username);
	       ArrayList<Compte> listCompte= new ArrayList<Compte>();
	       listCompte=daoCompte.selectAll();
	       request.setAttribute("listcompte",listCompte);
	       RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/GestionCompte.jsp");
          requestDispatcher .forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   HttpSession session=request.getSession();
		   String username=(String) session.getAttribute("username");
		   String password=(String) session.getAttribute("passwordd");
		   String N_username=request.getParameter("N_username");
		   String N_password="profensa"+String.valueOf(new Random().nextInt(10000));
		   DAOCompte daoCompte=new DAOCompte();
		   daoCompte.modificationCompte(username, password, N_username, N_password);
	       ArrayList<Compte> listCompte= new ArrayList<Compte>();
	       listCompte=daoCompte.selectAll();
	       request.setAttribute("listcompte",listCompte);
	       RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/GestionCompte.jsp");
	       requestDispatcher .forward(request, response);
	}

}
