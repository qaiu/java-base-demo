package com.webserver.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

import com.webserver.http.HttpRequest;

/**
 * �ͻ��˴�����
 * ���ฺ����ָ���Ŀͻ��˽���
 * ����HTTPЭ�����,�ͻ�������������������������:
 * 1.��������
 * 2.��������
 * 3.��Ӧ�ͻ���
 * @author QAIU
 *
 */
public class ClientHandler implements Runnable{
	private Socket socket;
	private OutputStream os;
	public ClientHandler(Socket socket) {
		this.socket=socket;
		try {
			os = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		try {
			System.out.println("ClientHandler:��ʼ����");
			//1��������
			System.out.println("ClientHandler:��ʼ��������");
			HttpRequest request = new HttpRequest(socket);
			System.out.println("ClientHandler:�����������!");
			//2��������
			
			
			//3��Ӧ�ͻ���
			
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");//�ַ�ת��������
			BufferedWriter bw = new BufferedWriter(osw);//���������
			PrintWriter pw = new PrintWriter(bw,true);
			try {
				FileInputStream fis = new FileInputStream("www"+request.getUri());
				InputStreamReader isr = new InputStreamReader(fis,"utf-8");
				BufferedReader br = new BufferedReader(isr);
				pw.println("HTTP/1.1 200 OK");
				pw.println("Content-Type:text/html;charset=utf-8");
				pw.println();
				String line = null;
				while ((line = br.readLine())!=null) {
					pw.println(line);
				}
				br.close();
				pw.close();
			} catch (FileNotFoundException e) {
				System.out.println("404�ļ�������");
				FileInputStream fis = new FileInputStream("www/404.html");
				InputStreamReader isr = new InputStreamReader(fis,"utf-8");
				BufferedReader br = new BufferedReader(isr);
				pw.println("HTTP/1.1 404 Not");
				pw.println("Content-Type:text/html;charset=utf-8");
				pw.println();
				String line = null;
				while ((line = br.readLine())!=null) {
					pw.println(line);
				}
				br.close();
				pw.close();
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			System.out.println("ClientHandler:�������");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
