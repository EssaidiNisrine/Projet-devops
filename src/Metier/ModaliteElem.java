package Metier;

public class ModaliteElem {
  private String nomModalite;
  private int pourcentage;
  public ModaliteElem() {
	super();
}
public ModaliteElem(String nomModalite, int pourcentage) {
	super();
	this.nomModalite = nomModalite;
	this.pourcentage = pourcentage;
}

public String getNomModalite() {
	return nomModalite;
}
public void setNomModalite(String nomModalite) {
	this.nomModalite = nomModalite;
}
public int getPourcentage() {
	return pourcentage;
}
public void setPourcentage(int pourcentage) {
	this.pourcentage = pourcentage;
}
  
}
