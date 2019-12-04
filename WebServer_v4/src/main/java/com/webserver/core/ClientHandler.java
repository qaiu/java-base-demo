package com.webserver.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
			//2.1根据请求对象,获取用户请求的资源路径
			System.out.println("开始处理请求");
			String path = request.getUri();
			System.out.println("path:"+path);
			System.out.println("处理请求完毕");
			
			//2.2:根据用户请求的资源路径去webapps下寻找对应的资源
			File file = new File("./webapps"+path);
			if (file.exists()) {
				System.out.println("文件已找到!");
			}else {
				System.out.println("文件不存在!");
			}
			//3响应客户端
			
			
			System.out.println("ClientHandler:处理完毕");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
