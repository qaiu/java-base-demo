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
				/*
				 * 将用户请求的该资源以标准的Http响应格式
				 * 发送回客户端
				 * 1:发送状态行
				 * 2:发送响应头
				 * 3:发送响应正文
				 */
				//通过Socket获取输出流,用于给客户端发送消息
				OutputStream out = socket.getOutputStream();
				//1.发送发送状态行
				String line = "HTTP/1.1 200 OK";
				out.write(line.getBytes("ISO8859-1"));
				os.write(13);
				os.write(10);
				//2.发送响应头
				/*
				 * 响应头中常见两个响应头
				 * Content-Type用于告诉浏览器正文中的内容是什么(比如
				 * 图片,页面),如果在响应头里什么也不指定,则让浏览器自性判定
				 * 那么浏览器会根据之前请求的地址来判定
				 * 
				 * Content-Length,告诉浏览器正文实际长度,单位字节,
				 * 浏览器读取实际长度后实际读取该字节量来接收正文内容
				 * 
				 */
				line = "Content-Type: text/html";
				out.write(line.getBytes("ISO8859-1"));
//				out.write(line.getBytes());

				out.write(13);
				out.write(10);
				
				line = "Content-Length:　"+file.length();
				out.write(line.getBytes("ISO8859-1"));
//				out.write(line.getBytes(""));

				out.write(13);
				out.write(10);
				
				//单独发送CRLF表示响应头发送完毕
				out.write(13);
				out.write(10);
				
				//3.发送响应正文
				FileInputStream fis = new FileInputStream(file);
				int len = -1;
				byte[] data = new byte[1024*10];
				while ((len = fis.read(data)) != -1) {
					out.write(data,0,len);
				}
				
				
			}else {
				System.out.println("文件不存在!");
			}
			//3响应客户端
			
			
			System.out.println("ClientHandler:处理完毕");
		} catch (Exception e) {
			// TODO: handle exception
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
