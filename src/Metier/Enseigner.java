package Metier;

public class Enseigner {
	private int codeProf;
	private int codeElemt;
	public Enseigner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseigner(int codeProf, int codeElemt) {
		super();
		this.codeProf = codeProf;
		this.codeElemt = codeElemt;
	}
	public int getCodeProf() {
		return codeProf;
	}
	public void setCodeProf(int codeProf) {
		this.codeProf = codeProf;
	}
	public int getCodeElemt() {
		return codeElemt;
	}
	public void setCodeElemt(int codeElemt) {
		this.codeElemt = codeElemt;
	}
	
	
}
