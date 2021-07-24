package com.forensic_system.fms.api;

public class Registration {
	
	private int id;
	private int u_id;
	private String user;
	private String f_name;
	private String l_name;
	private String dob;
	private String gender;
	private String mail;
	private String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", u_id=" + u_id + ", user=" + user + ", f_name=" + f_name + ", l_name="
				+ l_name + ", dob=" + dob + ", gender=" + gender + ", mail=" + mail + ", pwd=" + pwd + "]";
	}
	
	
	
}
