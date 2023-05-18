package Metier;

public class EtudiantElem {
	 private int code;
     private String nomEtud;
     private String prenomEtud;
     private float note;
     private boolean isValide;
     private boolean isAbsent;
     public EtudiantElem() {
		super();
	}
	public EtudiantElem(int code ,String nomEtud, String prenomEtud, float note, boolean isValide, boolean isAbsent) {
		super();
		this.code=code;
		this.nomEtud = nomEtud;
		this.prenomEtud = prenomEtud;
		this.note = note;
		this.isValide = isValide;
		this.isAbsent = isAbsent;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public boolean isValide() {
		return isValide;
	}
	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}
	public boolean isAbsent() {
		return isAbsent;
	}
	public void setAbsent(boolean isAbsent) {
		this.isAbsent = isAbsent;
	}
     
}
