package com.webserver.servlet;

import java.io.RandomAccessFile;
import java.util.Arrays;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

/**
 * ���ڴ����û�ע��ҵ�����
 * @author QAIU
 *
 */
public class RegServlet extends HttpServlet{
	
	public void service(HttpRequest request,HttpResponse response) {
		/*
		 * 1:ͨ��request��ȡ�û��ύ��ע����Ϣ
		 * 2:�����û�д��user.dat�ļ�����
		 * 3:����response��Ӧע����ҳ��
		 */
		System.out.println("RegServlet:��ʼ����ע��ҵ��~~~");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		int age = Integer.parseInt(request.getParameter("age"));

		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("nickname:"+nickname);
		System.out.println("age:"+age);

		try (RandomAccessFile raf = new RandomAccessFile("user.dat","rw")){
			/* 
			 * ����Ӧ���ж��Ƿ�Ϊ�ظ��û�
			 * ѭ����ȡuser.dat�ļ��е���������
			 * ��ÿ�����ݶ��������жԱ�
			 * ������ظ��û�,��ֱ������response��Ӧ
			 * ���û�have_userҳ��
			 * ��֪�ļ��Ѵ���
			 * ���û�������ע�����
			 */

			for (int i = 0; i < raf.length()/100; i++) {
				byte[] data = new byte[32];
				raf.seek(i*100);
				raf.read(data);
				if (new String(data,"utf-8").trim().equals(username)) {
					forward("/myweb/have_user.html", request, response);
					return;
				}
			}

			raf.seek(raf.length());
			raf.write(Arrays.copyOf(username.getBytes("utf-8"), 32));
			raf.write(Arrays.copyOf(password.getBytes("utf-8"), 32));
			raf.write(Arrays.copyOf(nickname.getBytes("utf-8"), 32));
			raf.writeInt(age);
			System.out.println("ע�����!!");
			forward("/myweb/reg_success.html", request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * 2:
		 * ���û�ע����Ϣд��user.dat�ļ�
		 * һ���û���ռ��100�ֽ�
		 * �û���,����,�ǳƸ�ռ32�ֽ�
		 * ����intռ4�ֽ�
		 */

		System.out.println("RegServlet:����ע��ҵ�����");
	}
}
