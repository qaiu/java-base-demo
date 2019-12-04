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
 * 客户端处理器
 * 该类负责与指定的客户端交互
 * 对于HTTP协议而言,客户端与服务器交互有三部分组成:
 * 1.解析请求
 * 2.处理请求
 * 3.响应客户端
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
			System.out.println("ClientHandler:开始处理");
			//1解析请求
			System.out.println("ClientHandler:开始解析请求");
			HttpRequest request = new HttpRequest(socket);
			System.out.println("ClientHandler:解析请求完毕!");
			//2处理请求
			
			
			//3响应客户端
			
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");//字符转换输入流
			BufferedWriter bw = new BufferedWriter(osw);//缓冲输出流
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
				System.out.println("404文件不存在");
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
			
			
			System.out.println("ClientHandler:处理完毕");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
