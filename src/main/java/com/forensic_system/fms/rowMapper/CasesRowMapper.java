package com.forensic_system.fms.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.forensic_system.fms.api.Cases;

public class CasesRowMapper implements RowMapper<Cases> {

	@Override
	public Cases mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Cases cs = new Cases();
		
		cs.setC_id(rs.getInt("c_id")); 
		cs.setCase_name(rs.getString("case_name")); 
		cs.setC_name(rs.getString("c_name")); 
		cs.setPlace(rs.getString("place")); 
		cs.setDat(rs.getString("dat")); 
		cs.setDes(rs.getString("des")); 
		cs.setEvidence(rs.getString("evidence")); 
		cs.setSusp_name(rs.getString("susp_name")); 
		cs.setOffi_name(rs.getString("offi_name")); 
		cs.setC_d(rs.getString("c_d")); 
		cs.setStatus(rs.getString("status"));
		
		return cs;
	}


	

}
