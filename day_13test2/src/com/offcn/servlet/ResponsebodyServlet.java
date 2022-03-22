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
				"				<th>姓名</th>\r\n" + 
				"				<th>性别</th>\r\n" + 
				"				<th>爱好</th>\r\n" + 
				"				<th>学历</th>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>周坤</td>\r\n" + 
				"				<td>女</td>\r\n" + 
				"				<td>看片</td>\r\n" + 
				"				<td>本科</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>王志恒</td>\r\n" + 
				"				<td>男</td>\r\n" + 
				"				<td>周坤</td>\r\n" + 
				"				<td>研究生</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>单小将</td>\r\n" + 
				"				<td>男</td>\r\n" + 
				"				<td>男</td>\r\n" + 
				"				<td>博士</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>张博</td>\r\n" + 
				"				<td>男</td>\r\n" + 
				"				<td>一起看片</td>\r\n" + 
				"				<td>本科</td>\r\n" + 
				"			</tr>\r\n" + 
				"		</table>\r\n" + 
				"	</body>\r\n" + 
				"</html>");
	}
}
