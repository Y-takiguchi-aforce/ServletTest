package jp.co.aforce.beans;

public class Pinfo implements java.io.Serializable {
	
	private String id;
	private String pw;
	private String user;
	
	public String getId() {
		return id;
	}
	
	public String getPw(){
		return pw;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	
}
