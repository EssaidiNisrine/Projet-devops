package Entities;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AccesBD.ConnectionBD;
import AccesBD.DAOCompte;
import AccesBD.DAOElement;
import AccesBD.DAOEnseigner;
import AccesBD.DAOFiliere;
import AccesBD.DAOModule;
import AccesBD.DAOProfesseur;

import Metier.Compte;
import Metier.Element;

import Metier.ModaliteElem;
import Metier.ModuleElem;
import Metier.Professeur;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Servlet1() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Servlet 2
              DAOProfesseur daoProf=new DAOProfesseur();
              DAOEnseigner daoEnseigne=new DAOEnseigner();
              ArrayList<Professeur> listProf= new ArrayList<Professeur>();
              listProf=daoProf.selectAllProf();
              request.setAttribute("listeProf", listProf);
              RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/ListProf.jsp");
              requestDispatcher .forward(request, response);              

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
