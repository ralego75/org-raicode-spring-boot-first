package org.raicode.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FirstWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Class[] getRootConfigClasses() {
	    return new Class[] { RootConfig.class};
	}
	
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Class[] getServletConfigClasses() {
	    return new Class[] {WebConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
	    return new String[] {"/"};
	}

}
