package AccesBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Metier.Administrateur;

public class DAOAdministrateur {
    ConnectionBD conn=new ConnectionBD();
    Connection connection=conn.ConnectionDb();
    private Statement statement=null;
    public DAOAdministrateur() {
		super();
	}
    
	{
    try {
   	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
    }
	public Administrateur getAdmin() {
		Administrateur admin=null ;
		try {
			String req="select * FROM `administrateur`";
			ResultSet res=statement.executeQuery(req);
			while(res.next()) {
				admin=new Administrateur(res.getInt("code_admin"), res.getString("nom_admin"),res.getString("prenom_admin"),res.getString("USERNAME"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return admin;
		
	}
}
