package com.webserver.core;
/**
 * WebServer是模拟Tomcat的一个简单容器
 * 
 * web容器的职责有很多,主要有:
 * 1:与客户端(通常指浏览器)维持TCP连接
 *   以及基于HTTP协议的应用交互工作
 * 2:管理多个Webapp,每个webapp是一个网络应用
 *   它对应了包含如:网页,静态资源,业务代码(Java代码)
 *   等内容
 * @author QAIU
 *
 */

import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
	private ServerSocket server;
	public WebServer() {
		try {
			System.out.println("正在启动服务端...");
			server = new ServerSocket(8088);
			System.out.println("启动服务端完毕!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			//暂时不用接收多次客户端连接
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket = new Socket();
				socket = server.accept();
				System.out.println("一个客户端连接了!");
				//启动一个线程处理客户端交互
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		WebServer server = new WebServer();
		server.start();
	}
}
