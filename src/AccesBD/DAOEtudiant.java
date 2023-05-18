package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metier.Etudiant;

public class DAOEtudiant {
	 private ArrayList<Etudiant> listElem =new ArrayList<Etudiant>();
	 private Statement statement=null;
    ConnectionBD conn=new ConnectionBD();
    Connection connection=conn.ConnectionDb();
   
   public DAOEtudiant() {
		super();
	}
   
	{
   try {
  	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
   }
	
	public ArrayList<Etudiant> selectEtudiantsParElem(String nomElement){
		Etudiant etud;
        try {
	    	  String req="SELECT etudiant.cne , nom_etudiant , prenom_etudiant FROM etudie , element , etudiant WHERE element.code_elem=etudie.code_elem and etudie.cne=etudiant.cne and element.nom_elem=?";
 			  PreparedStatement prepStatem=connection.prepareStatement(req);
		      prepStatem.setString(1,nomElement);
		      ResultSet res=prepStatem.executeQuery();
		  while(res.next()) {
			  etud=new Etudiant(res.getInt("etudiant.cne"),res.getString("nom_etudiant"),res.getString("prenom_etudiant"));
			  listElem.add(etud);
		  }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        return listElem;
	}
}
