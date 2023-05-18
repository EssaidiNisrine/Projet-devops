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
import AccesBD.DAOFiliere;
import Metier.Compte;
import Metier.Filiere;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    DAOFiliere daoFil=new DAOFiliere();
            ArrayList<Filiere> listFil= new ArrayList<Filiere>();
            listFil=daoFil.selectAll();
            request.setAttribute("listFil",listFil);
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/ListFil.jsp");
            requestDispatcher .forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
	
	}

}
