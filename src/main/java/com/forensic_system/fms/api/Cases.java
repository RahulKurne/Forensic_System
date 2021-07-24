package com.forensic_system.fms.api;

public class Cases {
	
	private int c_id;
	private String case_name;
	private String c_name;
	private String place;
	private String dat;
	private String des;
	private String evidence;
	private String susp_name;
	private String offi_name;
	private String c_d;
	private String status;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getCase_name() {
		return case_name;
	}
	public void setCase_name(String case_name) {
		this.case_name = case_name;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDat() {
		return dat;
	}
	public void setDat(String dat) {
		this.dat = dat;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public String getSusp_name() {
		return susp_name;
	}
	public void setSusp_name(String susp_name) {
		this.susp_name = susp_name;
	}
	public String getOffi_name() {
		return offi_name;
	}
	public void setOffi_name(String offi_name) {
		this.offi_name = offi_name;
	}
	public String getC_d() {
		return c_d;
	}
	public void setC_d(String c_d) {
		this.c_d = c_d;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Cases [c_id=" + c_id + ", case_name=" + case_name + ", c_name=" + c_name + ", place=" + place + ", dat="
				+ dat + ", des=" + des + ", evidence=" + evidence + ", susp_name=" + susp_name + ", offi_name="
				+ offi_name + ", c_d=" + c_d + ", status=" + status + "]";
	}


}
