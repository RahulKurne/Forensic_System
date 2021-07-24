package com.forensic_system.fms.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.forensic_system.fms.api.Cases;
import com.forensic_system.fms.api.GeneralUser;
import com.forensic_system.fms.api.Guest;
import com.forensic_system.fms.api.Officer;
import com.forensic_system.fms.api.Registration;
import com.forensic_system.fms.api.Supervisor;
import com.forensic_system.fms.api.UserInfo;
import com.forensic_system.fms.rowMapper.CasesRowMapper;
import com.forensic_system.fms.rowMapper.GeneralUserRowMapper;
import com.forensic_system.fms.rowMapper.GuestRowMapper;
import com.forensic_system.fms.rowMapper.OfficerRowMapper;
import com.forensic_system.fms.rowMapper.RegistrationRowMapper;
import com.forensic_system.fms.rowMapper.SupervisorRowMapper;
import com.forensic_system.fms.rowMapper.UserInfoRowMapper;

@Repository
public class RegistrationDAOImpli implements RegistrationDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*--------------------------- Login Page ----------------------------------*/
	@Override
	public Registration validateUser(UserInfo userInfo) {
		String sql = "select * from registration where mail='" + userInfo.getEmail() + "' and pwd='"
				+ userInfo.getPassword() + "'";

		List<Registration> theListOfUser = jdbcTemplate.query(sql, new RegistrationRowMapper());

		return theListOfUser.size() > 0 ? theListOfUser.get(0) : null;
	}

	@Override
	public Supervisor validateSuper(UserInfo userInfo) {

		String sql = "select * from supervisor where mail='" + userInfo.getEmail() + "' and pwd='"
				+ userInfo.getPassword() + "'";

		List<Supervisor> theListOfSuper = jdbcTemplate.query(sql, new SupervisorRowMapper());

		return theListOfSuper.size() > 0 ? theListOfSuper.get(0) : null;
	}

	@Override
	public Officer validateOfficer(UserInfo userInfo) {

		String sql = "select * from officer where mail='" + userInfo.getEmail() + "' and pwd='" + userInfo.getPassword()
				+ "'";

		List<Officer> theListOfOfficer = jdbcTemplate.query(sql, new OfficerRowMapper());
		return theListOfOfficer.size() > 0 ? theListOfOfficer.get(0) : null;
	}

	@Override
	public Guest validateGuest(UserInfo userInfo) {

		String sql = "select * from guest where mail='" + userInfo.getEmail() + "' and pwd='" + userInfo.getPassword()
				+ "'";

		List<Guest> theListOfGuest = jdbcTemplate.query(sql, new GuestRowMapper());
		return theListOfGuest.size() > 0 ? theListOfGuest.get(0) : null;
	}

	@Override
	public GeneralUser validateGeneralUser(UserInfo userInfo) {

		String sql = "select * from general_user where mail='" + userInfo.getEmail() + "' and pwd='"
				+ userInfo.getPassword() + "'";

		List<GeneralUser> theListOfGeneralUser = jdbcTemplate.query(sql, new GeneralUserRowMapper());
		return theListOfGeneralUser.size() > 0 ? theListOfGeneralUser.get(0) : null;
	}

	/*--------------------------- Registration Pages--------------------------------- */

	@Override
	public void saveRegistration(Registration registration) {
		Object[] sqlParameters = { registration.getF_name(), registration.getL_name(), registration.getDob(),
				registration.getGender(), registration.getMail(), registration.getPwd() };

		String sql = "Insert into registration (f_name,l_name,dob,gender,mail,pwd) values(?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);
	}

	@Override
	public List<Registration> loadRigistration() {

		List<Registration> registrationList = new ArrayList<Registration>();

		String sql = "SELECT * FROM registration";

		List<Registration> theListOfRegistration = jdbcTemplate.query(sql, new RegistrationRowMapper());

		registrationList = theListOfRegistration;
		return registrationList;
	}

	/* ------------------General User Pages --------------------------- */

	@Override
	public void saveGeneralUser(Registration registration) {
		Object[] sqlParameters = { registration.getF_name(), registration.getL_name(), registration.getDob(),
				registration.getGender(), registration.getMail(), registration.getPwd() };

		String sql = "Insert into general_user (f_name,l_name,dob,gender,mail,pwd) values(?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParameters);

	}

	@Override
	public List<GeneralUser> loadGeneralUser() {

		List<GeneralUser> generalUserList = new ArrayList<GeneralUser>();

		String sql = "SELECT * FROM general_user";

		List<GeneralUser> theListOfGeneralUser = jdbcTemplate.query(sql, new GeneralUserRowMapper());

		generalUserList = theListOfGeneralUser;
		return generalUserList;
	}

	/*--------------------------- Admin Pages--------------------------------- */

	@Override
	public void addOfficer(Officer officer) {
		Object[] sqlAddOffi = { officer.getF_name(), officer.getL_name(), officer.getMail(), officer.getPwd(),
				officer.getDob(), officer.getGender(), officer.getC_add(), officer.getP_add(), officer.getCity(),
				officer.getZip() };

		String sql = "Insert into officer (f_name,l_name,mail,pwd,dob,gender,c_add,p_add,city,zip) values (?,?,?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlAddOffi);
	}

	@Override
	public void addSupervisor(Supervisor supervisor) {

		Object[] sqlAddSuper = { supervisor.getF_name(), supervisor.getL_name(), supervisor.getMail(),
				supervisor.getPwd(), supervisor.getDob(), supervisor.getGender(), supervisor.getC_add(),
				supervisor.getP_add(), supervisor.getCity(), supervisor.getZip() };

		String sql = "Insert into supervisor (f_name,l_name,mail,pwd,dob,gender,c_add,p_add,city,zip) values (?,?,?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlAddSuper);
	}

	@Override
	public void addGuest(Guest guest) {
		Object[] sqlAddGuest = { guest.getF_name(), guest.getL_name(), guest.getMail(), guest.getPwd(), guest.getDob(),
				guest.getGender(), guest.getC_add(), guest.getP_add(), guest.getCity(), guest.getZip() };

		String sql = "Insert into guest (f_name,l_name,mail,pwd,dob,gender,c_add,p_add,city,zip) values (?,?,?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlAddGuest);

	}

	@Override
	public void deleteOffi(int offi_id) {

		String sql = "delete from officer where offi_id=" + offi_id;
		jdbcTemplate.update(sql);
	}

	@Override
	public void deleteSuper(int super_id) {

		String sql = "delete from supervisor where super_id=" + super_id;
		jdbcTemplate.update(sql);

	}

	@Override
	public void deleteGuest(int g_id) {

		String sql = "delete from guest where g_id=" + g_id;
		jdbcTemplate.update(sql);

	}

	@Override
	public Supervisor getdata(int super_id) {
		String sql = "select * from supervisor where super_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { super_id },
				new BeanPropertyRowMapper<Supervisor>(Supervisor.class));
	}

	@Override
	public int saveSuperUpdate(Supervisor supervisor) {
		String sql = "update supervisor set mail='" + supervisor.getMail() + "',pwd='" + supervisor.getPwd()
				+ "',c_add='" + supervisor.getC_add() + "',p_add='" + supervisor.getP_add() + "' " + "where super_id="
				+ supervisor.getSuper_id() + "";
		return jdbcTemplate.update(sql);

	}

	/*--------------------------------- Officer Pages -------------------------------------*/

	@Override
	public void createCase(Cases cases) {
		Object[] sqlCreateCase = { cases.getCase_name(), cases.getC_name(), cases.getPlace(), cases.getDat(),
				cases.getDes(), cases.getEvidence(), cases.getSusp_name(), cases.getOffi_name() };

		String sql = "Insert into cases (case_name,c_name,place,dat,des,evidence,susp_name,offi_name,status) values (?,?,?,?,?,?,?,?,'Active')";

		jdbcTemplate.update(sql, sqlCreateCase);
	}

	@Override
	public Cases getCasedata(int c_id) {
		String sql = "select * from cases where c_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { c_id }, new BeanPropertyRowMapper<Cases>(Cases.class));
	}

	/*------------------Data fetching from database------------------------------------ */

	@Override
	public List<Supervisor> loadSupervisor() {

		List<Supervisor> superList = new ArrayList<Supervisor>();

		String sql = "SELECT * FROM supervisor";

		List<Supervisor> theListOfSupervisor = jdbcTemplate.query(sql, new SupervisorRowMapper());

		superList = theListOfSupervisor;
		return superList;
	}

	@Override
	public List<Officer> loadOfficer() {

		List<Officer> offiList = new ArrayList<Officer>();

		String sql = "SELECT * FROM officer";

		List<Officer> theListOfOfficer = jdbcTemplate.query(sql, new OfficerRowMapper());

		offiList = theListOfOfficer;

		return offiList;
	}

	@Override
	public List<Guest> loadGuest() {

		List<Guest> guestList = new ArrayList<Guest>();

		String sql = "SELECT * FROM guest";

		List<Guest> theListOfGuest = jdbcTemplate.query(sql, new GuestRowMapper());

		guestList = theListOfGuest;

		return guestList;
	}

	@Override
	public List<Cases> loadCases() {

		List<Cases> caseList = new ArrayList<Cases>();

		String sql = "SELECT * FROM cases";

		List<Cases> theListOfCases = jdbcTemplate.query(sql, new CasesRowMapper());

		caseList = theListOfCases;

		return caseList;
	}

	@Override
	public List<Cases> loadoldCases() {

		List<Cases> OcaseList = new ArrayList<Cases>();

		String sql = "SELECT * FROM cases where status='Active'";

		List<Cases> theListOfoldCases = jdbcTemplate.query(sql, new CasesRowMapper());

		OcaseList = theListOfoldCases;

		return OcaseList;
	}

	@Override
	public List<Cases> loadAdminCases() {
		List<Cases> admincaseList = new ArrayList<Cases>();

		String sql = "SELECT * FROM cases";

		List<Cases> theListOfACases = jdbcTemplate.query(sql, new CasesRowMapper());

		admincaseList = theListOfACases;

		return admincaseList;
	}

}
