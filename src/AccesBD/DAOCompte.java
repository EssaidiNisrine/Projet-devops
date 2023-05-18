package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metier.Administrateur;
import Metier.Compte;
import Metier.Professeur;

public class DAOCompte {
	 private ArrayList<Compte> listCompte =new ArrayList<Compte>();
	 private Statement statement=null;
     ConnectionBD conn=new ConnectionBD();
     Connection connection=conn.ConnectionDb();
     
     public DAOCompte() {
		super();
	}
     
	{
     try {
    	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
     }
 	public ArrayList<Compte>  selectAll() {
 		Compte compte ;
		try {
			String req="SELECT * FROM `compte`";
			ResultSet res=statement.executeQuery(req);
			while(res.next()) {
				compte=new Compte(res.getString("username"), res.getString("password"));
				listCompte.add(compte);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listCompte;
	}
 	public void ajouterCompte(String username,String password) {
 		String req="INSERT INTO `compte`(`username`, `password`) VALUES ('"+username+"','"+password +"')";
 		try {
			int rt=statement.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	public void modificationCompte(String username,String password,String N_username,String N_password) {
 		String req="UPDATE `compte` SET `username`='"+N_username+"',`password`='"+N_password+"' WHERE username='"+username+"' and password='"+password+"'";
 		try {
			int i=statement.executeUpdate(req);
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	public void supprimerCompte(String username) {
 		String req="DELETE FROM compte WHERE username='"+username+"'";
 		try {
			int i=statement.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	public Compte selectCompteAdmin(Administrateur admin) {
 		Compte compteAdmin=null;
		try {
 			String req="SELECT * FROM `compte` WHERE username = ? ";
 			PreparedStatement preparStat=connection.prepareStatement(req);
 			preparStat.setString(1, admin.getUserName());
 			ResultSet res=preparStat.executeQuery();
 			while(res.next()) {
 				compteAdmin=new Compte(res.getString("username"), res.getString("password"));
 
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
 		return compteAdmin;
 	}
	
}
