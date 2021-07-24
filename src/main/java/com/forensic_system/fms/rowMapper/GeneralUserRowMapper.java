package com.forensic_system.fms.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.forensic_system.fms.api.GeneralUser;


public class GeneralUserRowMapper  implements RowMapper<GeneralUser> {

	@Override
	public GeneralUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		GeneralUser gen = new GeneralUser();
		
		gen.setu_id(rs.getInt("u_id"));
		gen.setF_name(rs.getString("f_name"));
		gen.setL_name(rs.getString("l_name"));
		gen.setDob(rs.getString("dob"));
		gen.setMail(rs.getString("mail"));
		gen.setPwd(rs.getString("pwd"));
		
		return gen;
	}


}
