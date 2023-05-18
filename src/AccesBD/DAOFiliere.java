package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metier.Filiere;
import Metier.Professeur;


public class DAOFiliere {
	 private ArrayList<Filiere> listFilieres =new ArrayList<Filiere>();
	 private Statement statement=null;
    ConnectionBD conn=new ConnectionBD();
    Connection connection=conn.ConnectionDb();
    
    public DAOFiliere() {
		super();
	}
	{
    try {
   	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
    }
    
 	public ArrayList<Filiere>  selectAll() {
 		Filiere filiere ;
		try {
			String req="SELECT code_fil , nom_fil FROM `filiere`";
			ResultSet res=statement.executeQuery(req);
			while(res.next()) {
				filiere=new Filiere(res.getInt("code_fil"), res.getString("nom_fil"));
				listFilieres.add(filiere);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listFilieres;
	}

  	public ArrayList<String>  selectModParFili(Filiere fil) {
          ArrayList<String > listeModFil =new ArrayList<String>();
			  try {
	  	    	  String req="select nom_mod from filiere , module where filiere.code_fil=module.code_fil and filiere.code_fil=?";
	   			  PreparedStatement prepStatem=connection.prepareStatement(req);
			  prepStatem.setInt(1, fil.getCodeFil());
 			  ResultSet res=prepStatem.executeQuery();
 			  while(res.next()) {
 				 listeModFil.add(res.getString("nom_mod"));
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   

	return listeModFil;
}
}
