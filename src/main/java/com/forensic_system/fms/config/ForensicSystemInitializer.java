package com.forensic_system.fms.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ForensicSystemInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] configFiles = {ForensicSystemConfig.class};
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		
		String[] mappings= {"/"};
		return mappings;
	}

}
