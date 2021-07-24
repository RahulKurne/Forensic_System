package com.forensic_system.fms.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.forensic_system.fms.api.Guest;

public class GuestRowMapper implements RowMapper<Guest> {

	@Override
	public Guest mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Guest gst = new Guest();
		
		gst.setG_id(rs.getInt("g_id"));
		gst.setF_name(rs.getString("f_name"));
		gst.setL_name(rs.getString("l_name"));
		gst.setMail(rs.getString("mail")); 
		gst.setPwd(rs.getString("pwd"));
		gst.setDob(rs.getString("dob")); 
	    gst.setGender(rs.getString("gender")); 
		gst.setC_add(rs.getString("c_add")); 
		gst.setP_add(rs.getString("P_add")); 
		gst.setCity(rs.getString("city")); 
		gst.setZip(rs.getString("zip")); 
		gst.setDoj(rs.getString("doj"));
		
		return gst;
	}
	
	

}
