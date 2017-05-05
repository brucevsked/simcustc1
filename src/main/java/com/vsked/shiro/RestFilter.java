package com.vsked.shiro;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.HttpMethodPermissionFilter;

public class RestFilter extends HttpMethodPermissionFilter{
	
	private static final Logger log = Logger.getLogger(RestFilter.class);
			
	@Override
	public boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws IOException {
		HttpServletRequest req=(HttpServletRequest) request;
		log.debug("reqmethod|"+req.getMethod());
		log.debug("requrl|"+req.getRequestURI());
		String resourceFront=req.getRequestURI();
		String[] tmpArray=resourceFront.split("/");
		String permissionMethod=req.getMethod().toLowerCase();
		
		String permission=tmpArray[2]+":"+permissionMethod;
		log.debug(resourceFront);
		
		Subject subject = getSubject(request, response);
		
		log.debug("hasPermission|"+subject.isPermitted(permission));
		
		return subject.isPermitted(permission);
	}


}
