package com.forensic_system.fms.DAO;

import java.util.List;

import com.forensic_system.fms.api.Cases;
import com.forensic_system.fms.api.GeneralUser;
import com.forensic_system.fms.api.Guest;
import com.forensic_system.fms.api.Officer;
import com.forensic_system.fms.api.Registration;
import com.forensic_system.fms.api.Supervisor;
import com.forensic_system.fms.api.UserInfo;

public interface RegistrationDAO {

	List<Registration> loadRigistration();
	
	List<Supervisor> loadSupervisor();
	
	List<Officer> loadOfficer();
	
	List<Guest> loadGuest();
	
	List<Cases> loadCases();
	
	List<GeneralUser> loadGeneralUser();
	
	List<Cases> loadoldCases();
	
	List<Cases> loadAdminCases(); 
	
	
	void saveRegistration(Registration registration);

	void addOfficer(Officer officer);

	void addSupervisor(Supervisor supervisor);

	void addGuest(Guest guest);

	void createCase(Cases cases);
	
	void saveGeneralUser(Registration registration);
	
	
	Registration validateUser(UserInfo userInfo);
	
	Supervisor validateSuper(UserInfo userInfo);
	
	Officer validateOfficer(UserInfo userInfo);
	
	Guest validateGuest(UserInfo userInfo);
	
	GeneralUser validateGeneralUser(UserInfo userInfo);
	
	
	
	void deleteOffi(int offi_id);

	void deleteSuper(int super_id);

	void deleteGuest(int g_id);

	
	
	

	Supervisor getdata(int super_id);

	int saveSuperUpdate(Supervisor supervisor);

	Cases getCasedata(int c_id);

	

	
	

}
