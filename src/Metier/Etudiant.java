package Metier;

public class Etudiant {
     private int cne;
     private String nomEtud;
     private String prenomEtud;
     private int telephone;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(int cne, String nomEtud, String prenomEtud) {
		super();
		this.cne = cne;
		this.nomEtud = nomEtud;
		this.prenomEtud = prenomEtud;
	}
	public int getCne() {
		return cne;
	}
	public void setCne(int cne) {
		this.cne = cne;
	}
	public String getNomEtud() {
		return nomEtud;
	}
	public void setNomEtud(String nomEtud) {
		this.nomEtud = nomEtud;
	}
	public String getPrenomEtud() {
		return prenomEtud;
	}
	public void setPrenomEtud(String prenomEtud) {
		this.prenomEtud = prenomEtud;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
     
}
