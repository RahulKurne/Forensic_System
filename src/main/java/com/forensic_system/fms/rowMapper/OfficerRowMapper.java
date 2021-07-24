package com.forensic_system.fms.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.forensic_system.fms.api.Officer;

public class OfficerRowMapper implements RowMapper<Officer> {

	@Override
	public Officer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Officer of = new Officer();
		
		of.setOffi_id(rs.getInt("offi_id"));
		of.setF_name(rs.getString("f_name"));
		of.setL_name(rs.getString("l_name"));
		of.setMail(rs.getString("mail")); 
		of.setPwd(rs.getString("pwd"));
		of.setDob(rs.getString("dob")); 
		of.setGender(rs.getString("gender")); 
		of.setC_add(rs.getString("c_add")); 
		of.setP_add(rs.getString("P_add")); 
		of.setCity(rs.getString("city")); 
		of.setZip(rs.getString("zip")); 
		of.setDoj(rs.getString("doj"));
		return of;
	}

}
