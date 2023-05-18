package Metier;

public class Filiere {
  private int codeFil;
  private String nomFil;
public Filiere() {
	super();
	// TODO Auto-generated constructor stub
}
public Filiere(int codeFil, String nomFil) {
	super();
	this.codeFil = codeFil;
	this.nomFil = nomFil;
}
public int getCodeFil() {
	return codeFil;
}
public void setCodeFil(int codeFil) {
	this.codeFil = codeFil;
}
public String getNomFil() {
	return nomFil;
}
public void setNomFil(String nomFil) {
	this.nomFil = nomFil;
}
  
}
