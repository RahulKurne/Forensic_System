package com.forensic_system.fms.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.forensic_system.fms.api.Registration;

public class RegistrationRowMapper implements RowMapper<Registration> {

	@Override
	public Registration mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Registration reg = new Registration();
		
		reg.setId(rs.getInt("id"));
		reg.setF_name(rs.getString("f_name"));
		reg.setL_name(rs.getString("l_name"));
		reg.setDob(rs.getString("dob"));
		reg.setMail(rs.getString("mail"));
		reg.setPwd(rs.getString("pwd"));
		
		return reg;
	}


}
