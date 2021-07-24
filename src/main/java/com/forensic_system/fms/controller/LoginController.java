package com.forensic_system.fms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.forensic_system.fms.api.GeneralUser;
import com.forensic_system.fms.api.Guest;
import com.forensic_system.fms.api.Officer;
import com.forensic_system.fms.api.Registration;
import com.forensic_system.fms.api.Supervisor;
import com.forensic_system.fms.api.UserInfo;
import com.forensic_system.fms.service.RegistrationService;

@Controller
public class LoginController {

	@Autowired
	private RegistrationService regService;

	/*
	 * @RequestMapping(value = "/log", method = RequestMethod.GET) public
	 * ModelAndView showLogin(HttpServletRequest request, HttpServletResponse
	 * response){
	 * 
	 * ModelAndView mav = new ModelAndView("userInfo"); mav.addObject("userInfo",
	 * new UserInfo());
	 * 
	 * return mav; }
	 */
	@RequestMapping(value = "/logProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("userInfo") UserInfo userInfo) {
		ModelAndView mav= null;
		String s1=userInfo.getUtype();
		if(s1.contentEquals("Admin")){
		Registration registration = regService.validateUser(userInfo);
		if(null != registration) {
			mav = new ModelAndView("adminDash");
			mav.addObject("firstname",registration.getF_name());
		}
		else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Mail Or Password Is Wrong..!");
		}
		}
		
		
		if(s1.contentEquals("Supervisor")){
		Supervisor supervisor = regService.validateSuper(userInfo);
		if(null != supervisor) {
			mav = new ModelAndView("supervisorDash");
			mav.addObject("firstname",supervisor.getF_name());
		}
		else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Mail Or Password Is Wrong..!");
		}
		}
		
		
		if(s1.contentEquals("Officer")){
			Officer officer = regService.validateOfficer(userInfo);
			if(null != officer) {
				mav = new ModelAndView("officerDash");
				mav.addObject("firstname",officer.getF_name());
			}
			else {
				mav = new ModelAndView("login");
				mav.addObject("message", "Mail Or Password Is Wrong..!");
			}
			}
		
		
		
		if(s1.contentEquals("Guest")){
			Guest guest = regService.validateGuest(userInfo);
			if(null != guest) {
				mav = new ModelAndView("guestDash");
				mav.addObject("firstname",guest.getF_name());
			}
			else {
				mav = new ModelAndView("login");
				mav.addObject("message", "Mail Or Password Is Wrong..!");
			}
			}
		
		
		if(s1.contentEquals("General_User")){
		GeneralUser generaluser = regService.validatGeneralUser(userInfo);
		if(null != generaluser) {
			mav = new ModelAndView("genraluser");
			mav.addObject("firstname",generaluser.getF_name());
		}
		else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Mail Or Password Is Wrong..!");
		}
		}
		
		
		
		/*
		 * else { mav = new ModelAndView("login"); mav.addObject("message",
		 * "User Type Is Wrong..!"); }
		 */
		
		return mav;
	}
	
	  

}
