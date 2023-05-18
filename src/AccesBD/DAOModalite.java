package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metier.Element;
import Metier.ModaliteElem;




public class DAOModalite {
	 private ArrayList<ModaliteElem> listModalite=new ArrayList<ModaliteElem>();
	 private Statement statement=null;
     ConnectionBD conn=new ConnectionBD();
     Connection connection=conn.ConnectionDb();
  
  public DAOModalite() {
		super();
	}
  
	{
  try {
 	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
  }
  	public ArrayList<ModaliteElem>  selectElemModule(Element  elem) {
  		ModaliteElem modalite;
        ArrayList<ModaliteElem> listeModaliteParElem=new ArrayList<ModaliteElem>();
			  try {
	  	    	  String req="select nom_modalite , pourcentage from modalite , possede where modalite.code_modalite=possede.code_modalite and possede.code_elem=?";
	   			  PreparedStatement prepStatem=connection.prepareStatement(req);
			      prepStatem.setInt(1,elem.getCodeElem());
			      ResultSet res=prepStatem.executeQuery();
			  while(res.next()) {
				  modalite=new ModaliteElem(res.getString("nom_modalite"),res.getInt("pourcentage"));
				 listeModaliteParElem.add(modalite);
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   

	return listeModaliteParElem;
}
  	public ArrayList<ModaliteElem>  selectElemModule(String  nomElem) {
  		ModaliteElem modalite;
        DAOElement daoElement=new DAOElement();
  		ArrayList<ModaliteElem> listeModaliteParElem=new ArrayList<ModaliteElem>();
			int codeElem= daoElement.selectElem(nomElem);
        try {
	  	    	  String req="select nom_modalite , pourcentage from modalite , possede where modalite.code_modalite=possede.code_modalite and possede.code_elem=?";
	   			  PreparedStatement prepStatem=connection.prepareStatement(req);
			      prepStatem.setInt(1,codeElem);
			      ResultSet res=prepStatem.executeQuery();
			  while(res.next()) {
				  modalite=new ModaliteElem(res.getString("nom_modalite"),res.getInt("pourcentage"));
				 listeModaliteParElem.add(modalite);
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   

	return listeModaliteParElem;
}
}
