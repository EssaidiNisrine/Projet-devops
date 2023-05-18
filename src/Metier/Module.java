package Metier;
public class Module {
  private int codeMod;
  private String nomMod;
  private int codeFil;
  private int codeSem;
public Module() {
	super();
	// TODO Auto-generated constructor stub
}
public Module(int codeMod, String nomMod, int codeFil, int codeSem) {
	super();
	this.codeMod = codeMod;
	this.nomMod = nomMod;
	this.codeFil = codeFil;
	this.codeSem = codeSem;
}
public int getCodeMod() {
	return codeMod;
}
public void setCodeMod(int codeMod) {
	this.codeMod = codeMod;
}
public String getNomMod() {
	return nomMod;
}
public void setNomMod(String nomMod) {
	this.nomMod = nomMod;
}
public int getCodeFil() {
	return codeFil;
}
public void setCodeFil(int codeFil) {
	this.codeFil = codeFil;
}
public int getCodeSem() {
	return codeSem;
}
public void setCodeSem(int codeSem) {
	this.codeSem = codeSem;
}
  
}
