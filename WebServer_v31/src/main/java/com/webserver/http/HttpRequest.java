package com.webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * 请求对象
 * 该请求每一个实例用于表示客户端发送过来的一个请求内容
 * 每个请求由三部分组成:
 * 1:请求行
 * 2:消息头
 * 3:消息正文
 * 
 * 详情可参阅文档(http.txt)
 * @author QAIU
 *
 */
public class HttpRequest {

	//和连接相关的属性
	private Socket socket;
	private InputStream in;
	
	//请求行相关信息
	//请求方式
	private String method;
	//请求资源路径(url抽象部分)
	private String uri;
	public String getUri() {
		return uri;
	}

	//协议版本
	private String protocol;
	//消息头相关信息

	//消息正文相关信息
	/**
	 * HttpRequest的 构造方法,实例化的过程就是
	 * 读取客户端发送过的请求并解析的过程
	 * 实例化后的对象即表示此次发送过来的请求内容
	 */
	public HttpRequest(Socket socket) {
		try {
			//通过Socket获取输入流,以边下面
			//三个方法解析客户的请求时使用
			in= socket.getInputStream();
			/*
			 * 保存连接,但该Socket暂无其他作用
			 */
			this.socket = socket;

			/*
			 * 解析请求分成三步
			 * 1:解析请求行
			 * 2:解析消息头
			 * 3:解析消息正文
			 */
			parseRequestLine();
			parseHeaders();
			parseContent();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 解析请求行
	 */
	private void parseRequestLine() {
		System.out.println("HttpRequest:开始解析请求行...");
		try {
			String line = readline();
			System.out.println("请求行内容:"+line);
			String[] strings = line.split(" ");
			method = strings[0];
			uri = strings[1];
			protocol = strings[2];
			System.out.println("method:"+method);
			System.out.println("uri:"+uri);
			System.out.println("protocol:"+protocol);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpRequest:解析请求行完毕!");

	}

	/**
	 * 解析消息头
	 */
	private void parseHeaders() {
		System.out.println("HttpRequest:开始解析消息头...");
		try {
			while (true) {
				String line = readline();
				if ("".equals(line)) {
					break;
				}
				System.out.println(line);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpRequest:解析消息头完毕!");
	}

	/**
	 * 解析消息正文
	 */
	private void parseContent() {
		System.out.println("HttpRequest:开始解析消息正文...");

		System.out.println("HttpRequest:解析消息正文完毕!");
	}

	/**
	 * 通过in读取客户端发送过来的一行字符串
	 * 以(CRLF结尾),但是不包含CRLF
	 * 此方法在解析请求行和消息头时使用
	 * @return
	 * @throws IOException 
	 */
	private String readline() throws IOException {
		//首先读取客户端发送过来的第一行字符串
		//因为一个请求的第一行就是请求行内容
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
		return  str.toString().trim();
	}
}
