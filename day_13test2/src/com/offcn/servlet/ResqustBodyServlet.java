package com.offcn.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResqustBodyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sname = request.getParameter("sname");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String degree = request.getParameter("degree");
		String mark = request.getParameter("mark");
		
		System.out.println(sname);
		System.out.println(gender);
		System.out.println(Arrays.toString(hobby));
		System.out.println(degree);
		System.out.println(mark);
	}
}
