package com.forensic_system.fms.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.forensic_system.fms.api.UserInfo;

public class UserInfoRowMapper implements RowMapper<UserInfo> {

	@Override
	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserInfo ui = new UserInfo();
		
		ui.setEmail(rs.getString("mail")); 
		ui.setPassword(rs.getString("password")); 
		return ui;
	}

}
