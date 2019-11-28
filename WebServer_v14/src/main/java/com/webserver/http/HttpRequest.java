package com.webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Map;

import java.util.HashMap;
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
//	private Socket socket;
	private InputStream in;
	
	//请求行相关信息
	private Map<String, String> headers = new HashMap<>();
	//请求方式
	private String method;
	//请求资源路径(url抽象部分)
	private String uri;

	//协议版本
	private String protocol;
	//消息头相关信息
	
	private String requestURI;
	private String queryString;
	
	private Map<String, String> parameters = new HashMap<>();
	
	/**
	 * 提供获取请求相关的一系列GET方法
	 * 这里不提供SET方法,因为请求对象
	 * 表示的内容是客户端发送过来的内容
	 * 不需要修改
	 * @return
	 */
	public String getUri() {
		return uri;
	}
	
	public String getMethod() {
		return method;
	}

	public String getProtocol() {
		return protocol;
	}
	
	public String getHeader(String name) {
		return headers.get(name);
	}


	//消息正文相关信息
	/**
	 * HttpRequest的 构造方法,实例化的过程就是
	 * 读取客户端发送过的请求并解析的过程
	 * 实例化后的对象即表示此次发送过来的请求内容
	 * @throws EmptyRequestException 
	 */
	public HttpRequest(Socket socket) throws EmptyRequestException {
		try {
			//通过Socket获取输入流,以边下面
			//三个方法解析客户的请求时使用
			in= socket.getInputStream();
			/*
			 * 保存连接,但该Socket暂无其他作用
			 */
//			this.socket = socket;

			/*
			 * 解析请求分成三步
			 * 1:解析请求行
			 * 2:解析消息头
			 * 3:解析消息正文
			 */
			parseRequestLine();
			parseHeaders();
			parseContent();
		} catch (EmptyRequestException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 解析请求行
	 * @throws EmptyRequestException 
	 */
	private void parseRequestLine() throws EmptyRequestException {
		System.out.println("HttpRequest:开始解析请求行...");
		try {
			String line = readline();
			//是否空请求
			if ("".equals(line)) {
				throw new EmptyRequestException();
			}
			System.out.println("请求行内容:"+line);
			String[] strings = line.split(" ");
			method = strings[0];
			uri = strings[1];
			protocol = strings[2];
			System.out.println("method:"+method);
			System.out.println("uri:"+uri);
			System.out.println("protocol:"+protocol);
			//进一步解析URI
			parseURI();
		} catch (EmptyRequestException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpRequest:解析请求行完毕!");

	}
	/**
	 * 进一步解析URI
	 */
	private void parseURI() {
		System.out.println("HttpRequest:进一步解析!");
		/*
		 * uri的值会根据用户的不同请求有不同情况
		 * 含有参数和不含参数
		 * 
		 * 不含参数的情况:
		 * /myweb/index.html
		 * /myweb/logo.png
		 * 含有参数的情况
		 * /myweb/reg?username=xxx&password=xx....
		 * 
		 * 对于含有参数的情况,我们需要进一步解析URI
		 * 
		 * 实现思路
		 * 1:首先判断URI是否有参数(判断是否含有"?")
		 *   如果不含有参数,则直接将URI赋值给
		 *   RequestURI即可,其他无需处理
		 *   
		 * 2:如果含有参数
		 *   则先将URI按照"?"进行拆分为两个部分(请求部分和参数部分)
		 *   然后将请求部分赋值给RequestURI
		 *   参数部分赋值给queryString
		 * 3:进一步拆分queryString
		 *   将其按照"&"拆分为若干参数
		 *   每个参数按照"="拆分为参数名和参数值
		 *   将其作为Key和Value存到parameter这个Map里完成解析
		 */
		if (uri.indexOf('?') == -1) {
			requestURI = uri;
		}else {
			String[] data = uri.split("\\?");
			requestURI = data[0];
			if (data.length > 1) {
				queryString = data[1];
				data = queryString.split("&");
				for (String s : data) {
					String[] mapData = s.split("=");
					parameters.put(mapData[0], mapData.length>1?mapData[1]:"");
				}
			}
		}
		
		System.out.println("requestURI:"+requestURI);
		System.out.println("queryString:"+queryString);
		System.out.println("parameters:"+parameters);
		System.out.println("HttpRequest:进一步解析完毕!");
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
				/*
				 * 将每个消息头按照冒号空格拆分为两项
				 * 第一项作为Key,第二项作为value保存
				 * 到Handler这个属性完成消息头解析
				 */
				String[] data = line.split(": ");
				headers.put(data[0], data[1]);
			}
			System.out.println(headers);

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
			if (c1 == HttpContext.CR&&c2 == HttpContext.LF) {
				break;
			}
			c1 = c2;
			str.append(c1);
		}
		return  str.toString().trim();
	}

	public String getRequestURI() {
		return requestURI;
	}

	public String getQueryString() {
		return queryString;
	}
	
	public String getParameter(String name) {
		return parameters.get(name);
	}
	
}
