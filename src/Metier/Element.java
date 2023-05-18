package Metier;

public class Element {
    private int codeElem;
    private String nomElem;
    private int codeMod;
    private int coefficient;
    private boolean isValide;
	public Element() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Element(int codeElem, String nomElem, int codeMod, int coefficient,boolean isValide) {
		super();
		this.codeElem = codeElem;
		this.nomElem = nomElem;
		this.codeMod = codeMod;
		this.coefficient = coefficient;
		this.isValide=isValide;
	}
	public boolean isValide() {
		return isValide;
	}
	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}
	public int getCodeElem() {
		return codeElem;
	}
	public void setCodeElem(int codeElem) {
		this.codeElem = codeElem;
	}
	public String getNomElem() {
		return nomElem;
	}
	public void setNomElem(String nomElem) {
		this.nomElem = nomElem;
	}
	public int getCodeMod() {
		return codeMod;
	}
	public void setCodeMod(int codeMod) {
		this.codeMod = codeMod;
	}
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
    
    
}
