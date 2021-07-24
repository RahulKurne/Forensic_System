package com.forensic_system.fms.api;

public class UserInfo {

	private String utype;
	private String email;
	private String password;
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [utype=" + utype + ", email=" + email + ", password=" + password + "]";
	}
	
	

	
	
}
