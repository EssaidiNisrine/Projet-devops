package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metier.Element;
import Metier.Professeur;


public class DAOEnseigner {
	 private Statement statement=null;
     ConnectionBD conn=new ConnectionBD();
     Connection connection=conn.ConnectionDb();
     
     public DAOEnseigner() {
		super();
	}
     
	{
     try {
    	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
     }
	public boolean testExiste(int codeProf,int codeElem) {
		try {
 			String req="SELECT * FROM `enseigne` WHERE enseigne.code_Prof=? and enseigne.code_Elem=?";
 			PreparedStatement prepStatem=connection.prepareStatement(req);
 			prepStatem.setInt(1, codeProf);
 			prepStatem.setInt(2, codeElem);
 			ResultSet res=prepStatem.executeQuery();
 			while(res.next()) {
                      return true;
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
  	public boolean AffecterElemProf(String nomProf,String prenomProf,String nomElemt) {
  		DAOProfesseur daoP=new DAOProfesseur();
  		DAOElement daoE=new DAOElement();
  		int codeProf=daoP.selectprof(nomProf, prenomProf);
  		int codeElem=daoE.selectElem(nomElemt);
  		System.out.println(codeProf+" "+codeElem);
  		if(!testExiste(codeProf,codeElem)) {
  		try {
  			String req="INSERT INTO `enseigne`(`code_prof`, `code_elem`) VALUES ('"+codeProf+"','"+codeElem+"')";
			int rt=statement.executeUpdate(req);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		}
  		return false;
  		
  	}

  	public ArrayList<String>  selectElemParProf(Professeur prof) {
  	          ArrayList<String > listeElemParProf =new ArrayList<String>();
   			  try {
   	  	    	  String req="select nom_elem from enseigne , element where enseigne.code_elem=element.code_elem and enseigne.code_prof=?";
   	   			  PreparedStatement prepStatem=connection.prepareStatement(req);
				  prepStatem.setInt(1, prof.getCodeProf());
	   			  ResultSet res=prepStatem.executeQuery();
	   			  while(res.next()) {
	                      listeElemParProf.add(res.getString("nom_elem"));
	 			  }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   

		return listeElemParProf;
 	}
  	public ArrayList<String>  selectElemProf(int code_prof) {
          ArrayList<String > listeElemParProf =new ArrayList<String>();
			  try {
	  	    	  String req="select nom_elem from enseigne , element where enseigne.code_elem=element.code_elem and enseigne.code_prof=?";
	   			  PreparedStatement prepStatem=connection.prepareStatement(req);
			  prepStatem.setInt(1, code_prof);
 			  ResultSet res=prepStatem.executeQuery();
 			  while(res.next()) {
                    listeElemParProf.add(res.getString("nom_elem"));
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   

	return listeElemParProf;
}
     
}
