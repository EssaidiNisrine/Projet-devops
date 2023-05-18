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
import javax.servlet.http.HttpSession;

import AccesBD.DAOAdministrateur;
import AccesBD.DAOCompte;
import AccesBD.DAOElement;
import AccesBD.DAOEnseigner;
import AccesBD.DAOProfesseur;
import Metier.Administrateur;
import Metier.Compte;
import Metier.ProfCompte;


@WebServlet("/Servlet0")
public class Servlet0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Servlet0() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//La premiere servlet
              HttpSession session=request.getSession();
		      String username=request.getParameter("username");
              String password=request.getParameter("password");
 		      DAOProfesseur daoProf=new DAOProfesseur();
 		      DAOEnseigner daoEnseigner=new DAOEnseigner();
 		      DAOElement daoElem=new DAOElement();
 		      DAOCompte daocompte=new DAOCompte();
 		      DAOAdministrateur daoAdmin=new DAOAdministrateur();
 		      ArrayList<ProfCompte> listProfCompte =new ArrayList<ProfCompte>();
 		      ArrayList<String> listElemProfNV =new ArrayList<String>();
 		      Administrateur admin=daoAdmin.getAdmin();
 		      listProfCompte=daoProf.selectAllProfCompte();
 		      Compte compteAdmin=daocompte.selectCompteAdmin(admin);
              if(compteAdmin.getUserName().equals(username) && compteAdmin.getPassword().equals(password)) {
                  RequestDispatcher requestDispatcher=request.getRequestDispatcher("dashboard.html");
                  requestDispatcher .forward(request, response);
              }
 		      for(int i=0;i<listProfCompte.size();i++) {
 		    	  if(listProfCompte.get(i).getUsername().equals(username) && listProfCompte.get(i).getPassword().equals(password) ) {
 		    		 session.setAttribute("listeProdElem",daoEnseigner.selectElemProf(listProfCompte.get(i).getCodeProf()) ); 
 		    		 for(int j=0;j<daoEnseigner.selectElemProf(listProfCompte.get(i).getCodeProf()).size();j++) {
 		    			 if(!daoElem.selectElm(daoEnseigner.selectElemProf(listProfCompte.get(i).getCodeProf()).get(j))) {
 		    				listElemProfNV.add(daoEnseigner.selectElemProf(listProfCompte.get(i).getCodeProf()).get(j));
 		    			 }
 		    		 }
 		    		 session.setAttribute("listElemProfNV",listElemProfNV ); 

 	                 RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/dashboard2.jsp");
 	                 requestDispatcher .forward(request, response);	    	    
 		    	  }	 
		     }    
                 RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.html");
                 requestDispatcher .forward(request, response);
              


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
