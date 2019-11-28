package com.webserver.core;

import java.io.InputStream;
import java.net.Socket;

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
			InputStream in = socket.getInputStream();
			int d = -1;
			char c1='a',c2='a';
			StringBuilder str = new StringBuilder();
			while ((d = in.read()) != -1) {
				c2 = (char)d;
				if (c1 == 13&&c2 == 10) {
					break;
				}
				c1 = c2;
				str.append(c1);
			}
			String line = str.toString().trim();
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
