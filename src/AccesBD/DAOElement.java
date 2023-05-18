package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metier.Element;
import Metier.Professeur;

public class DAOElement {
	 private ArrayList<Element> listElem =new ArrayList<Element>();
	 private Statement statement=null;
     ConnectionBD conn=new ConnectionBD();
     Connection connection=conn.ConnectionDb();
    
    public DAOElement() {
		super();
	}
    
	{
    try {
   	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
    }
    
 	public ArrayList<Element>  selectAll() {
 		Element element ;
		try {
			ResultSet res=statement.executeQuery("select * from element");
			while(res.next()) {
				if(res.getInt("isvalid")==0) {
					element=new Element(res.getInt("code_elem"), res.getString("nom_elem"), res.getInt("code_mod"), res.getInt("coefficient"),false);
					listElem.add(element);	
				}
				else {
					element=new Element(res.getInt("code_elem"), res.getString("nom_elem"), res.getInt("code_mod"), res.getInt("coefficient"),true);
					listElem.add(element);			
				}
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listElem;
	}
  	public int selectElem(String nomElem) {
  		Element element=new Element() ;
		try {
 			String req="SELECT * FROM `element` WHERE element.nom_elem=?";
 			PreparedStatement prepStatem=connection.prepareStatement(req);
 			prepStatem.setString(1, nomElem);
 			ResultSet res=prepStatem.executeQuery();
 			while(res.next()) {
				if(res.getInt("isvalid")==0) {
					element=new Element(res.getInt("code_elem"), res.getString("nom_elem"), res.getInt("code_mod"), res.getInt("coefficient"),false);
				}
				else {
					element=new Element(res.getInt("code_elem"), res.getString("nom_elem"), res.getInt("code_mod"), res.getInt("coefficient"),true);		
				}
			
			}
 			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element.getCodeElem();
  	}
  	public boolean selectElm(String nomElem) {
  		Element element=new Element() ;
		try {
 			String req="SELECT * FROM `element` WHERE element.nom_elem=?";
 			PreparedStatement prepStatem=connection.prepareStatement(req);
 			prepStatem.setString(1, nomElem);
 			ResultSet res=prepStatem.executeQuery();
 			while(res.next()) {
				if(res.getInt("isvalid")==0) {
					element=new Element(res.getInt("code_elem"), res.getString("nom_elem"), res.getInt("code_mod"), res.getInt("coefficient"),false);
				}
				else {
					element=new Element(res.getInt("code_elem"), res.getString("nom_elem"), res.getInt("code_mod"), res.getInt("coefficient"),true);		
				}
			
			}
 			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element.isValide();
  	}
  	public void updateVelem(String nomElem) {
		try {
 			String req="UPDATE `element` SET `isvalid`=? WHERE element.nom_elem=?";
 			PreparedStatement prepStatem=connection.prepareStatement(req);
 			prepStatem.setInt(1, 1);
 			prepStatem.setString(2, nomElem);
 			int res=prepStatem.executeUpdate();
 			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
  	}
  	public void updateVelem(int codeElem) {
		try {
 			String req="UPDATE `element` SET `isvalid`=? WHERE element.code_elem=?";
 			PreparedStatement prepStatem=connection.prepareStatement(req);
 			prepStatem.setInt(1, 1);
 			prepStatem.setInt(2, codeElem);
 			int res=prepStatem.executeUpdate();
 			
		} catch (Exception e) {
			// TODO: handle exception
		}

  	}
}
