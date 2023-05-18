package Metier;

public class AppartenanceFilElem {
	   private Element eleme;
	   private Filiere fil;
	public AppartenanceFilElem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppartenanceFilElem(Element eleme, Filiere fil) {
		super();
		this.eleme = eleme;
		this.fil = fil;
	}
	public Element getEleme() {
		return eleme;
	}
	public void setEleme(Element eleme) {
		this.eleme = eleme;
	}
	public Filiere getFil() {
		return fil;
	}
	public void setFil(Filiere fil) {
		this.fil = fil;
	}
	   
}
