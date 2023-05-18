package Metier;

public class ModuleElem {
   private String nomElem;
   private int coefficient;
    public ModuleElem() {
		super();
	}
	public ModuleElem(String nomElem, int coefficient) {
		super();
		this.nomElem = nomElem;
		this.coefficient = coefficient;
	}
	public String getNomElem() {
		return nomElem;
	}
	public void setNomElem(String nomElem) {
		this.nomElem = nomElem;
	}
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
    
}
