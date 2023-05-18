package AccesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metier.Filiere;
import Metier.Module;
import Metier.ModuleElem;

public class DAOModule {
	 private ArrayList<Module> listModules =new ArrayList<Module>();
	 private Statement statement=null;
   ConnectionBD conn=new ConnectionBD();
   Connection connection=conn.ConnectionDb();
   
   public DAOModule() {
		super();
	}
	{
   try {
  	 statement=connection.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
   }
 	public ArrayList<Module>  selectAll() {
 		Module module ;
		try {
			String req="SELECT * FROM `module`";
			ResultSet res=statement.executeQuery(req);
			while(res.next()) {
				module=new Module(res.getInt("code_mod"), res.getString("nom_mod"),res.getInt("code_sem"), res.getInt("code_fil"));
				listModules.add(module);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listModules;
	}
  	public ArrayList<ModuleElem>  selectElemModule(Module mod) {
  		ModuleElem Elem;
        ArrayList<ModuleElem > listeModFil =new ArrayList<ModuleElem>();
			  try {
	  	    	  String req="select nom_elem , coefficient from element , module where element.code_mod=module.code_mod and module.code_mod=?";
	   			  PreparedStatement prepStatem=connection.prepareStatement(req);
			      prepStatem.setInt(1, mod.getCodeMod());
			      ResultSet res=prepStatem.executeQuery();
			  while(res.next()) {
				 Elem=new ModuleElem(res.getString("nom_elem"),res.getInt("coefficient"));
				 listeModFil.add(Elem);
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   

	return listeModFil;
}

}
