package com.jbk.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("In get Servlet Method");
		
		return new Class[]{WebConfiguration.class,HibernateConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("In servlet Mapping");
		return new String[] {"/"};
	}

	
}
