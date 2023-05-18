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

import AccesBD.DAOElement;
import AccesBD.DAOEtudiant;
import AccesBD.DAOEtudie;
import AccesBD.DAOModalite;
import Metier.Etudiant;
import Metier.EtudiantElem;
import Metier.ModaliteElem;

@WebServlet("/Servlet11")
public class Servlet11 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet11() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
        DAOModalite daoModalite=new DAOModalite();
        DAOEtudiant daoEtudiant=new DAOEtudiant();
        ArrayList<Etudiant> listElud=new ArrayList<Etudiant>();
        ArrayList<ModaliteElem> listModaliteElem=new ArrayList<ModaliteElem>();
        String nomElem=request.getParameter("name");
        DAOElement daoElement=new DAOElement();
        int codeElm=daoElement.selectElem(nomElem);
        listModaliteElem=daoModalite.selectElemModule(nomElem);
        listElud=daoEtudiant.selectEtudiantsParElem(nomElem);
      //  PrintWriter out=response.getWriter();
       // out.println(daoElement.selectElm(nomElem));
        
        if(!daoElement.selectElm(nomElem)) {
            session.setAttribute("listModaliteElem", listModaliteElem);
            session.setAttribute("listElud", listElud);
            session.setAttribute("codeElm", codeElm);
            session.setAttribute("nomElem", nomElem);
            request.setAttribute("listModaliteElem", listModaliteElem);
            request.setAttribute("listElud", listElud);
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/listEtudiantElem.jsp");
            requestDispatcher .forward(request, response);
        }
        else {
        	
        	
        	
        }

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		ArrayList<Etudiant> listElud= (ArrayList<Etudiant>) session.getAttribute("listElud");
		int codeElem=(int) session.getAttribute("codeElm");	
		ArrayList<EtudiantElem> etudiants=new ArrayList<EtudiantElem>();
		DAOEtudie daoEtudie=new DAOEtudie();
		DAOElement daoElement=new DAOElement();
		EtudiantElem etudiant ;
		String nom , prenom;
		float note;
		boolean isV , isA;
		for(int i=0;i<listElud.size();i++) {
			nom=listElud.get(i).getNomEtud();   prenom=listElud.get(i).getPrenomEtud();
			note=Float.parseFloat(request.getParameter("note"+i));
			if(request.getParameter("isV"+i).equals("V")) {
				isV=true;
			}
			else {
				isV=false;
			}
			if(request.getParameter("isA"+i).equals("A")) {
				isA=true;
			}
			else {
				isA=false;
			}
		etudiant=new EtudiantElem(listElud.get(i).getCne(),nom, prenom, note, isV, isA);
		etudiants.add(etudiant);
		}
	    for(int i=0;i<etudiants.size();i++) {
	    	daoEtudie.updateEtudiant(etudiants.get(i), codeElem);
	    }
	    daoElement.updateVelem(codeElem);
	
		//doGet(request, response);
	}

}
