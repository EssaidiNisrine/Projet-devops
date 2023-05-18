package AccesBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    static Connection con=null;
    public ConnectionBD() {
		super();
	}
    public static Connection ConnectionDb() {
        String URL="jdbc:mysql://localhost:3306/dbschool";
        String login="root";
        String password="";
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        try {
			con=DriverManager.getConnection(URL, login, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
    }
    public static void closeConnection() {
  	  try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }


}
