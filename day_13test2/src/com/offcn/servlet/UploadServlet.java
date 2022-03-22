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
		 * �ϴ���Ŀ�ģ����� 1����ѡȡ���ϴ�ͼƬ�����浽һ���µ��ļ��У��洢�� 2���õ��ϴ����ļ����ƣ�
		 */
		/*
		 * Part���󣬾��Ǵ洢�ϴ��ļ����ݵĶ���
		 */
		Part part = request.getPart("photo");
		String filename = part.getSubmittedFileName();
		System.out.println(filename);
		// �ȹ���һ���ļ��У��洢�ϴ����ļ�
		String dirPath = "D:/1026Source";
		File file = new File(dirPath);
		// �ļ������ڣ���ȡ������
		if (!file.exists()) {
			file.mkdirs();
		}
		// ��Part�д洢���ϴ��ļ����ݣ�д�뵽�洢�ϴ����ݵ��ļ����У������ļ�
		part.write(dirPath + "/" + filename);
	}
}
