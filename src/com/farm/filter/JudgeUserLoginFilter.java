package com.farm.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;  

import org.apache.commons.lang.StringUtils;

public class JudgeUserLoginFilter implements Filter {

	private String unUrl;
	private List<String> unUrlList;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response; 
		String servletPath = req.getServletPath();
		chain.doFilter(request, response);   
	  
	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		unUrl = fConfig.getInitParameter("unUrl");
		if (StringUtils.isNotEmpty(unUrl)) {
			unUrlList = Arrays.asList(unUrl.split(","));
		}
		
	}

}
