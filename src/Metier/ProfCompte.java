package Metier;

public class ProfCompte {
  private int codeProf;
  private String username;
  private String password;
  public ProfCompte() {
	super();
}
public ProfCompte(int codeProf, String username, String password) {
	super();
	this.codeProf = codeProf;
	this.username = username;
	this.password = password;
}
public int getCodeProf() {
	return codeProf;
}
public void setCodeProf(int codeProf) {
	this.codeProf = codeProf;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
}
