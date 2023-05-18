package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Metier.EtudiantElem;



public class DAOEtudie {
	 private Statement statement=null;
     ConnectionBD conn=new ConnectionBD();
     Connection connection=conn.ConnectionDb();
  
  public DAOEtudie() {
		super();
	}
  
	{
  try {
 	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
  }
	
	public void updateEtudiant(EtudiantElem etudiant , int codeElem) {
		  try {
  	    	  String req="UPDATE `etudie` SET `note`=?,`isvalide`=?,`isabsent`=? WHERE etudie.cne=? and etudie.code_elem=?";
   			  PreparedStatement prepStatem=connection.prepareStatement(req);
   			  if(etudiant.isValide() && etudiant.isAbsent()) {
   				  prepStatem.setFloat(1, etudiant.getNote());
   				  prepStatem.setInt(2, 1);
   				  prepStatem.setInt(3, 1);
   				  prepStatem.setInt(4, etudiant.getCode());
   				  prepStatem.setInt(5, codeElem);
   				int i=prepStatem.executeUpdate();
   			  }
   			  if(etudiant.isValide() && (!etudiant.isAbsent())) {
   				  prepStatem.setFloat(1, etudiant.getNote());
   				  prepStatem.setInt(2, 1);
   				  prepStatem.setInt(3, 0);
   				  prepStatem.setInt(4, etudiant.getCode());
   				  prepStatem.setInt(5, codeElem);
   				int i=prepStatem.executeUpdate();
   			  }
   			  if((!etudiant.isValide()) && etudiant.isAbsent()) {
   				  prepStatem.setFloat(1, etudiant.getNote());
   				  prepStatem.setInt(2, 0);
   				  prepStatem.setInt(3, 1);
   				  prepStatem.setInt(4, etudiant.getCode());
   				  prepStatem.setInt(5, codeElem);
   				int i=prepStatem.executeUpdate();
   			  }
   			  if((!etudiant.isValide()) && (!etudiant.isAbsent())) {
   				  prepStatem.setFloat(1, etudiant.getNote());
   				  prepStatem.setInt(2, 0);
   				  prepStatem.setInt(3, 0);
   				  prepStatem.setInt(4, etudiant.getCode());
   				  prepStatem.setInt(5, codeElem);
   				int i=prepStatem.executeUpdate();
   			  }
		  
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
}
