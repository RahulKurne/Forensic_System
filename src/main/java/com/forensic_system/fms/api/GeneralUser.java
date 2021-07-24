package com.forensic_system.fms.api;

public class GeneralUser {
	
	private int u_id;
	private int user;
	private String f_name;
	private String l_name;
	private String dob;
	private String gender;
	private String mail;
	private String pwd;
	private String doj;
	public int getu_id() {
		return u_id;
	}
	public void setu_id(int u_id) {
		this.u_id = u_id;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
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
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "GeneralUser [u_id=" + u_id + ", user=" + user + ", f_name=" + f_name + ", l_name=" + l_name + ", dob="
				+ dob + ", gender=" + gender + ", mail=" + mail + ", pwd=" + pwd + ", doj=" + doj + "]";
	}

}
