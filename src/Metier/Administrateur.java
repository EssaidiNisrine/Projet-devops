package Metier;

public class Administrateur {
    private int codeAdmin;
    private String userName;
    private String nomAdmin;
    private String prenomAdmin;
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Administrateur(int codeAdmin,  String nomAdmin, String prenomAdmin ,String userName) {
		super();
		this.codeAdmin = codeAdmin;
		this.userName = userName;
		this.nomAdmin = nomAdmin;
		this.prenomAdmin = prenomAdmin;
	}
	public int getCodeAdmin() {
		return codeAdmin;
	}
	public void setCodeAdmin(int codeAdmin) {
		this.codeAdmin = codeAdmin;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNomAdmin() {
		return nomAdmin;
	}
	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}
	public String getPrenomAdmin() {
		return prenomAdmin;
	}
	public void setPrenomAdmin(String prenomAdmin) {
		this.prenomAdmin = prenomAdmin;
	}
    
}
