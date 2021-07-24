package com.forensic_system.fms.api;

public class Supervisor {
	
	private int super_id;
	private String f_name;
	private String l_name;
	private String mail;
	private String pwd;
	private String dob;
	private String gender;
	private String c_add;
	private String p_add;
	private String city;
	private String zip;
	private String doj;
	
	public int getSuper_id() {
		return super_id;
	}
	public void setSuper_id(int super_id) {
		this.super_id = super_id;
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
	public String getC_add() {
		return c_add;
	}
	public void setC_add(String c_add) {
		this.c_add = c_add;
	}
	public String getP_add() {
		return p_add;
	}
	public void setP_add(String p_add) {
		this.p_add = p_add;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Supervisor [super_id=" + super_id + ", f_name=" + f_name + ", l_name=" + l_name + ", mail=" + mail
				+ ", pwd=" + pwd + ", dob=" + dob + ", gender=" + gender + ", c_add=" + c_add + ", p_add=" + p_add
				+ ", city=" + city + ", zip=" + zip + ", doj=" + doj + "]";
	}
	

}
