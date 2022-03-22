package com.offcn.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filename = request.getParameter("filename");
		
		response.setHeader("Content-Disposition", "attachment;filename="+
		new String(filename.getBytes("utf-8"),"iso8859-1"));
		
		InputStream iStream = getServletContext().getResourceAsStream("source/"+filename);
		ServletOutputStream outputStream = response.getOutputStream();
		byte[] bytes = new byte[1024];
		int len=-1;
		while ((len=iStream.read(bytes))!=-1) {
			outputStream.write(bytes, 0, len);
		}
		outputStream.close();
		iStream.close();
	}
}
