package com.offcn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponsebodyServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.write("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<meta charset=\"UTF-8\">\r\n" + 
				"		<title></title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<table width=\"600\" align=\"center\" border=\"\" cellspacing=\"0\" cellpadding=\"5\">\r\n" + 
				"			<tr>\r\n" + 
				"				<th>����</th>\r\n" + 
				"				<th>�Ա�</th>\r\n" + 
				"				<th>����</th>\r\n" + 
				"				<th>ѧ��</th>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>����</td>\r\n" + 
				"				<td>Ů</td>\r\n" + 
				"				<td>��Ƭ</td>\r\n" + 
				"				<td>����</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>��־��</td>\r\n" + 
				"				<td>��</td>\r\n" + 
				"				<td>����</td>\r\n" + 
				"				<td>�о���</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>��С��</td>\r\n" + 
				"				<td>��</td>\r\n" + 
				"				<td>��</td>\r\n" + 
				"				<td>��ʿ</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>�Ų�</td>\r\n" + 
				"				<td>��</td>\r\n" + 
				"				<td>һ��Ƭ</td>\r\n" + 
				"				<td>����</td>\r\n" + 
				"			</tr>\r\n" + 
				"		</table>\r\n" + 
				"	</body>\r\n" + 
				"</html>");
	}
}
