package com.offcn.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowImageServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "image/jpg");
		
		InputStream istream = getServletContext().getResourceAsStream("source/img03.jpg");
		
		ServletOutputStream outputStream = response.getOutputStream();
		
		byte[] bytes = new byte[1024];
		int len = -1;
		while ((len = istream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, len);
		}
		outputStream.close();
		istream.close();
		
	}
}
