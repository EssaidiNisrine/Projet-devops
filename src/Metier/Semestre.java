package Metier;

public class Semestre {
  private int codeSeme;
  private String nomSem;
public Semestre() {
	super();
	// TODO Auto-generated constructor stub
}
public Semestre(int codeSeme, String nomSem) {
	super();
	this.codeSeme = codeSeme;
	this.nomSem = nomSem;
}
public int getCodeSeme() {
	return codeSeme;
}
public void setCodeSeme(int codeSeme) {
	this.codeSeme = codeSeme;
}
public String getNomSem() {
	return nomSem;
}
public void setNomSem(String nomSem) {
	this.nomSem = nomSem;
}

}

