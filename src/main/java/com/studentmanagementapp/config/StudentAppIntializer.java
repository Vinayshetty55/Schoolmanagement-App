package com.studentmanagementapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] configfiles = { StudentAppConfig.class };
		return configfiles;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mappings = { "/" };
		return mappings;
	}

	@Override
	protected String getServletName() {
		return "dispatcher";

	}

}
