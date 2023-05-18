package Metier;

public class Professeur {
     private int codeProf;
     private String userName;
     private String nomProf;
     private String prenomProf;
     private String specialite;
     private int telephone;
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professeur(int codeProf, String nomProf, String prenomProf, String specialite,
			int telephone,String userName) {
		super();
		this.codeProf = codeProf;
		this.nomProf = nomProf;
		this.prenomProf = prenomProf;
		this.specialite = specialite;
		this.telephone = telephone;
		this.userName = userName;
	}
	public int getCodeProf() {
		return codeProf;
	}
	public void setCodeProf(int codeProf) {
		this.codeProf = codeProf;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNomProf() {
		return nomProf;
	}
	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}
	public String getPrenomProf() {
		return prenomProf;
	}
	public void setPrenomProf(String prenomProf) {
		this.prenomProf = prenomProf;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	} 
     
}
