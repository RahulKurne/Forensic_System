package com.forensic_system.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.forensic_system.fms.DAO.RegistrationDAO;
import com.forensic_system.fms.api.Cases;
import com.forensic_system.fms.api.GeneralUser;
import com.forensic_system.fms.api.Guest;
import com.forensic_system.fms.api.Officer;
import com.forensic_system.fms.api.Registration;
import com.forensic_system.fms.api.Supervisor;
import com.forensic_system.fms.api.UserInfo;

@Service
public class RegistrationServiceImpli implements RegistrationService {

	@Autowired
	private RegistrationDAO regDao;

	/*------------------- Login Page --------------------*/

	@Override
	public Registration validateUser(UserInfo userInfo) {

		return regDao.validateUser(userInfo);
	}

	@Override
	public Supervisor validateSuper(UserInfo userInfo) {

		return regDao.validateSuper(userInfo);
	}

	@Override
	public Officer validateOfficer(UserInfo userInfo) {

		return regDao.validateOfficer(userInfo);
	}

	@Override
	public Guest validateGuest(UserInfo userInfo) {

		return regDao.validateGuest(userInfo);
	}

	@Override
	public GeneralUser validatGeneralUser(UserInfo userInfo) {
		return regDao.validateGeneralUser(userInfo);
	}

	/*-------------------------- Registrtion Pages--------------------- */

	@Override
	public void saveRegistration(Registration registration) {
		// we can also write business logic here

		regDao.saveRegistration(registration);
	}

	/*--------------------------- General User Pages----------------- */
	@Override
	public void saveGeneralUser(Registration registration) {

		regDao.saveGeneralUser(registration);

	}

	@Override
	public List<GeneralUser> loadGeneralUser() {
		List<GeneralUser> generalUserList = regDao.loadGeneralUser();

		return generalUserList;
	}

	/*--------------------------- Admin Pages--------------------------------- */
	@Override
	public void addOfficer(Officer officer) {
		// TODO Auto-generated method stub
		regDao.addOfficer(officer);
	}

	@Override
	public void addSupervisor(Supervisor supervisor) {

		regDao.addSupervisor(supervisor);
	}

	@Override
	public void addGuest(Guest guest) {

		regDao.addGuest(guest);

	}

	@Override
	public void deleteOffi(int offi_id) {

		regDao.deleteOffi(offi_id);

	}

	@Override
	public void deleteSuper(int super_id) {

		regDao.deleteSuper(super_id);
	}

	@Override
	public void deleteGuest(int g_id) {

		regDao.deleteGuest(g_id);

	}

	// -------for update Supervisor
	@Override
	public Supervisor getdata(int super_id) {

		return regDao.getdata(super_id);
	}

	@Override
	public int saveSuperUpdate(Supervisor supervisor) {
		return regDao.saveSuperUpdate(supervisor);

	}

	/*------------------------- Officer Pages------------------------- */
	@Override
	public void carateCase(Cases cases) {
		regDao.createCase(cases);

	}

	@Override
	public Cases getCasedata(int c_id) {
		return regDao.getCasedata(c_id);
	}
	/* -----------Data fetching form database via DAO classes------------ */

	@Override
	public List<Registration> loadRegistration() {

		List<Registration> registrationList = regDao.loadRigistration();

		return registrationList;
	}

	@Override
	public List<Supervisor> loadSupervisor() {

		List<Supervisor> supervisorList = regDao.loadSupervisor();

		return supervisorList;
	}

	@Override
	public List<Officer> loadOfficer() {

		List<Officer> officerList = regDao.loadOfficer();

		return officerList;
	}

	@Override
	public List<Guest> loadGuest() {

		List<Guest> guestList = regDao.loadGuest();
		return guestList;
	}

	@Override
	public List<Cases> loadCases() {

		List<Cases> caseList = regDao.loadCases();
		return caseList;
	}

	@Override
	public List<Cases> loadoldCases() {
		List<Cases> OcaseList = regDao.loadoldCases();
		return OcaseList;
	}

	@Override
	public List<Cases> loadAdminCases() {
		List<Cases> admincaseList = regDao.loadAdminCases();
		return admincaseList;
	}

}
