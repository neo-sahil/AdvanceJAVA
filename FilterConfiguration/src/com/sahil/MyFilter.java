package com.sahil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;

public class MyFilter implements Filter {

    FilterConfig config;
    public void init(FilterConfig Config) throws ServletException {
		this.config=Config;
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String s1 = config.getInitParameter("const");
		
		
		if(s1.equals("yes"))
			out.println("This page is under construction");
		
		else
			chain.doFilter(request, response);
	}

	public void destroy() {
		
	}
	

}
