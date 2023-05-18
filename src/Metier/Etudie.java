package Metier;

public class Etudie {
	private int codeElem;
	private int cne;
    private float note;
    private boolean isvalide;
    private boolean isabsent;
	public Etudie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudie(int codeElem, int cne, float note, boolean isvalide, boolean isabsent) {
		super();
		this.codeElem = codeElem;
		this.cne = cne;
		this.note = note;
		this.isvalide = isvalide;
		this.isabsent = isabsent;
	}
	public int getCodeElem() {
		return codeElem;
	}
	public void setCodeElem(int codeElem) {
		this.codeElem = codeElem;
	}
	public int getCne() {
		return cne;
	}
	public void setCne(int cne) {
		this.cne = cne;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public boolean isIsvalide() {
		return isvalide;
	}
	public void setIsvalide(boolean isvalide) {
		this.isvalide = isvalide;
	}
	public boolean isIsabsent() {
		return isabsent;
	}
	public void setIsabsent(boolean isabsent) {
		this.isabsent = isabsent;
	}
    
}
