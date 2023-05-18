package Metier;

public class Modalite {
   private int codeModalite;
   private String nomModalite;
   private int ccPourcentage;
   private int tpPourcentage;
   private int projetPourcentage;
public Modalite() {
	super();
	// TODO Auto-generated constructor stub
}
public Modalite(int codeModalite, String nomModalite, int ccPourcentage, int tpPourcentage, int projetPourcentage) {
	super();
	this.codeModalite = codeModalite;
	this.nomModalite = nomModalite;
	this.ccPourcentage = ccPourcentage;
	this.tpPourcentage = tpPourcentage;
	this.projetPourcentage = projetPourcentage;
}
public int getCodeModalite() {
	return codeModalite;
}
public void setCodeModalite(int codeModalite) {
	this.codeModalite = codeModalite;
}
public String getNomModalite() {
	return nomModalite;
}
public void setNomModalite(String nomModalite) {
	this.nomModalite = nomModalite;
}
public int getCcPourcentage() {
	return ccPourcentage;
}
public void setCcPourcentage(int ccPourcentage) {
	this.ccPourcentage = ccPourcentage;
}
public int getTpPourcentage() {
	return tpPourcentage;
}
public void setTpPourcentage(int tpPourcentage) {
	this.tpPourcentage = tpPourcentage;
}
public int getProjetPourcentage() {
	return projetPourcentage;
}
public void setProjetPourcentage(int projetPourcentage) {
	this.projetPourcentage = projetPourcentage;
}
   
}
