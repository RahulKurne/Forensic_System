package com.forensic_system.fms.controller;

import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

//import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.forensic_system.fms.api.Cases;
import com.forensic_system.fms.api.Guest;
import com.forensic_system.fms.api.Officer;
import com.forensic_system.fms.api.Registration;
import com.forensic_system.fms.api.Supervisor;
//import com.forensic_system.fms.api.UserInfo;
import com.forensic_system.fms.service.RegistrationService;

/*import com.lowagie.text.pdf.codec.Base64.OutputStream;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
*/
@Controller
@SessionAttributes("userInfo")
public class RegistrationController {

	@Autowired
	private RegistrationService regService;

	/*----------------- Login Page ------------------------------ */

	/*------------------------- INDEX SIDE------------------------------ */

	@RequestMapping(value = { "/", "index" })
	public String showIndex() {
		return "index";
	}

	@RequestMapping("registration")
	public String showForm() {
		return "reg";
	}

	@RequestMapping("login")
	public String showlogin() {
		return "login";
	}

	/*--------------------------- Admin pages--------------------------- */

	/*
	 * @RequestMapping(value = "report", method = RequestMethod.GET) public void
	 * report(HttpServletResponse response) throws Exception {
	 * 
	 * response.setContentType("text/html"); List<Cases> caseList =
	 * regService.loadCases(); JRBeanCollectionDataSource dataSource = new
	 * JRBeanCollectionDataSource(caseList);
	 * 
	 * InputStream jrxmlInput = this.getClass().getResourceAsStream(
	 * "/forensic_system/URLToResourcesFolder/reports/CasesReport.jrxml");
	 * JasperDesign design = JRXmlLoader.load(jrxmlInput); JasperReport jasperReport
	 * = JasperCompileManager.compileReport(design); JasperPrint jasperPrint =
	 * JasperFillManager.fillReport(jasperReport, null, dataSource);
	 * 
	 * JRPdfExporter pdfExporter = new JRPdfExporter();
	 * pdfExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
	 * ByteArrayOutputStream pdfReportStram = new ByteArrayOutputStream();
	 * pdfExporter.setExporterOutput(new
	 * SimpleOutputStreamExporterOutput(pdfReportStram));
	 * pdfExporter.exportReport();
	 * 
	 * response.setContentType("application/pdf");
	 * response.setHeader("Content-Length", String.valueOf(((List<Cases>)
	 * pdfReportStram).size())); response.addHeader("Content-Disposition",
	 * "inline; filename=jasper.pdf;");
	 * 
	 * ServletOutputStream responseOutputStream = response.getOutputStream();
	 * responseOutputStream.write(pdfReportStram.toByteArray());
	 * responseOutputStream.close(); pdfReportStram.close(); }
	 */

	@RequestMapping("adminDash")
	public String showAdminDash() {
		return "adminDash";
	}

	@RequestMapping("addSuper")
	public String showSuper() {
		return "addSuper";
	}
	
	@RequestMapping("addAdminCase")
	public String addAdminCase() {
		return "addAdminCase";
	}
	
	/*
	 * @RequestMapping("viewAdminCases") public String viewAdminCases() { return
	 * "viewAdminCases"; }
	 */

	

	@RequestMapping("addOffi")
	public String addOffi() {
		return "addOffi";
	}

	@RequestMapping("addGuest")
	public String addGuest() {
		return "addGuest";
	}

	@RequestMapping("updateSuper")
	public String updatesuper() {
		return "updateSuper";
	}

	@RequestMapping(path = "/addSuper", method = RequestMethod.POST)
	public String addSupervisor(@ModelAttribute Supervisor supervisor) {
		regService.addSupervisor(supervisor);
		return "redirect:/viewSuper";
	}

	@RequestMapping(path = "/addOffi", method = RequestMethod.POST)
	public String addOfficer(@ModelAttribute Officer officer) {
		regService.addOfficer(officer);
		return "redirect:/viewOffi";

	}

	@RequestMapping(path = "/addGuest", method = RequestMethod.POST)
	public String addGuest(@ModelAttribute Guest guest) {
		regService.addGuest(guest);
		return "redirect:/viewGuest";

	}

	@RequestMapping(value = "/deleteoffi/{offi_id}", method = RequestMethod.GET)
	public String deleteOffi(@PathVariable int offi_id) {
		regService.deleteOffi(offi_id);
		return "redirect:/viewOffi";
	}

	@RequestMapping(value = "/deleteSuper/{super_id}", method = RequestMethod.GET)
	public String deleteSuper(@PathVariable int super_id) {
		regService.deleteSuper(super_id);
		return "redirect:/viewSuper";
	}

	@RequestMapping(value = "/deleteGuest/{g_id}", method = RequestMethod.GET)
	public String deleteGuest(@PathVariable int g_id) {
		regService.deleteGuest(g_id);
		return "redirect:/viewGuest";
	}

	@RequestMapping(value = "updateSuper/{super_id}")
	public String edit(@PathVariable int super_id, Model m) {
		Supervisor e = regService.getdata(super_id);
		m.addAttribute("command", e);
		return "updateSuper";
	}

	@RequestMapping(value = "/saveSuperUpdate", method = RequestMethod.POST)
	public String saveSuperUpdate(@ModelAttribute("supervisor") Supervisor supervisor) {
		regService.saveSuperUpdate(supervisor);
		return "redirect:/viewSuper";
	}

	/*----------------------------- SUPERVISOR DASH--------------------------- */

	@RequestMapping("supervisorDash")
	public String supervisorDash() {
		return "supervisorDash";
	}

	@RequestMapping("supervisorStatistics")
	public String supervisorStatistics() {
		return "supervisorStatistics";
	}



	/*----------Officer pages--------------- */

	@RequestMapping("officerDash")
	public String officerDash() {
		return "officerDash";
	}

	@RequestMapping("createcasefile")
	public String createcasefile() {
		return "createcasefile";
	}

	@RequestMapping("officerguestadd")
	public String officerguestadd() {
		return "officerguestadd";
	}

	@RequestMapping("trackingguest")
	public String trackingguest() {
		return "trackingguest";
	}
	
	@RequestMapping("updateCase")
	public String updateCase() {
		return "updateCase";
	}

	@RequestMapping(path = "/createCase")
	public String createCase(@ModelAttribute Cases cases) {
		regService.carateCase(cases);
		return "redirect:/viewCases";
	}
	
	@RequestMapping(value = "updateCase/{c_id}")
	public String editCase(@PathVariable int c_id, Model m) {
		Cases e = regService.getCasedata(c_id);
		System.out.println(e);
		m.addAttribute("command1", e);
		return "updateCase";
	}

	/*------------------------------ Guest Pages----------------------------------- */

	@RequestMapping("guestDash")
	public String guestDash() {
		return "guestDash";
	}

	@RequestMapping("guestmail")
	public String guestmail() {
		return "guestmail";
	}

	/*------------------------------ General User Pages----------------------------------- */

	@RequestMapping("genraluser")
	public String generaluser() {
		return "genraluser";
	}

	@RequestMapping("genraluserenquery")
	public String generaluserenquery() {
		return "genraluserenquery";
	}

	@RequestMapping("genratesheet")
	public String genratesheet() {
		return "genratesheet";
	}

	/* -----------------------Registration Pages----------------------- */

	@RequestMapping("successmsg")
	public String successmsg() {
		return "successmsg";
	}
	/*
	 * @RequestMapping(path = "/saveReg", method = RequestMethod.POST) public String
	 * saveRegistration(@ModelAttribute Registration registration) { //
	 * System.out.println(registration); regService.saveRegistration(registration);
	 * return "redirect:/showRigistration";
	 * 
	 * }
	 */

	@RequestMapping(value = "/saveRegi", method = RequestMethod.POST)
	public ModelAndView saveRegistration(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("registration") Registration registration) {
		ModelAndView mav = null;
		String s1 = registration.getUser();
		if (s1.contentEquals("Admin")) {
			regService.saveRegistration(registration);
			mav = new ModelAndView("successmsg");
		}

		if (s1.contentEquals("General_User")) {
			regService.saveGeneralUser(registration);
			mav = new ModelAndView("successmsg");
		}

		return mav;
	}

	/*--------------------- Fetched data from database------------------------------- */

	@RequestMapping("/showRigistration")
	public String showRegistration(Model model) {

		// call the Service method to get the data

		List<Registration> registrationList = regService.loadRegistration();
		model.addAttribute("Registrations", registrationList);

		return "registerd";
	}

	@RequestMapping("/viewSuper")
	public String showSupervisor(Model model) {

		List<Supervisor> supervisorList = regService.loadSupervisor();
		model.addAttribute("Supervisors", supervisorList);

		return "viewSuper";
	}

	@RequestMapping("/viewOffi")
	public String showOfficer(Model model) {

		List<Officer> officerList = regService.loadOfficer();
		model.addAttribute("Officers", officerList);

		return "viewOffi";

	}

	@RequestMapping("/viewGuest")
	public String showGuest(Model model) {

		List<Guest> guestList = regService.loadGuest();
		model.addAttribute("Guests", guestList);

		return "viewGuest";

	}

	@RequestMapping("/viewCases")
	public String showCases(Model model) {

		List<Cases> caseList = regService.loadCases();
		model.addAttribute("Cases", caseList);

		return "viewCases";

	}

	@RequestMapping("/viewoldcases")
	public String viewOldCasesmetho(Model model) {

		List<Cases> OcaseList = regService.loadoldCases();
		model.addAttribute("Cases", OcaseList);

		return "viewoldcases";

	}
	
	@RequestMapping("/viewAdminCases")
	public String viewAdminCases(Model model) {

		List<Cases> admincaseList = regService.loadAdminCases();
		model.addAttribute("Cases", admincaseList);

		return "viewAdminCases";

	}

}
