package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metier.ProfCompte;
import Metier.Professeur;




public class DAOProfesseur {
	 private ArrayList<Professeur> listProfesseur =new ArrayList<Professeur>();
	 private ArrayList<ProfCompte> listProfCompte =new ArrayList<ProfCompte>();
	 private Statement statement=null;
     ConnectionBD conn=new ConnectionBD();
     Connection connection=conn.ConnectionDb();
     
     public DAOProfesseur() {
		super();
	}
     
	{
     try {
    	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
     }
     
  	public ArrayList<Professeur> selectAllProf(){
  		Professeur professeur ;
 		try {
 			String req="select * from professeur";
 			ResultSet res=statement.executeQuery(req);
 			while(res.next()) {
 				professeur=new Professeur(res.getInt("code_prof"), res.getString("nom_prof"), res.getString("prenom_prof"), res.getString("specialite"),res.getInt("telephone"),res.getString("username"));
 				listProfesseur.add(professeur);
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listProfesseur;
  		
  	}
  	public int selectprof(String nomProf,String prenomProf) {
  		Professeur professeur=new Professeur() ;
		try {
 			String req="SELECT * FROM professeur WHERE professeur.nom_prof = ? and professeur.prenom_prof=?";
 			PreparedStatement preparStat=connection.prepareStatement(req);
 			preparStat.setString(1, nomProf);
 			preparStat.setString(2, prenomProf);
 			ResultSet res=preparStat.executeQuery();
 			while(res.next()) {
 				professeur=new Professeur(res.getInt("code_prof"), res.getString("nom_prof"), res.getString("prenom_prof"), res.getString("specialite"),res.getInt("telephone"),res.getString("username"));
 
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	return professeur.getCodeProf();
  	}
  	public ArrayList<ProfCompte> selectAllProfCompte(){
  		ProfCompte professeur ;
 		try {
 			String req="select code_prof, professeur.username , password from professeur , compte where professeur.username = compte.username";
 			ResultSet res=statement.executeQuery(req);
 			while(res.next()) {
 				professeur=new ProfCompte(res.getInt("code_prof"), res.getString("professeur.username"), res.getString("password"));
 				listProfCompte.add(professeur);
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listProfCompte;
  		
  	}

//  	{
//  		conn.closeConnection();
//  	}
}
