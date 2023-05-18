package Entities;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AccesBD.DAOElement;
import AccesBD.DAOEnseigner;
import AccesBD.DAOProfesseur;
import Metier.Element;
import Metier.Professeur;

@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Servlet4() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     	DAOProfesseur profs= new DAOProfesseur();
		    DAOElement elements=new DAOElement();
		    ArrayList<Professeur> listProfs=new ArrayList<Professeur>();
		    ArrayList<Element> listElem=new ArrayList<Element>();
		    listProfs=profs.selectAllProf();
		    listElem=elements.selectAll();
	        request.setAttribute("listProfs",listProfs);
	        request.setAttribute("listElems",listElem);
	        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/Affectation.jsp");
	        requestDispatcher .forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chaine=request.getParameter("inputliste1");
		String[] np=chaine.split(" ");
		String nom_elem=request.getParameter("inputliste2");
		DAOEnseigner daoEn=new DAOEnseigner();
		PrintWriter out=response.getWriter();
		if(daoEn.AffecterElemProf(np[0], np[1], nom_elem)) {
			  String mssg="Element affectee";
		      request.setAttribute("mssg",mssg);
		}
	    else{
			  String mssg="Element deja affectee";
		      request.setAttribute("mssg",mssg);
		}
	      doGet(request, response);
	}

}
