package com.webserver.core;

import java.io.File;
import java.net.Socket;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

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
	public ClientHandler(Socket socket) {
		this.socket=socket;
	}
	public void run() {
		try {
			System.out.println("ClientHandler:开始处理");
			//1解析请求
			System.out.println("ClientHandler:开始解析请求");
			HttpRequest request = new HttpRequest(socket);
			HttpResponse response = new HttpResponse(socket);
			System.out.println("ClientHandler:解析请求完毕!");
			//2处理请求
			//2.1根据请求对象,获取用户请求的资源路径
			System.out.println("开始处理请求");
			String path = request.getUri();
			System.out.println("path:"+path);
			System.out.println("处理请求完毕");
			
			//2.2:根据用户请求的资源路径去webapps下寻找对应的资源
			File file = new File("./webapps"+path);
			if (file.exists() && file.isFile()) {
				System.out.println("文件已找到:"+file.getName());
				//实例化响应对象
				response.setEntity(file);
			}else {
				File notFountPage = new File("./webapps/root/404.html");
				response.setStatusCode(404);
				response.setStatusReason("Not Fount");
				response.setEntity(notFountPage);		
			}
			//3响应客户端
			System.out.println("ClientHandler:开始发送响应!");
			response.flush();
			System.out.println("ClientHandler发送响应完毕!");
			
			
			System.out.println("ClientHandler:处理完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			/*
			 * 当响应完客户端连接后
			 * 与客户端断开连接
			 * 此操作是Http1.0协议的通信方式
			 * 后期如果改为可以在一次链接里做多次请求
			 * 与响应无需做这个操作
			 */
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}