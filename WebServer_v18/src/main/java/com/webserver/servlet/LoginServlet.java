package com.webserver.servlet;

import java.io.RandomAccessFile;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

/**
 * �����¼ҵ�����
 * @author QAIU
 *
 */
public class LoginServlet extends HttpServlet{
	public void service(HttpRequest request,HttpResponse response) {
		/*
		 * 1:ͨ��request��ȡ�û��ύ��ע����Ϣ
		 * 2:��ȡuser.dat�ļ����û������벢�ж�
		 * 3:����response��Ӧע����ҳ��
		 */
		try (RandomAccessFile raf = new RandomAccessFile("user.dat","rw")){
			/* 
			 * �����û������û�
			 * ����ж�ȡ�����ж������Ƿ���ȷ
			 */

			for (int i = 0; i < raf.length()/100; i++) {
				byte[] data = new byte[32];
				byte[] pw = new byte[32];
				raf.seek(i*100);
				raf.read(data);
				raf.read(pw);

				if (new String(data,"utf-8")
						.trim()
						.equals(request
						.getParameter("username"))&&
						new String(pw,"utf-8")
						.trim()
						.equals
						(request
						.getParameter("password"))) {
					forward("/myweb/login_success.html", request, response);
					return;
				}
			}
			forward("/myweb/login_fail.html", request, response);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("RegServlet:�����¼ҵ�����");
	}
}
