package com.offcn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResquestLineServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String scheme = request.getScheme();
		String protocol = request.getProtocol();
		String serverName = request.getServerName();
		int localPort = request.getLocalPort();
		String contextPath = request.getContextPath();
		String method = request.getMethod();
		String queryString = request.getQueryString();
		System.out.println(protocol);
		System.out.println(serverName);
		System.out.println(localPort);
		System.out.println(contextPath);
		System.out.println(method);
		System.out.println(queryString);
		System.out.println(“你号啊11111”);
	}
}
