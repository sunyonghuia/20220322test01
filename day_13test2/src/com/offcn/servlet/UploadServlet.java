package com.offcn.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@MultipartConfig
public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 上传的目的？？？ 1、将选取的上传图片，保存到一个新的文件中，存储！ 2、拿到上传的文件名称！
		 */
		/*
		 * Part对象，就是存储上传文件内容的对象
		 */
		Part part = request.getPart("photo");
		String filename = part.getSubmittedFileName();
		System.out.println(filename);
		// 先构建一个文件夹，存储上传的文件
		String dirPath = "D:/1026Source";
		File file = new File(dirPath);
		// 文件不存在，采取创建！
		if (!file.exists()) {
			file.mkdirs();
		}
		// 将Part中存储的上传文件内容，写入到存储上传内容的文件夹中，生成文件
		part.write(dirPath + "/" + filename);
	}
}
