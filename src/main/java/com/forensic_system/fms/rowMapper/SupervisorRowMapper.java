package com.forensic_system.fms.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.forensic_system.fms.api.Supervisor;

public class SupervisorRowMapper implements RowMapper<Supervisor>{

	@Override
	public Supervisor mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Supervisor sup = new Supervisor();
		
		sup.setSuper_id(rs.getInt("super_id"));
		sup.setF_name(rs.getString("f_name"));
		sup.setL_name(rs.getString("l_name"));
		sup.setMail(rs.getString("mail")); 
		sup.setPwd(rs.getString("pwd"));
		sup.setDob(rs.getString("dob")); 
		sup.setGender(rs.getString("gender")); 
		sup.setC_add(rs.getString("c_add")); 
		sup.setP_add(rs.getString("P_add")); 
		sup.setCity(rs.getString("city")); 
		sup.setZip(rs.getString("zip")); 
		sup.setDoj(rs.getString("doj"));
		
		return sup;
	}
	
	

}
