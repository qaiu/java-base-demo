package com.webserver.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 响应对象
 * 该类的每一个实例表示服务端给客户端发送的
 * 响应内容
 * 一个响应有三部分组成
 * 
 * 状态行
 * 响应头
 * 响应正文
 * @author QAIU
 *
 */
public class HttpResponse {
	//跟连接相关的信息
//	private Socket socket;
	private OutputStream out;
	
	//响应正文相关信息
	/**
	 * 响应正文的实体文件,该文件通常是用户请求的实际资源文件(页面图片等内容)
	 * 这里会将文件内容作为响应正文发送给客户端
	 */
	private File entity;

	// 状态行相关信息
	// 状态代码,默认值200,因为大多数响应都是成功的
	private int statusCode = 200;
	private String statusReason = "OK";


	//响应头相关信息
	//存放所有要发送的响应头,Key是响应头的名字,Value是响应头对应的值
	private Map<String, String> headers = new HashMap<>();
	


	//响应正文相关信息

	public HttpResponse(Socket socket) {
		try {
//			this.socket = socket;
			this.out = socket.getOutputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将当前响应对象的内容以标准HTTP格式
	 * 发送给客户端
	 */
	public void flush() {
		try {
			/*
			 * 发送I一个响应分成三步
			 * 1:发送状态行
			 * 2:发送响应头
			 * 3:发送响应正文
			 */
			System.out.println("HttpResponse:开始发送响应...");
			sendStatusLine();
			sendHandler();
			sendContent();
			System.out.println("HttpResponse:发送响应完毕!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 发送状态行
	 */
	private void sendStatusLine() {
		System.out.println("HttpResponse:开始发送状态行...");
		try {
			String line = "HTTP/1.1"+" "+statusCode+" "+statusReason;
			printLine(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpResponse:发送响应完毕!");
	}

	/**
	 * 发送响应头
	 */
	private void sendHandler() {
		System.out.println("HttpResponse:开始发送响应头...");
		try {
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
			Set<Entry<String,String>> set =headers.entrySet();
			for (Entry<String, String> e : set) {
				String name  = e.getKey();
				String value = e.getValue();
				String line = name+": "+value;
				System.out.println(line);
				printLine(line);
			}
			
			//单独发送CRLF表示响应头发送完毕
			printLine("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpResponse:发送响应头完毕!");
	}

	/**
	 * 发送响应正文
	 */
	private void sendContent() {
		System.out.println("HttpResponse:开始发送消息正文...");
		try(FileInputStream fis = new FileInputStream(entity);) {
			int len = -1;
			byte[] data = new byte[1024*10];
			while ((len = fis.read(data)) != -1) {
				out.write(data,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpResponse:发送消息正文完毕!");
	}
	/**
	 * 将给定的字符串发送给客户端发送后是CR,LF结束
	 * @param line
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	private void printLine(String line) throws UnsupportedEncodingException, IOException {
		out.write(line.getBytes("ISO8859-1"));
		out.write(HttpContext.CR);
		out.write(HttpContext.LF);
	}
	
	
	/**
	 * 获取响应正文
	 * @return entity
	 */
	public File getEntity() {
		return entity;
	}
	/**
	 * 设置正文文件,
	 * 设置的同时会根据文件类型自动设置两个对应的响应头
	 * Content-Type
	 * Content-Length
	 * @param entity
	 */
	public void setEntity(File entity) {
		this.entity = entity;

		//先获取资源文件名
		//logo.png
		//获取后缀名png 
		String fileName = entity.getName();
		String ext = fileName.substring(
				fileName.lastIndexOf(".")+1);
		String type = HttpContext.getContentType(ext);
		//设置响应头
		putHeader("Content-Type", type);
		putHeader("Content-Length", String.valueOf(entity.length()));
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	/**
	 * 添加要发送的响应头
	 * @param name 响应头的名字
	 * @param value 响应头对应的值
	 */
	public void putHeader(String name, String value) {
		headers.put(name, value);
	}

}
